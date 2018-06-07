package com.example.miwok.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.*;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        whenCharacterIsClicked();
        whenHistoryIsClicked();
        whenSkillIsClicked();
        whenWorldIsClicked();
    }

    /* public void whenNumbersIsClicked(){ //for a toast message
         TextView myText = (TextView) findViewById(R.id.numbers);
         CharactersActivity myNumbers = new CharactersActivity(); //apparently when you have a class that implements an interface, it uses that interface as its special ability
         myText.setOnClickListener(myNumbers); //myNumbers is an object that implements the View.OnClickListener interface
     }*/
    public void whenCharacterIsClicked() {
        TextView myText = (TextView) findViewById(R.id.characters);
        myText.setOnClickListener(
                new TextView.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "Opened the character's tab", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), CharactersActivity.class);
                        startActivity(intent);
                        Log.i("MainActivity", "Ok I work");
                    }
                }
        );
    }

    public void whenWorldIsClicked() {
        TextView myText = (TextView) findViewById(R.id.worlds);
        myText.setOnClickListener(
                new TextView.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "Opened the world's tab", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(view.getContext(), WorldsActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void whenHistoryIsClicked() {
        TextView myText = (TextView) findViewById(R.id.history);
        myText.setOnClickListener(
                new TextView.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "Opened the history tab", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(view.getContext(), HistoryActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void whenSkillIsClicked() {
        TextView myText = (TextView) findViewById(R.id.skills);
        myText.setOnClickListener(
                new TextView.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "Opened the skill tab", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(view.getContext(), SkillsActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
