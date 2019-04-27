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
@StronglyLinked
/*<annotations>*/@Library("AddressBook")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABPersonPhoneLabel/*</name>*/ 
    extends /*<extends>*/ABPropertyLabel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ABPersonPhoneLabel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static final ABPersonPhoneLabel Mobile = new ABPersonPhoneLabel("MobileLabel");
    /**
     * @since Available in iOS 3.0 and later.
     */
    public static final ABPersonPhoneLabel IPhone = new ABPersonPhoneLabel("IPhoneLabel");
    public static final ABPersonPhoneLabel Main = new ABPersonPhoneLabel("MainLabel");
    public static final ABPersonPhoneLabel HomeFAX = new ABPersonPhoneLabel("HomeFAXLabel");
    public static final ABPersonPhoneLabel WorkFAX = new ABPersonPhoneLabel("WorkFAXLabel");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final ABPersonPhoneLabel OtherFAX = new ABPersonPhoneLabel("OtherFAXLabel");
    public static final ABPersonPhoneLabel Pager = new ABPersonPhoneLabel("PagerLabel");
    
    private static ABPropertyLabel[] values = new ABPropertyLabel[] {Work, Home, Other, Mobile, Main, 
        HomeFAX, WorkFAX, Pager, IPhone, OtherFAX};
    
    private ABPersonPhoneLabel(String getterName) {
        super(getterName);
    }
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public static ABPropertyLabel valueOf(CFString value) {
        for (ABPropertyLabel v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ABPersonPhoneLabel/*</name>*/.class.getName());
    }
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberMobile
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhoneMobileLabel", optional=true)
    protected static native CFString MobileLabel();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberiPhone
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhoneIPhoneLabel", optional=true)
    protected static native CFString IPhoneLabel();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberMain
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhoneMainLabel", optional=true)
    protected static native CFString MainLabel();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberHomeFax
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhoneHomeFAXLabel", optional=true)
    protected static native CFString HomeFAXLabel();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberWorkFax
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhoneWorkFAXLabel", optional=true)
    protected static native CFString WorkFAXLabel();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberOtherFax
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhoneOtherFAXLabel", optional=true)
    protected static native CFString OtherFAXLabel();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. use CNLabelPhoneNumberPager
     */
    @Deprecated
    @GlobalValue(symbol="kABPersonPhonePagerLabel", optional=true)
    protected static native CFString PagerLabel();
    /*</methods>*/
}
