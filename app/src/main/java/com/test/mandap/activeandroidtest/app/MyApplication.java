package com.test.mandap.activeandroidtest.app;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Shashank Gupta on 27-Aug-15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ActiveAndroid.initialize(this);
    }
}
