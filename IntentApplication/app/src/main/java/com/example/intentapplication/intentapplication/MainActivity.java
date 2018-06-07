package com.example.intentapplication.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MyIntentService.class); //this means we'll be dealing with this object/class
        startService(intent); //we'll be running a service intent in the background. This service will not be seen by the user.
    }
    public void ChangeDisplay(View view){
        Intent i = new Intent(this, Activity2.class);
        final EditText firstInput = (EditText) findViewById(R.id.firstInput);
        String userMessage = firstInput.getText().toString();
        i.putExtra("firstMessage", userMessage);
        startActivity(i);

    }
}
