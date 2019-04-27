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
package org.robovm.apple.modelio;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLVertexBufferLayout/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLVertexBufferLayoutPtr extends Ptr<MDLVertexBufferLayout, MDLVertexBufferLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLVertexBufferLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLVertexBufferLayout() {}
    protected MDLVertexBufferLayout(Handle h, long handle) { super(h, handle); }
    protected MDLVertexBufferLayout(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStride:")
    public MDLVertexBufferLayout(@MachineSizedUInt long stride) { super((SkipInit) null); initObject(init(stride)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stride")
    public native @MachineSizedUInt long getStride();
    @Property(selector = "setStride:")
    public native void setStride(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStride:")
    protected native @Pointer long init(@MachineSizedUInt long stride);
    /*</methods>*/
}
