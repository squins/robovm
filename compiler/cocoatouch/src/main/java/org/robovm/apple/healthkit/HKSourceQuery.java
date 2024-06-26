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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKSourceQuery/*</name>*/ 
    extends /*<extends>*/HKQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKSourceQueryPtr extends Ptr<HKSourceQuery, HKSourceQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKSourceQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKSourceQuery() {}
    protected HKSourceQuery(Handle h, long handle) { super(h, handle); }
    protected HKSourceQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSampleType:samplePredicate:completionHandler:")
    public HKSourceQuery(HKSampleType sampleType, NSPredicate objectPredicate, @Block VoidBlock3<HKSourceQuery, NSSet<HKSource>, NSError> completionHandler) { super((SkipInit) null); initObject(init(sampleType, objectPredicate, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSampleType:samplePredicate:completionHandler:")
    protected native @Pointer long init(HKSampleType sampleType, NSPredicate objectPredicate, @Block VoidBlock3<HKSourceQuery, NSSet<HKSource>, NSError> completionHandler);
    /*</methods>*/
}
