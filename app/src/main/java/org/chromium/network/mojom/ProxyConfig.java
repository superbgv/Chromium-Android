
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/interfaces/proxy_config.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class ProxyConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean autoDetect;
    public org.chromium.url.mojom.Url pacUrl;
    public boolean pacMandatory;
    public ProxyRules proxyRules;
    public int source;
    public int id;

    private ProxyConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public ProxyConfig() {
        this(0);
    }

    public static ProxyConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ProxyConfig deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ProxyConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ProxyConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new ProxyConfig(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.autoDetect = decoder0.readBoolean(8, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.pacMandatory = decoder0.readBoolean(8, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.source = decoder0.readInt(12);
                    ProxyConfigSource.validate(result.source);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.pacUrl = org.chromium.url.mojom.Url.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.proxyRules = ProxyRules.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.id = decoder0.readInt(32);
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
        
        encoder0.encode(this.autoDetect, 8, 0);
        
        encoder0.encode(this.pacMandatory, 8, 1);
        
        encoder0.encode(this.source, 12);
        
        encoder0.encode(this.pacUrl, 16, false);
        
        encoder0.encode(this.proxyRules, 24, false);
        
        encoder0.encode(this.id, 32);
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
        ProxyConfig other = (ProxyConfig) object;
        if (this.autoDetect!= other.autoDetect)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.pacUrl, other.pacUrl))
            return false;
        if (this.pacMandatory!= other.pacMandatory)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.proxyRules, other.proxyRules))
            return false;
        if (this.source!= other.source)
            return false;
        if (this.id!= other.id)
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
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.autoDetect);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.pacUrl);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.pacMandatory);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.proxyRules);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.source);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.id);
        return result;
    }
}