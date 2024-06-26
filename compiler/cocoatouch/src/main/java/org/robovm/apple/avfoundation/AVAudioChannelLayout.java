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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioChannelLayout/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVAudioChannelLayoutPtr extends Ptr<AVAudioChannelLayout, AVAudioChannelLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioChannelLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAudioChannelLayout() {}
    protected AVAudioChannelLayout(Handle h, long handle) { super(h, handle); }
    protected AVAudioChannelLayout(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayoutTag:")
    public AVAudioChannelLayout(AudioChannelLayoutTag layoutTag) { super((SkipInit) null); initObject(init(layoutTag)); }
    @WeaklyLinked
    @Method(selector = "initWithLayout:")
    public AVAudioChannelLayout(AudioChannelLayout layout) { super((SkipInit) null); initObject(init(layout)); }
    @Method(selector = "initWithCoder:")
    public AVAudioChannelLayout(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layoutTag")
    public native AudioChannelLayoutTag getLayoutTag();
    @WeaklyLinked
    @Property(selector = "layout")
    public native AudioChannelLayout getLayout();
    @Property(selector = "channelCount")
    public native int getChannelCount();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLayoutTag:")
    protected native @Pointer long init(AudioChannelLayoutTag layoutTag);
    @WeaklyLinked
    @Method(selector = "initWithLayout:")
    protected native @Pointer long init(AudioChannelLayout layout);
    @Method(selector = "isEqual:")
    public native boolean equalsTo(AVAudioChannelLayout object);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
