package com.example.teacher_parent;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class App extends Application {

    private static final String TAG = "App";
    private static App sApp;

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
        FirebaseApp.initializeApp(getApplicationContext());
    }
    public static App getInstance() {
        return sApp;
    }
}
