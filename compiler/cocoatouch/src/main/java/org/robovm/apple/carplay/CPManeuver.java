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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPManeuver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPManeuverPtr extends Ptr<CPManeuver, CPManeuverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPManeuver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPManeuver() {}
    protected CPManeuver(Handle h, long handle) { super(h, handle); }
    protected CPManeuver(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CPManeuver(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "symbolSet")
    public native CPImageSet getSymbolSet();
    @Property(selector = "setSymbolSet:")
    public native void setSymbolSet(CPImageSet v);
    @Property(selector = "junctionImage")
    public native UIImage getJunctionImage();
    @Property(selector = "setJunctionImage:")
    public native void setJunctionImage(UIImage v);
    @Property(selector = "instructionVariants")
    public native NSArray<NSString> getInstructionVariants();
    @Property(selector = "setInstructionVariants:")
    public native void setInstructionVariants(NSArray<NSString> v);
    @Property(selector = "initialTravelEstimates")
    public native CPTravelEstimates getInitialTravelEstimates();
    @Property(selector = "setInitialTravelEstimates:")
    public native void setInitialTravelEstimates(CPTravelEstimates v);
    @Property(selector = "attributedInstructionVariants")
    public native NSArray<NSAttributedString> getAttributedInstructionVariants();
    @Property(selector = "setAttributedInstructionVariants:")
    public native void setAttributedInstructionVariants(NSArray<NSAttributedString> v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
