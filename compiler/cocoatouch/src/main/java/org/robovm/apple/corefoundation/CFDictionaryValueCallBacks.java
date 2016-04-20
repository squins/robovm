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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*//*</visibility>*/ class /*<name>*/CFDictionaryValueCallBacks/*</name>*/ 
    extends /*<extends>*/Struct<CFDictionaryValueCallBacks>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFDictionaryValueCallBacksPtr extends Ptr<CFDictionaryValueCallBacks, CFDictionaryValueCallBacksPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CFDictionaryValueCallBacks() {}
    public CFDictionaryValueCallBacks(@MachineSizedSInt long version, FunctionPtr retain, FunctionPtr release, FunctionPtr copyDescription, FunctionPtr equal) {
        this.setVersion(version);
        this.setRetain(retain);
        this.setRelease(release);
        this.setCopyDescription(copyDescription);
        this.setEqual(equal);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedSInt long getVersion();
    @StructMember(0) public native CFDictionaryValueCallBacks setVersion(@MachineSizedSInt long version);
    @StructMember(1) public native FunctionPtr getRetain();
    @StructMember(1) public native CFDictionaryValueCallBacks setRetain(FunctionPtr retain);
    @StructMember(2) public native FunctionPtr getRelease();
    @StructMember(2) public native CFDictionaryValueCallBacks setRelease(FunctionPtr release);
    @StructMember(3) public native FunctionPtr getCopyDescription();
    @StructMember(3) public native CFDictionaryValueCallBacks setCopyDescription(FunctionPtr copyDescription);
    @StructMember(4) public native FunctionPtr getEqual();
    @StructMember(4) public native CFDictionaryValueCallBacks setEqual(FunctionPtr equal);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
