package com.example.boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.boundservice.MyService.MyLocalBinder; //you can apparently import a method in your own package..s

public class MainActivity extends AppCompatActivity {
    MyService myService;
    boolean isBound = false;
    public void showTime(View view){
        String currentTime = myService.getCurrentTime();
        TextView myText = (TextView) findViewById(R.id.myText);
        myText.setText(currentTime);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MyService.class);
        bindService(intent,myConnection, Context.BIND_AUTO_CREATE); //service is working behind the scene to update the time everytime we click the button
        //This boundservice serves the application unlike the other bound service project I did. 
    }
    private ServiceConnection myConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            MyLocalBinder binder = (MyLocalBinder) service;
            myService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isBound = false;
        }
    };
}
