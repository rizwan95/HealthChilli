package com.healthchilli.application.healthchilli;
// This class is only for invoking the push notification functions

import android.app.Application;
import com.parse.ParseInstallation;

public class Parse extends Application {

    public void onCreate() {
        super.onCreate();

        //Parse code
        com.parse.Parse.initialize(this, "2rS2E1A54HshJs43DW1WTijkUCOnVZ0CeiSQ1gj4", "scTcCqngzffJbza6yKy9enZG82nsC1Ct46oeH8W7");
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}

