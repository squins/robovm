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
package org.robovm.apple.metrickit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXSignpostIntervalData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MXSignpostIntervalDataPtr extends Ptr<MXSignpostIntervalData, MXSignpostIntervalDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXSignpostIntervalData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXSignpostIntervalData() {}
    protected MXSignpostIntervalData(Handle h, long handle) { super(h, handle); }
    protected MXSignpostIntervalData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MXSignpostIntervalData(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "histogrammedSignpostDuration")
    public native MXHistogram<NSUnitDuration> getHistogrammedSignpostDuration();
    @Property(selector = "cumulativeCPUTime")
    public native NSMeasurement<NSUnitDuration> getCumulativeCPUTime();
    @Property(selector = "averageMemory")
    public native MXAverage<NSUnitInformationStorage> getAverageMemory();
    @Property(selector = "cumulativeLogicalWrites")
    public native NSMeasurement<NSUnitInformationStorage> getCumulativeLogicalWrites();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "cumulativeHitchTimeRatio")
    public native NSMeasurement<NSUnit> getCumulativeHitchTimeRatio();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
