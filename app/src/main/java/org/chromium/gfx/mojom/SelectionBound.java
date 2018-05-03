
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojo/selection_bound.mojom
//

package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class SelectionBound extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int type;
    public PointF edgeTop;
    public PointF edgeBottom;
    public boolean visible;

    private SelectionBound(int version) {
        super(STRUCT_SIZE, version);
    }

    public SelectionBound() {
        this(0);
    }

    public static SelectionBound deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SelectionBound deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SelectionBound decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SelectionBound result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new SelectionBound(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.type = decoder0.readInt(8);
                    SelectionBoundType.validate(result.type);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.visible = decoder0.readBoolean(12, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.edgeTop = PointF.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.edgeBottom = PointF.decode(decoder1);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.type, 8);
        
        encoder0.encode(this.visible, 12, 0);
        
        encoder0.encode(this.edgeTop, 16, false);
        
        encoder0.encode(this.edgeBottom, 24, false);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        SelectionBound other = (SelectionBound) object;
        if (this.type!= other.type)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.edgeTop, other.edgeTop))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.edgeBottom, other.edgeBottom))
            return false;
        if (this.visible!= other.visible)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.type);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.edgeTop);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.edgeBottom);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.visible);
        return result;
    }
}