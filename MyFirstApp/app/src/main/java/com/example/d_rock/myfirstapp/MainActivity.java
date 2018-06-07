package com.example.d_rock.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.widget.Button; //using this because I created an id in the xml
import android.view.View; //using this because I created an id in the xml
import android.view.MotionEvent;
import android.widget.TextView; //using this because I created an id in the xml
import android.support.v4.view.GestureDetectorCompat;
//Every class has an interface. If not every class, then there are classes that have interfaces


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{
   private TextView myMessage;
   private GestureDetector gestureDetector;
    @Override //this annotation means that you'll override the super classes' method called onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myClickButton(); //instead of using onClick attribute in xml I'm using it here, the java way
        myMessage = (TextView) findViewById(R.id.myMessage);
        this.gestureDetector = new GestureDetector(this, this);
        //this.gestureDectector is referring to the GestureDectector class in this case.
        //this.gestureDectector is referring to the current class I'm working with, which in this case is GestureDectector
        gestureDetector.setOnDoubleTapListener(this);

    }
    protected void myClickButton(){
        Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener( //when you click the button, this is what is going to happen
                new Button.OnClickListener(){ //an object can have a method body
                    public void onClick(View view){ //looks like I can't use the parameter view unless Button is here
                        TextView myText = (TextView) findViewById(R.id.myText);
                        myText.setBackgroundColor(Color.CYAN);
                    }
                }
        );
        myButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View view) {
                        TextView myText = (TextView) findViewById(R.id.myText);
                        myText.setText("I was long clicked!");
                        return true;
                    }
                }
        );
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) { //still connected to the super class(Activity) but we're using this method instead of the one in the super class
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        myMessage.setText("SingleTapConfirmed");
        return true;
}

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        myMessage.setText("DoubleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        myMessage.setText("DoubleTapEventConfirmed");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        myMessage.setText("onDownConfirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        myMessage.setText("onShowPressConfirmed");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        myMessage.setText("SingleTapUpConfirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        myMessage.setText("onScrollConfirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        myMessage.setText("LongPressConfirmed");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        myMessage.setText("onFlingConfirmed");
        return true;
    }

}
