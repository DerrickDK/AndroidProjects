package com.example.workoutsadvisor.myoverflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.overFlow_menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.mainView);
        switch (item.getItemId()){
            case R.id.menu_red:
                if(item.isChecked()) {
                    item.setCheckable(false);
                }else{
                        item.setChecked(true);
                        main_view.setBackgroundColor(Color.RED);
                        return true;
                    }
            case R.id.menu_blue:
                if(item.isChecked()) {
                    item.setCheckable(false);
                }else{
                        item.setChecked(true);
                        main_view.setBackgroundColor(Color.BLUE);
                        return true;
                }
            case R.id.menu_green:
                if(item.isChecked()) {
                    item.setCheckable(false);
                }else{
                        item.setChecked(true);
                        main_view.setBackgroundColor(Color.GREEN);
                        return true;
                }
            default: return super.onOptionsItemSelected(item);
        }

    }

}


