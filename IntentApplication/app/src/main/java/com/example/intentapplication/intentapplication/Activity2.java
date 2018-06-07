package com.example.intentapplication.intentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle firstData = getIntent().getExtras();
        if(firstData.equals(null)){
            return;
        }
        String firstMessage = firstData.getString("firstMessage"); //key maps to a certain value
        final TextView secondText = (TextView) findViewById(R.id.secondText);
        secondText.setText(firstMessage);
    }
}
