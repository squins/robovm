/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.security;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Security")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SSLContext/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SSLContextPtr extends Ptr<SSLContext, SSLContextPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(SSLContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SSLContext() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static SSLContext create(SSLProtocolSide protocolSide, SSLConnectionType connectionType) {
        return create0(null, protocolSide, connectionType);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public SSLSessionState getSessionState() throws OSStatusException {
        IntPtr ptr = new IntPtr();
        OSStatus status = getSessionState0(ptr);
        OSStatusException.throwIfNecessary(status);
        return SSLSessionState.valueOf(ptr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setSessionOption(SSLSessionOption option, boolean value) throws OSStatusException {
        OSStatus status = setSessionOption0(option, value);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public boolean getSessionOption(SSLSessionOption option) throws OSStatusException {
        BooleanPtr ptr = new BooleanPtr();
        OSStatus status = getSessionOption0(option, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    
//    /**
//     * @since Available in iOS 5.0 and later.
//     */
//    public void setIOFunctions0(FunctionPtr readFunc, FunctionPtr writeFunc); TODO
    
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setMinProtocolVersion(SSLProtocol minVersion) throws OSStatusException {
        OSStatus status = setMinProtocolVersion0(minVersion);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public SSLProtocol getMinProtocolVersion() throws OSStatusException {
        IntPtr ptr = new IntPtr();
        OSStatus status = getMinProtocolVersion0(ptr);
        OSStatusException.throwIfNecessary(status);
        return SSLProtocol.valueOf(ptr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setMaxProtocolVersion(SSLProtocol maxVersion) throws OSStatusException {
        OSStatus status = setMaxProtocolVersion0(maxVersion);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public SSLProtocol getMaxProtocolVersion() throws OSStatusException {
        IntPtr ptr = new IntPtr();
        OSStatus status = getMaxProtocolVersion0(ptr);
        OSStatusException.throwIfNecessary(status);
        return SSLProtocol.valueOf(ptr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setCertificate(SecIdentity identity, SecCertificate...certificates) throws OSStatusException {
        CFArray arr = CFMutableArray.create();
        arr.add(identity);
        for (SecCertificate certificate : certificates) {
            arr.add(certificate);
        }
        OSStatus status =  setCertificate0(arr);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setEncryptionCertificate(SecIdentity identity, SecCertificate...certificates) throws OSStatusException {
        CFArray arr = CFMutableArray.create();
        arr.add(identity);
        for (SecCertificate certificate : certificates) {
            arr.add(certificate);
        }
        OSStatus status = setEncryptionCertificate0(arr);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setConnection(VoidPtr connection) throws OSStatusException {
        OSStatus status = setConnection0(connection);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public VoidPtr getConnection() throws OSStatusException {
        VoidPtr.VoidPtrPtr ptr = new VoidPtr.VoidPtrPtr();
        OSStatus status = getConnection0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setPeerDomainName(String peerName) throws OSStatusException {
        byte[] bytes = peerName.getBytes();
        int length = bytes.length;
        long handle = VM.malloc(length + 1);
        VM.memcpy(handle, VM.getArrayValuesAddress(bytes), length);
        OSStatus status = setPeerDomainName0(handle, length);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public String getPeerDomainName() throws OSStatusException {
        BytePtr peerNamePtr = new BytePtr();
        MachineSizedUIntPtr peerNameLenPtr = new MachineSizedUIntPtr();
        OSStatus status = getPeerDomainName0(peerNamePtr, peerNameLenPtr);
        OSStatusException.throwIfNecessary(status);
        return peerNamePtr.toStringZ();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setDatagramHelloCookie(byte[] cookie) throws OSStatusException {
        OSStatus status = setDatagramHelloCookie0(VM.getArrayValuesAddress(cookie), cookie.length);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setMaxDatagramRecordSize(long maxSize) throws OSStatusException {
        OSStatus status = setMaxDatagramRecordSize0(maxSize);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public long getMaxDatagramRecordSize() throws OSStatusException {
        MachineSizedUIntPtr ptr = new MachineSizedUIntPtr();
        OSStatus status = getMaxDatagramRecordSize0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public SSLProtocol getNegotiatedProtocolVersion() throws OSStatusException {
        IntPtr ptr = new IntPtr();
        OSStatus status = getNegotiatedProtocolVersion0(ptr);
        OSStatusException.throwIfNecessary(status);
        return SSLProtocol.valueOf(ptr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public long getNumberSupportedCiphers() throws OSStatusException {
        MachineSizedUIntPtr ptr = new MachineSizedUIntPtr();
        OSStatus status = getNumberSupportedCiphers0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public short[] getSupportedCiphers() throws OSStatusException {
        ShortPtr ciphersPtr = new ShortPtr();
        MachineSizedUIntPtr numCiphersPtr = new MachineSizedUIntPtr();
        OSStatus status = getSupportedCiphers0(ciphersPtr, numCiphersPtr);
        OSStatusException.throwIfNecessary(status);
        return ciphersPtr.toShortArray((int)numCiphersPtr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setEnabledCiphers(short[] ciphers) throws OSStatusException {
        OSStatus status = setEnabledCiphers0(VM.getArrayValuesAddress(ciphers), ciphers.length);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public long getNumberEnabledCiphers() throws OSStatusException {
        MachineSizedUIntPtr ptr = new MachineSizedUIntPtr();
        OSStatus status = getNumberEnabledCiphers0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public short[] getEnabledCiphers() throws OSStatusException {
        ShortPtr ciphersPtr = new ShortPtr();
        MachineSizedUIntPtr numCiphersPtr = new MachineSizedUIntPtr();
        OSStatus status = getEnabledCiphers0(ciphersPtr, numCiphersPtr);
        OSStatusException.throwIfNecessary(status);
        return ciphersPtr.toShortArray((int)numCiphersPtr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public SecTrust getPeerTrust() throws OSStatusException {
        SecTrust.SecTrustPtr ptr = new SecTrust.SecTrustPtr();
        OSStatus status = getPeerTrust0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setPeerID(String peerID) throws OSStatusException {
        byte[] bytes = peerID.getBytes();
        int length = bytes.length;
        long handle = VM.malloc(length + 1);
        VM.memcpy(handle, VM.getArrayValuesAddress(bytes), length);
        OSStatus status = setPeerID0(handle, length);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public String getPeerID() throws OSStatusException {
        BytePtr.BytePtrPtr peerIDPtr = new BytePtr.BytePtrPtr();
        MachineSizedUIntPtr peerIDLenPtr = new MachineSizedUIntPtr();
        OSStatus status = getPeerID0(peerIDPtr, peerIDLenPtr);
        OSStatusException.throwIfNecessary(status);
        return peerIDPtr.get().toStringZ();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public short getNegotiatedCipher() throws OSStatusException {
        ShortPtr ptr = new ShortPtr();
        OSStatus status = getNegotiatedCipher0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void setClientSideAuthenticate(SSLAuthenticate auth) throws OSStatusException {
        OSStatus status = setClientSideAuthenticate0(auth);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void addDistinguishedName(NSData derDN) throws OSStatusException {
        if (derDN == null) {
            throw new NullPointerException("derDN");
        }
        OSStatus status = addDistinguishedName0(VM.getArrayValuesAddress(derDN.getBytes()), derDN.getLength());
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public NSArray<NSData> getDistinguishedNames() throws OSStatusException {
        NSArray.NSArrayPtr<NSData> ptr = new NSArray.NSArrayPtr<NSData>();
        OSStatus status = getDistinguishedNames0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public SSLClientCertificateState getClientCertificateState() throws OSStatusException {
        IntPtr ptr = new IntPtr();
        OSStatus status = getClientCertificateState0(ptr);
        OSStatusException.throwIfNecessary(status);
        return SSLClientCertificateState.valueOf(ptr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void handshake() throws OSStatusException {
        OSStatus status = handshake0();
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public long write(byte[] data) throws OSStatusException {
        MachineSizedUIntPtr ptr = new MachineSizedUIntPtr();
        OSStatus status = write0(VM.getArrayValuesAddress(data), data.length, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public byte[] read(int dataLength) throws OSStatusException {
        BytePtr dataPtr = Struct.allocate(BytePtr.class, dataLength);
        MachineSizedUIntPtr processedPtr = new MachineSizedUIntPtr();
        OSStatus status = read0(dataPtr, dataLength, processedPtr);
        OSStatusException.throwIfNecessary(status);
        return dataPtr.toByteArray((int)processedPtr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public int getBufferedReadSize() throws OSStatusException {
        MachineSizedUIntPtr ptr = new MachineSizedUIntPtr();
        OSStatus status = getBufferedReadSize0(ptr);
        OSStatusException.throwIfNecessary(status);
        return (int)ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public int getDatagramWriteSize() throws OSStatusException {
        MachineSizedUIntPtr ptr = new MachineSizedUIntPtr();
        OSStatus status = getDatagramWriteSize0(ptr);
        OSStatusException.throwIfNecessary(status);
        return (int)ptr.get();
    } 
    /**
     * @throws OSStatusException 
     * @since Available in iOS 5.0 and later.
     */
    public void closeContext() throws OSStatusException {
        OSStatus status = closeContext0();
        OSStatusException.throwIfNecessary(status);
    }
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_default", optional=true)
    public static native String kSSLSessionConfig_default();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_ATSv1", optional=true)
    public static native String kSSLSessionConfig_ATSv1();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_ATSv1_noPFS", optional=true)
    public static native String kSSLSessionConfig_ATSv1_noPFS();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_standard", optional=true)
    public static native String kSSLSessionConfig_standard();
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_RC4_fallback", optional=true)
    public static native String kSSLSessionConfig_RC4_fallback();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_TLSv1_fallback", optional=true)
    public static native String kSSLSessionConfig_TLSv1_fallback();
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_TLSv1_RC4_fallback", optional=true)
    public static native String kSSLSessionConfig_TLSv1_RC4_fallback();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_legacy", optional=true)
    public static native String kSSLSessionConfig_legacy();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_legacy_DHE", optional=true)
    public static native String kSSLSessionConfig_legacy_DHE();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_anonymous", optional=true)
    public static native String kSSLSessionConfig_anonymous();
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_3DES_fallback", optional=true)
    public static native String kSSLSessionConfig_3DES_fallback();
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @GlobalValue(symbol="kSSLSessionConfig_TLSv1_3DES_fallback", optional=true)
    public static native String kSSLSessionConfig_TLSv1_3DES_fallback();
    
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLContextGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLCreateContext", optional=true)
    protected static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) SSLContext create0(CFAllocator alloc, SSLProtocolSide protocolSide, SSLConnectionType connectionType);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetSessionState", optional=true)
    protected native OSStatus getSessionState0(IntPtr state);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetSessionOption", optional=true)
    protected native OSStatus setSessionOption0(SSLSessionOption option, boolean value);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetSessionOption", optional=true)
    protected native OSStatus getSessionOption0(SSLSessionOption option, BooleanPtr value);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetIOFuncs", optional=true)
    protected native OSStatus setIOFunctions0(FunctionPtr readFunc, FunctionPtr writeFunc);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetSessionConfig", optional=true)
    protected native OSStatus setSessionConfig0(String config);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetProtocolVersionMin", optional=true)
    protected native OSStatus setMinProtocolVersion0(SSLProtocol minVersion);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetProtocolVersionMin", optional=true)
    protected native OSStatus getMinProtocolVersion0(IntPtr minVersion);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetProtocolVersionMax", optional=true)
    protected native OSStatus setMaxProtocolVersion0(SSLProtocol maxVersion);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetProtocolVersionMax", optional=true)
    protected native OSStatus getMaxProtocolVersion0(IntPtr maxVersion);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetCertificate", optional=true)
    protected native OSStatus setCertificate0(CFArray certRefs);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetConnection", optional=true)
    protected native OSStatus setConnection0(VoidPtr connection);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetConnection", optional=true)
    protected native OSStatus getConnection0(VoidPtr.VoidPtrPtr connection);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetPeerDomainName", optional=true)
    protected native OSStatus setPeerDomainName0(@Pointer long peerName, @MachineSizedUInt long peerNameLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetPeerDomainNameLength", optional=true)
    protected native OSStatus getPeerDomainNameLength0(MachineSizedUIntPtr peerNameLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetPeerDomainName", optional=true)
    protected native OSStatus getPeerDomainName0(BytePtr peerName, MachineSizedUIntPtr peerNameLen);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLCopyRequestedPeerNameLength", optional=true)
    protected native OSStatus copyRequestedPeerNameLength0(MachineSizedUIntPtr peerNameLen);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLCopyRequestedPeerName", optional=true)
    protected native OSStatus copyRequestedPeerName0(BytePtr peerName, MachineSizedUIntPtr peerNameLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetDatagramHelloCookie", optional=true)
    protected native OSStatus setDatagramHelloCookie0(@Pointer long cookie, @MachineSizedUInt long cookieLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetMaxDatagramRecordSize", optional=true)
    protected native OSStatus setMaxDatagramRecordSize0(@MachineSizedUInt long maxSize);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetMaxDatagramRecordSize", optional=true)
    protected native OSStatus getMaxDatagramRecordSize0(MachineSizedUIntPtr maxSize);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetNegotiatedProtocolVersion", optional=true)
    protected native OSStatus getNegotiatedProtocolVersion0(IntPtr protocol);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetNumberSupportedCiphers", optional=true)
    protected native OSStatus getNumberSupportedCiphers0(MachineSizedUIntPtr numCiphers);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetSupportedCiphers", optional=true)
    protected native OSStatus getSupportedCiphers0(ShortPtr ciphers, MachineSizedUIntPtr numCiphers);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetNumberEnabledCiphers", optional=true)
    protected native OSStatus getNumberEnabledCiphers0(MachineSizedUIntPtr numCiphers);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetEnabledCiphers", optional=true)
    protected native OSStatus setEnabledCiphers0(@Pointer long ciphers, @MachineSizedUInt long numCiphers);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetEnabledCiphers", optional=true)
    protected native OSStatus getEnabledCiphers0(ShortPtr ciphers, MachineSizedUIntPtr numCiphers);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetSessionTicketsEnabled", optional=true)
    protected native OSStatus setSessionTicketsEnabled0(boolean enabled);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLCopyPeerTrust", optional=true)
    protected native OSStatus getPeerTrust0(SecTrust.SecTrustPtr trust);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetPeerID", optional=true)
    protected native OSStatus setPeerID0(@Pointer long peerID, @MachineSizedUInt long peerIDLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetPeerID", optional=true)
    protected native OSStatus getPeerID0(BytePtr.BytePtrPtr peerID, MachineSizedUIntPtr peerIDLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetNegotiatedCipher", optional=true)
    protected native OSStatus getNegotiatedCipher0(ShortPtr cipherSuite);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetALPNProtocols", optional=true)
    protected native OSStatus setALPNProtocols0(NSArray protocols);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLCopyALPNProtocols", optional=true)
    protected native OSStatus getALPNProtocols0(NSArray.NSArrayPtr<NSData> protocols);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetOCSPResponse", optional=true)
    protected native OSStatus setOCSPResponse0(NSData response);
    /**
     * @deprecated Deprecated in iOS 9.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetEncryptionCertificate", optional=true)
    protected native OSStatus setEncryptionCertificate0(CFArray certRefs);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetClientSideAuthenticate", optional=true)
    protected native OSStatus setClientSideAuthenticate0(SSLAuthenticate auth);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLAddDistinguishedName", optional=true)
    protected native OSStatus addDistinguishedName0(@Pointer long derDN, @MachineSizedUInt long derDNLen);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLCopyDistinguishedNames", optional=true)
    protected native OSStatus getDistinguishedNames0(NSArray.NSArrayPtr<NSData> names);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetClientCertificateState", optional=true)
    protected native OSStatus getClientCertificateState0(IntPtr clientState);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLHandshake", optional=true)
    protected native OSStatus handshake0();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLReHandshake", optional=true)
    protected native OSStatus reHandshake0();
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLWrite", optional=true)
    protected native OSStatus write0(@Pointer long data, @MachineSizedUInt long dataLength, MachineSizedUIntPtr processed);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLRead", optional=true)
    protected native OSStatus read0(BytePtr data, @MachineSizedUInt long dataLength, MachineSizedUIntPtr processed);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetBufferedReadSize", optional=true)
    protected native OSStatus getBufferedReadSize0(MachineSizedUIntPtr bufferSize);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLGetDatagramWriteSize", optional=true)
    protected native OSStatus getDatagramWriteSize0(MachineSizedUIntPtr bufSize);
    /**
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLClose", optional=true)
    protected native OSStatus closeContext0();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported. Use Network.framework.
     */
    @Deprecated
    @Bridge(symbol="SSLSetError", optional=true)
    protected native OSStatus setError0(OSStatus status);
    /*</methods>*/
}
