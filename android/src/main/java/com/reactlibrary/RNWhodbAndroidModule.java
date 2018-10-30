
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNWhodbAndroidModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNWhodbAndroidModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @ReactMethod
    public void configDb() {

    }

    @ReactMethod
    public void importDb() {

    }

    @Override
    public String getName() {
        return "RNWhodbAndroid";
    }
}