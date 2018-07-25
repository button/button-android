package com.usebutton.purchasepath;

import android.app.Application;

import com.usebutton.sdk.Button;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /// Initialize Button SDK
        Button.configure(this, BuildConfig.BTN_APPLICATION_ID);

        /// Enable Logging
        if (BuildConfig.DEBUG) {
            Button.debug().setLoggingEnabled(true);
        }
    }
}
