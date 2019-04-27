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
package org.robovm.apple.addressbook;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AddressBook")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABMultiValue/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ABMultiValue.class); }/*</bind>*/
    /*<constants>*/
    public static final int InvalidIdentifier = -1;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueGetPropertyType", optional=true)
    public native ABPropertyType getPropertyType();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use NSArray.count with the labeled value property
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueGetCount", optional=true)
    public native @MachineSizedSInt long getCount();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use [[NSArray objectAtIndex:] value] with the labeled value property
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueCopyValueAtIndex", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CFType getValue(@MachineSizedSInt long index);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use [NSArray enumerateObjectsUsingBlock:] with the labeled value property and collect the values
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueCopyArrayOfAllValues", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.AsListMarshaler.class) List<CFType> getAllValues();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use [[NSArray objectAtIndex:] label] with the labeled value property
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueCopyLabelAtIndex", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CFString getLabel(@MachineSizedSInt long index);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use [NSArray indexOfObjectPassingTest:] with the labeled value property and find the identifier
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueGetIndexForIdentifier", optional=true)
    public native @MachineSizedSInt long indexOf(int identifier);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use [[NSArray objectAtIndex:] identifier] with the labeled value property
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueGetIdentifierAtIndex", optional=true)
    public native int getIdentifier(@MachineSizedSInt long index);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use [NSArray indexOfObjectPassingTest:] with the labeled value property and find the value
     */
    @Deprecated
    @Bridge(symbol="ABMultiValueGetFirstIndexOfValue", optional=true)
    public native @MachineSizedSInt long indexOf(CFType value);
    /*</methods>*/
}
