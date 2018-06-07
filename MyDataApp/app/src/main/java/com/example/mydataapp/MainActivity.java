package com.example.mydataapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends Activity {
    EditText myInput;
    TextView myText;
    VideoView myVideo;
    MyDataBaseHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput = (EditText) findViewById(R.id.editText);
        myText = (TextView) findViewById(R.id.myText);
        dbHandler = new MyDataBaseHandler(this, null, null, 1);
        printDataBase();
        myVideo = (VideoView) findViewById(R.id.myVideo);
        myVideo.setVideoPath("https://www.youtube.com/watch?v=YZ1eEy4W2Wo");
        myVideo.start();
    }
    public void printDataBase(){
        String databaseString = dbHandler.databasetostring();
        myText.setText(databaseString);
        myInput.setText("");
    }
    public void addButtonClick(View view){
        Products products = new Products(myInput.getText().toString());
        dbHandler.addProduct(products);
        printDataBase();
    }
    public void deleteButtonClick(View view){
        String inputText = myInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDataBase();

    }


}
