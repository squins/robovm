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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsLongMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSActivityOptions/*</name>*/ extends Bits</*<name>*/NSActivityOptions/*</name>*/> {
    /*<values>*/
    public static final NSActivityOptions None = new NSActivityOptions(0L);
    public static final NSActivityOptions IdleDisplaySleepDisabled = new NSActivityOptions(1099511627776L);
    public static final NSActivityOptions IdleSystemSleepDisabled = new NSActivityOptions(1048576L);
    public static final NSActivityOptions SuddenTerminationDisabled = new NSActivityOptions(16384L);
    public static final NSActivityOptions AutomaticTerminationDisabled = new NSActivityOptions(32768L);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NSActivityOptions AnimationTrackingEnabled = new NSActivityOptions(35184372088832L);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NSActivityOptions TrackingEnabled = new NSActivityOptions(70368744177664L);
    public static final NSActivityOptions UserInitiated = new NSActivityOptions(16777215L);
    public static final NSActivityOptions UserInitiatedAllowingIdleSystemSleep = new NSActivityOptions(15728639L);
    public static final NSActivityOptions Background = new NSActivityOptions(255L);
    public static final NSActivityOptions LatencyCritical = new NSActivityOptions(1095216660480L);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NSActivityOptions UserInteractive = new NSActivityOptions(1095233437695L);
    /*</values>*/

    private static final /*<name>*/NSActivityOptions/*</name>*/[] values = _values(/*<name>*/NSActivityOptions/*</name>*/.class);

    public /*<name>*/NSActivityOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSActivityOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSActivityOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSActivityOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSActivityOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSActivityOptions/*</name>*/[] values() {
        return values.clone();
    }
}
