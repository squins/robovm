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
 * @deprecated Deprecated in iOS 9.0. Use PHAsset from the Photos framework instead
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("AssetsLibrary") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAsset/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAssetPtr extends Ptr<ALAsset, ALAssetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAsset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALAsset() {}
    protected ALAsset(Handle h, long handle) { super(h, handle); }
    protected ALAsset(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the PHImageRequestOptionsVersionOriginal or PHImageRequestOptionsVersionUnadjusted option in PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Deprecated
    @Property(selector = "originalAsset")
    public native ALAsset getOriginalAsset();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use canPerformEditOperation: on a PHAsset from the Photos framework instead
     */
    @Deprecated
    @Property(selector = "isEditable")
    public native boolean isEditable();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /* Convenience methods */
    public ALAssetType getType() {
        NSString val = getPropertyValue(ALAssetProperty.Type, NSString.class);
        if (val != null) {
            return ALAssetType.valueOf(val);
        }
        return null;
    }
    @WeaklyLinked
    public org.robovm.apple.corelocation.CLLocation getLocation() {
        org.robovm.apple.corelocation.CLLocation val = getPropertyValue(ALAssetProperty.Location, org.robovm.apple.corelocation.CLLocation.class);
        if (val != null) {
            return val;
        }
        return null;
    }
    public double getDuration() {
        NSNumber val = getPropertyValue(ALAssetProperty.Duration, NSNumber.class);
        if (val != null) {
            return val.doubleValue();
        }
        return 0;
    }
    @WeaklyLinked
    public CGImagePropertyOrientation getOrientation() {
        NSNumber val = getPropertyValue(ALAssetProperty.Orientation, NSNumber.class);
        if (val != null) {
            return CGImagePropertyOrientation.valueOf(val.longValue());
        }
        return null;
    }
    public NSDate getDate() {
        NSDate val = getPropertyValue(ALAssetProperty.Date, NSDate.class);
        if (val != null) {
            return val;
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    public List<String> getRepresentations() {
        NSArray<NSString> val = getPropertyValue(ALAssetProperty.Representations, NSArray.class);
        if (val != null) {
            return val.asStringList();
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    public Map<String, NSURL> getURLs() {
        NSDictionary<NSString, NSURL> val = getPropertyValue(ALAssetProperty.URLs, NSDictionary.class);
        if (val != null) {
            return val.asStringMap();
        }
        return null;
    }
    public NSURL getAssetURL() {
        NSURL val = getPropertyValue(ALAssetProperty.AssetURL, NSURL.class);
        if (val != null) {
            return val;
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    private <T> T getPropertyValue(ALAssetProperty property, Class<T> type) {
        NSObject val = getValue(property);
        if (val != null && val.equals(getInvalidProperty())) {
            return null;
        }
        return (T) val;
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use PHAsset class properties from the Photos framework instead
     */
    @Deprecated
    @GlobalValue(symbol="ALErrorInvalidProperty", optional=true)
    public static native NSString getInvalidProperty();
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use PHAsset class properties from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "valueForProperty:")
    public native NSObject getValue(ALAssetProperty property);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "defaultRepresentation")
    public native ALAssetRepresentation getDefaultRepresentation();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "representationForUTI:")
    public native ALAssetRepresentation getRepresentation(String representationUTI);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to request a thumbnail sized image for a PHAsset from the Photos framework instead
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "thumbnail")
    public native CGImage getThumbnail();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the PHImageContentMode options to request thumbnail aspect ratio in PHImageRequestOptions with the PHImageManager
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "aspectRatioThumbnail")
    public native CGImage getAspectRatioThumbnail();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetFromImage: on PHAssetChangeRequest from the Photos framework to create a new asset instead
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "writeModifiedImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeModifiedImageData(NSData imageData, CGImageProperties metadata, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetFromVideoAtFileURL: on PHAssetChangeRequest from the Photos framework to create a new asset instead
     */
    @Deprecated
    @Method(selector = "writeModifiedVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeModifiedVideo(NSURL videoPathURL, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use contentEditingOutput on a PHAssetChangeRequest from the Photos framework instead
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "setImageData:metadata:completionBlock:")
    public native void setImageData(NSData imageData, CGImageProperties metadata, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use contentEditingOutput on a PHAssetChangeRequest from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "setVideoAtPath:completionBlock:")
    public native void setVideo(NSURL videoPathURL, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /*</methods>*/
}
