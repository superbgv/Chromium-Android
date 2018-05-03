
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/audio_output_stream.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class AudioOutputStreamProvider_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AudioOutputStreamProvider, AudioOutputStreamProvider.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AudioOutputStreamProvider, AudioOutputStreamProvider.Proxy>() {
    
        @Override
        public String getName() {
            return "media::mojom::AudioOutputStreamProvider";
        }
    
        @Override
        public int getVersion() {
          return 0;
        }
    
        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, AudioOutputStreamProvider impl) {
            return new Stub(core, impl);
        }
    
        @Override
        public AudioOutputStreamProvider[] buildArray(int size) {
          return new AudioOutputStreamProvider[size];
        }
    };


    private static final int ACQUIRE_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AudioOutputStreamProvider.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void acquire(
org.chromium.mojo.bindings.InterfaceRequest<AudioOutputStream> outputStream, AudioOutputStreamClient client, AudioParameters params, 
AcquireResponse callback) {

            AudioOutputStreamProviderAcquireParams _message = new AudioOutputStreamProviderAcquireParams();

            _message.outputStream = outputStream;

            _message.client = client;

            _message.params = params;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ACQUIRE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new AudioOutputStreamProviderAcquireResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AudioOutputStreamProvider> {

        Stub(org.chromium.mojo.system.Core core, AudioOutputStreamProvider impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                AudioOutputStreamProvider_Internal.MANAGER, messageWithHeader);
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), AudioOutputStreamProvider_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
                    case ACQUIRE_ORDINAL: {
            
                        AudioOutputStreamProviderAcquireParams data =
                                AudioOutputStreamProviderAcquireParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().acquire(data.outputStream, data.client, data.params, new AudioOutputStreamProviderAcquireResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class AudioOutputStreamProviderAcquireParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<AudioOutputStream> outputStream;
        public AudioOutputStreamClient client;
        public AudioParameters params;
    
        private AudioOutputStreamProviderAcquireParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public AudioOutputStreamProviderAcquireParams() {
            this(0);
        }
    
        public static AudioOutputStreamProviderAcquireParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioOutputStreamProviderAcquireParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static AudioOutputStreamProviderAcquireParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioOutputStreamProviderAcquireParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new AudioOutputStreamProviderAcquireParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.outputStream = decoder0.readInterfaceRequest(8, false);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.client = decoder0.readServiceInterface(12, false, AudioOutputStreamClient.MANAGER);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.params = AudioParameters.decode(decoder1);
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
            
            encoder0.encode(this.outputStream, 8, false);
            
            encoder0.encode(this.client, 12, false, AudioOutputStreamClient.MANAGER);
            
            encoder0.encode(this.params, 24, false);
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
            AudioOutputStreamProviderAcquireParams other = (AudioOutputStreamProviderAcquireParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.outputStream, other.outputStream))
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.client, other.client))
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.params, other.params))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.outputStream);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.client);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.params);
            return result;
        }
    }



    
    static final class AudioOutputStreamProviderAcquireResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.system.SharedBufferHandle sharedBuffer;
        public org.chromium.mojo.system.UntypedHandle socketDescriptor;
    
        private AudioOutputStreamProviderAcquireResponseParams(int version) {
            super(STRUCT_SIZE, version);
            this.sharedBuffer = org.chromium.mojo.system.InvalidHandle.INSTANCE;
            this.socketDescriptor = org.chromium.mojo.system.InvalidHandle.INSTANCE;
        }
    
        public AudioOutputStreamProviderAcquireResponseParams() {
            this(0);
        }
    
        public static AudioOutputStreamProviderAcquireResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioOutputStreamProviderAcquireResponseParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static AudioOutputStreamProviderAcquireResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioOutputStreamProviderAcquireResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new AudioOutputStreamProviderAcquireResponseParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.sharedBuffer = decoder0.readSharedBufferHandle(8, false);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.socketDescriptor = decoder0.readUntypedHandle(12, false);
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
            
            encoder0.encode(this.sharedBuffer, 8, false);
            
            encoder0.encode(this.socketDescriptor, 12, false);
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
            AudioOutputStreamProviderAcquireResponseParams other = (AudioOutputStreamProviderAcquireResponseParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.sharedBuffer, other.sharedBuffer))
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.socketDescriptor, other.socketDescriptor))
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
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.sharedBuffer);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.socketDescriptor);
            return result;
        }
    }

    static class AudioOutputStreamProviderAcquireResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final AudioOutputStreamProvider.AcquireResponse mCallback;

        AudioOutputStreamProviderAcquireResponseParamsForwardToCallback(AudioOutputStreamProvider.AcquireResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(ACQUIRE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                AudioOutputStreamProviderAcquireResponseParams response = AudioOutputStreamProviderAcquireResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.sharedBuffer, response.socketDescriptor);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class AudioOutputStreamProviderAcquireResponseParamsProxyToResponder implements AudioOutputStreamProvider.AcquireResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AudioOutputStreamProviderAcquireResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(org.chromium.mojo.system.SharedBufferHandle sharedBuffer, org.chromium.mojo.system.UntypedHandle socketDescriptor) {
            AudioOutputStreamProviderAcquireResponseParams _response = new AudioOutputStreamProviderAcquireResponseParams();

            _response.sharedBuffer = sharedBuffer;

            _response.socketDescriptor = socketDescriptor;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ACQUIRE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
