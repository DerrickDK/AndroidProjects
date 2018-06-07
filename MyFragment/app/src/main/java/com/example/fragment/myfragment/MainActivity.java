package com.example.fragment.myfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClick();
    }
    protected void onButtonClick(){
        Button myButton = (Button) findViewById(R.id.Button);
        myButton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView myText = (TextView) findViewById(R.id.topTextInput);
                        myText.setText("Hey there! I'm Gohan, and I'm a Fragment!");
                    }
                }
        );
    }
}
