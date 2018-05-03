
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/common/service_worker/service_worker_provider_type.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class ServiceWorkerProviderType {


    public static final int UNKNOWN = 0;

    public static final int FOR_WINDOW = UNKNOWN + 1;

    public static final int FOR_SHARED_WORKER = FOR_WINDOW + 1;

    public static final int FOR_SERVICE_WORKER = FOR_SHARED_WORKER + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private ServiceWorkerProviderType() {}

}