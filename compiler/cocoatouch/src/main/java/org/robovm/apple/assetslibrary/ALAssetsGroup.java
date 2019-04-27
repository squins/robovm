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
package org.robovm.apple.assetslibrary;

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
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 * @deprecated Deprecated in iOS 9.0. Use PHAssetCollection from the Photos framework instead
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("AssetsLibrary") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAssetsGroup/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAssetsGroupPtr extends Ptr<ALAssetsGroup, ALAssetsGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAssetsGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALAssetsGroup() {}
    protected ALAssetsGroup(Handle h, long handle) { super(h, handle); }
    protected ALAssetsGroup(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use canPerformEditOperation: on a PHAssetCollection from the Photos framework instead
     */
    @Deprecated
    @Property(selector = "isEditable")
    public native boolean isEditable();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /* Convenience methods */
    public String getName() {
        NSString val = (NSString)getValue(ALAssetsGroupProperty.Name);
        if (val != null) {
            return val.toString();
        }
        return null;
    }
    public ALAssetsGroupType getType() {
        NSNumber val = (NSNumber)getValue(ALAssetsGroupProperty.Type);
        if (val != null) {
            return new ALAssetsGroupType(val.longValue());
        }
        return null;
    }
    public String getPersistentID() {
        NSString val = (NSString)getValue(ALAssetsGroupProperty.PersistentID);
        if (val != null) {
            return val.toString();
        }
        return null;
    }
    public NSURL getURL() {
        NSURL val = (NSURL)getValue(ALAssetsGroupProperty.URL);
        if (val != null) {
            return val;
        }
        return null;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the class properties on a PHAssetCollection in the Photos framework instead
     */
    @Deprecated
    @Method(selector = "valueForProperty:")
    public native NSObject getValue(ALAssetsGroupProperty property);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "posterImage")
    public native CGImage getPosterImage();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use fetchAssetsInAssetCollection:options: on PHAsset with a predicate in the PHFetchOptions from the Photos framework to filter the assets in an asset collection instead
     */
    @Deprecated
    @Method(selector = "setAssetsFilter:")
    public native void setAssetsFilter(ALAssetsFilter filter);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the estimatedAssetCount on PHAssetCollection for a quick estimate of the total assets in a collection (or fetch the assets to get an exact value) from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "numberOfAssets")
    public native @MachineSizedSInt long getNumberOfAssets();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the PHFetchResult returned by fetchAssetsInAssetCollection:options: on PHAsset to enumerate the assets in an asset collection from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "enumerateAssetsUsingBlock:")
    public native void enumerateAssets(@Block("(,@MachineSizedUInt,)") VoidBlock3<ALAsset, Long, BooleanPtr> enumerationBlock);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the PHFetchResult returned by fetchAssetsInAssetCollection:options: on PHAsset to enumerate the assets in an asset collection from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "enumerateAssetsWithOptions:usingBlock:")
    public native void enumerateAssets(NSEnumerationOptions options, @Block("(,@MachineSizedUInt,)") VoidBlock3<ALAsset, Long, BooleanPtr> enumerationBlock);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the PHFetchResult returned by fetchAssetsInAssetCollection:options: on PHAsset to enumerate the assets in an asset collection from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "enumerateAssetsAtIndexes:options:usingBlock:")
    public native void enumerateAssets(NSIndexSet indexSet, NSEnumerationOptions options, @Block("(,@MachineSizedUInt,)") VoidBlock3<ALAsset, Long, BooleanPtr> enumerationBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use addAssets: on a PHAssetCollectionChangeRequest: created from a PHAssetCollection in the Photos framework instead
     */
    @Deprecated
    @Method(selector = "addAsset:")
    public native boolean addAsset(ALAsset asset);
    /*</methods>*/
}
