package com.example.intentapplication.intentapplication;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by D-Rock on 12/24/17.
 */

public class MyIntentService extends IntentService {
    private static final String TAG ="com.example.intentapplication.intentapplication";
    public MyIntentService() {
        super("MyIntentService");
    }

   // @SuppressLint("LongLogTag") //to ignore the error I received with the TAG being over 23 characters
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"The service has started"); //Check the Logcat to see the message
        //filter the Logcat if you need to
    }
}
