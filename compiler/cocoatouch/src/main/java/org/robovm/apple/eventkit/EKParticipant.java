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
package org.robovm.apple.eventkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("EventKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EKParticipant/*</name>*/ 
    extends /*<extends>*/EKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EKParticipantPtr extends Ptr<EKParticipant, EKParticipantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EKParticipant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EKParticipant() {}
    protected EKParticipant(Handle h, long handle) { super(h, handle); }
    protected EKParticipant(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "participantStatus")
    public native EKParticipantStatus getParticipantStatus();
    @Property(selector = "participantRole")
    public native EKParticipantRole getParticipantRole();
    @Property(selector = "participantType")
    public native EKParticipantType getParticipantType();
    @Property(selector = "isCurrentUser")
    public native boolean isCurrentUser();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "contactPredicate")
    public native NSPredicate getContactPredicate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "ABRecordWithAddressBook:")
    public native ABRecord getAddessBookRecord(ABAddressBook addressBook);
    /*</methods>*/
}
