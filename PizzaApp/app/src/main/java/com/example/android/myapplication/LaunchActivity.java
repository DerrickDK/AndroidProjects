package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.text.*;

public class LaunchActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        //onButtonCLick();
    }
    /*public void onButtonCLick(){
        Button myButton = (Button) findViewById(R.id.EnterNow);
        myButton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(this,MainActivity.class);
                        startActivity(i);
                    }
                }
        );
    }*/

    public void changeDisplay(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
