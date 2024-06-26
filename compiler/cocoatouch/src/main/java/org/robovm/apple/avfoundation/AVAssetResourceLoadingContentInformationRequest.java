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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetResourceLoadingContentInformationRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetResourceLoadingContentInformationRequestPtr extends Ptr<AVAssetResourceLoadingContentInformationRequest, AVAssetResourceLoadingContentInformationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetResourceLoadingContentInformationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetResourceLoadingContentInformationRequest() {}
    protected AVAssetResourceLoadingContentInformationRequest(Handle h, long handle) { super(h, handle); }
    protected AVAssetResourceLoadingContentInformationRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentType")
    public native String getContentType();
    @Property(selector = "setContentType:")
    public native void setContentType(String v);
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "allowedContentTypes")
    public native NSArray<NSString> getAllowedContentTypes();
    @Property(selector = "contentLength")
    public native long getContentLength();
    @Property(selector = "setContentLength:")
    public native void setContentLength(long v);
    @Property(selector = "isByteRangeAccessSupported")
    public native boolean isByteRangeAccessSupported();
    @Property(selector = "setByteRangeAccessSupported:")
    public native void setByteRangeAccessSupported(boolean v);
    @Property(selector = "renewalDate")
    public native NSDate getRenewalDate();
    @Property(selector = "setRenewalDate:")
    public native void setRenewalDate(NSDate v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isEntireLengthAvailableOnDemand")
    public native boolean isEntireLengthAvailableOnDemand();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setEntireLengthAvailableOnDemand:")
    public native void setEntireLengthAvailableOnDemand(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
