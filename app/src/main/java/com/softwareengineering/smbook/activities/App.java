package com.softwareengineering.smbook.activities;

import android.app.Application;
import android.content.Context;

/**
 * Created by Irina on 11/16/2017.
 */

public class App extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }
}