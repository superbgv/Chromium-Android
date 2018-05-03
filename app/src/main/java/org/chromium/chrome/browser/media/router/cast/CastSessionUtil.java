// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.media.router.cast;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.RemoteMediaPlayer;

import org.chromium.chrome.browser.media.ui.MediaNotificationInfo;
import org.chromium.content_public.common.MediaMetadata;

/**
 * Helper class that implements functions useful to all CastSession types.
 */
public class CastSessionUtil {
    public static final String MEDIA_NAMESPACE = "urn:x-cast:com.google.cast.media";

    /**
     * Builds a MediaMetadata from the given CastDevice and MediaPlayer, and sets it on the builder
     */
    public static void setNotificationMetadata(MediaNotificationInfo.Builder builder,
            CastDevice castDevice, RemoteMediaPlayer mediaPlayer) {
        MediaMetadata notificationMetadata = new MediaMetadata("", "", "");
        builder.setMetadata(notificationMetadata);

        if (castDevice != null) notificationMetadata.setTitle(castDevice.getFriendlyName());

        if (mediaPlayer == null) return;

        com.google.android.gms.cast.MediaInfo info = mediaPlayer.getMediaInfo();
        if (info == null) return;

        com.google.android.gms.cast.MediaMetadata metadata = info.getMetadata();
        if (metadata == null) return;

        String title = metadata.getString(com.google.android.gms.cast.MediaMetadata.KEY_TITLE);
        if (title != null) notificationMetadata.setTitle(title);

        String artist = metadata.getString(com.google.android.gms.cast.MediaMetadata.KEY_ARTIST);
        if (artist == null) {
            artist = metadata.getString(com.google.android.gms.cast.MediaMetadata.KEY_ALBUM_ARTIST);
        }
        if (artist != null) notificationMetadata.setArtist(artist);

        String album =
                metadata.getString(com.google.android.gms.cast.MediaMetadata.KEY_ALBUM_TITLE);
        if (album != null) notificationMetadata.setAlbum(album);
    }
}
