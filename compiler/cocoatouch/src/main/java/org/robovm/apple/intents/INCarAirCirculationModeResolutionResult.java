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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 15.0. INCarAirCirculationModeResolutionResult is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCarAirCirculationModeResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INCarAirCirculationModeResolutionResultPtr extends Ptr<INCarAirCirculationModeResolutionResult, INCarAirCirculationModeResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCarAirCirculationModeResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INCarAirCirculationModeResolutionResult() {}
    protected INCarAirCirculationModeResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INCarAirCirculationModeResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedCarAirCirculationMode:")
    public static native INCarAirCirculationModeResolutionResult success(INCarAirCirculationMode resolvedCarAirCirculationMode);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedCarAirCirculationMode:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INCarAirCirculationModeResolutionResult successValue(INCarAirCirculationMode resolvedValue);
    @Method(selector = "confirmationRequiredWithCarAirCirculationModeToConfirm:")
    public static native INCarAirCirculationModeResolutionResult confirmationRequired(INCarAirCirculationMode carAirCirculationModeToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithCarAirCirculationModeToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INCarAirCirculationModeResolutionResult confirmationRequiredForValue(INCarAirCirculationMode valueToConfirm);
    @Method(selector = "needsValue")
    public static native INCarAirCirculationModeResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INCarAirCirculationModeResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INCarAirCirculationModeResolutionResult unsupported();
    /*</methods>*/
}
