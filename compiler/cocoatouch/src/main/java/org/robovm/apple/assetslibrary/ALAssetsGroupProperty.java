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
/*</javadoc>*/
/*<annotations>*/@Library("AssetsLibrary") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ALAssetsGroupProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAssetsGroupProperty/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ALAssetsGroupProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ALAssetsGroupProperty toObject(Class<ALAssetsGroupProperty> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ALAssetsGroupProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ALAssetsGroupProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ALAssetsGroupProperty> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ALAssetsGroupProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ALAssetsGroupProperty.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ALAssetsGroupProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ALAssetsGroupProperty o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the localizedTitle property on a PHAssetCollection from the Photos framework instead
     */
    @Deprecated
    public static final ALAssetsGroupProperty Name = new ALAssetsGroupProperty("Name");
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the assetCollectionType and assetCollectionSubtype properties on a PHAssetCollection from the Photos framework instead
     */
    @Deprecated
    public static final ALAssetsGroupProperty Type = new ALAssetsGroupProperty("Type");
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the localIdentifier property on a PHAssetCollection from the Photos framework instead
     */
    @Deprecated
    public static final ALAssetsGroupProperty PersistentID = new ALAssetsGroupProperty("PersistentID");
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    public static final ALAssetsGroupProperty URL = new ALAssetsGroupProperty("URL");
    /*</constants>*/
    
    private static /*<name>*/ALAssetsGroupProperty/*</name>*/[] values = new /*<name>*/ALAssetsGroupProperty/*</name>*/[] {/*<value_list>*/Name, Type, PersistentID, URL/*</value_list>*/};
    
    /*<name>*/ALAssetsGroupProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ALAssetsGroupProperty/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ALAssetsGroupProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ALAssetsGroupProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AssetsLibrary") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 4.0 and later.
         * @deprecated Deprecated in iOS 9.0. Use the localizedTitle property on a PHAssetCollection from the Photos framework instead
         */
        @Deprecated
        @GlobalValue(symbol="ALAssetsGroupPropertyName", optional=true)
        public static native NSString Name();
        /**
         * @since Available in iOS 4.0 and later.
         * @deprecated Deprecated in iOS 9.0. Use the assetCollectionType and assetCollectionSubtype properties on a PHAssetCollection from the Photos framework instead
         */
        @Deprecated
        @GlobalValue(symbol="ALAssetsGroupPropertyType", optional=true)
        public static native NSString Type();
        /**
         * @since Available in iOS 4.0 and later.
         * @deprecated Deprecated in iOS 9.0. Use the localIdentifier property on a PHAssetCollection from the Photos framework instead
         */
        @Deprecated
        @GlobalValue(symbol="ALAssetsGroupPropertyPersistentID", optional=true)
        public static native NSString PersistentID();
        /**
         * @since Available in iOS 5.0 and later.
         * @deprecated Deprecated in iOS 9.0.
         */
        @Deprecated
        @GlobalValue(symbol="ALAssetsGroupPropertyURL", optional=true)
        public static native NSString URL();
        /*</values>*/
    }
}
