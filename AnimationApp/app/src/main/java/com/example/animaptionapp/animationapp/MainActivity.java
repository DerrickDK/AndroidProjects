package com.example.animaptionapp.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ViewGroup myRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRelativeLayout = (ViewGroup) findViewById(R.id.myLayout);
        myRelativeLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        moveButton();
                        return true;
                    }
                }
        );
    }
    public void moveButton(){
        TransitionManager.beginDelayedTransition(myRelativeLayout);
        View myButton = findViewById(R.id.myButton); //Button is a subclass of View so It's ok to use View here
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        myButton.setLayoutParams(positionRules);
        //code for expanding the Button
        ViewGroup.LayoutParams sizeRules = myButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        myButton.setLayoutParams(sizeRules);

    }
}
