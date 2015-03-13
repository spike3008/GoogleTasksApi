package com.android.madd.googletasksapi;

import android.app.Application;

import static timber.log.Timber.DebugTree;
import static timber.log.Timber.plant;

public class TimberActivity extends Application {

    @Override public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            plant(new DebugTree());
        }
    }
}
