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
/*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    protected NSURLError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(NSURLError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    private NSErrorUserInfo userInfo;
    
    /* Convenience methods */
    private NSErrorUserInfo getCachedUserInfo() {
        if (userInfo == null) {
            userInfo = getUserInfo();
        }
        return userInfo;
    }   
    
    @Override
    public NSURLErrorCode getErrorCode() {
        NSURLErrorCode code = null;
        try {
            code = NSURLErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            // ignore
        }
        return code;
    }
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    public NSURL getFailingURL() {
        if (getCachedUserInfo().has(NSURLErrorUserInfoKey.FailingURL)) {
            NSURL val = (NSURL)getCachedUserInfo().get(NSURLErrorUserInfoKey.FailingURL);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getFailingURLString() {
        if (getCachedUserInfo().has(NSURLErrorUserInfoKey.FailingURLString)) {
            NSString val = (NSString)getCachedUserInfo().get(NSURLErrorUserInfoKey.FailingURLString);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    public SecTrust getFailingURLPeerTrust() {
        if (getCachedUserInfo().has(NSURLErrorUserInfoKey.FailingURLPeerTrust)) {
            SecTrust val = getCachedUserInfo().get(NSURLErrorUserInfoKey.FailingURLPeerTrust, SecTrust.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @SuppressWarnings("unchecked")
    public List<NSURLProperty> getUnsetProperties() {
        List<NSURLProperty> properties = new ArrayList<>();
        if (getCachedUserInfo().has(NSURLErrorUserInfoKey.KeysOfUnsetValues)) {
            NSArray<NSString> val = (NSArray<NSString>)getCachedUserInfo().get(NSURLErrorUserInfoKey.KeysOfUnsetValues);
            for (NSString s : val) {
                NSURLProperty p = NSURLProperty.valueOf(s);
                if (p != null) properties.add(p);
            }
        }
        return properties;
    }
    /*<methods>*/
    @GlobalValue(symbol="NSURLErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/
}
