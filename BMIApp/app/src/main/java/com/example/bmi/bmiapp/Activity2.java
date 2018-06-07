package com.example.bmi.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void CalculateBMI(View view){
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String message = "";
        EditText firstField  = (EditText) findViewById(R.id.firstField);
        EditText secondField  = (EditText) findViewById(R.id.secondField);
        Button calculateME =  (Button) findViewById(R.id.calculate);
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        weight = Double.parseDouble(firstField.getText().toString()); //You receive user's input weight as a string so you can output it as a string
        height = Double.parseDouble(secondField.getText().toString());//You receive user's input height as a string so you can output it as a string
        bmi = height * height;
        bmi = weight/bmi;
        text1.setText(String.valueOf(bmi));
        if(bmi < 18.6){
            message = "You are underweight";
        } else if((bmi > 18.6) && (bmi < 25) ){
            message = "Your weight is normal";
        } else if((bmi > 25) && (bmi<30)){
            message = "You my friend are overweight. Seek help immediately";
        } else if(bmi > 30){
            message = "How are you still alive?";
        }
        text2.setText(message);
    }
}
