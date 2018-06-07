package com.example.miwok.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CharactersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);
        createList();
    }
    public void createList(){
        ArrayList<String> myNumbers = new ArrayList<>();
        myNumbers.add("One");
        myNumbers.add("Two");
        LinearLayout myRootLayout = (LinearLayout) findViewById(R.id.rootView);
        TextView myText = new TextView(this); //this refers to the class and all of it's components
        //Read "TextView for this class called CharactersActivity which is connected to activity_characters")
        myText.setText(myNumbers.get(0));
        myRootLayout.addView(myText);
        TextView myText2 = new TextView(this);
        myText2.setText(myNumbers.get(1));
        myRootLayout.addView(myText2);
    }


}
