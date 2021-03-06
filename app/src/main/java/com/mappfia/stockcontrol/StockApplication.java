package com.mappfia.stockcontrol;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseCrashReporting;

public class StockApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        
        ParseCrashReporting.enable(this);

        Parse.initialize(this, "MfS9c7QtxpkHKTfFyIhcWVSyIGu7ifmhYEO7PPj9", "KLjSJdAS8oCHx7og3z3qgwfbc2juasPvqZlF0iF7");

    }
}
