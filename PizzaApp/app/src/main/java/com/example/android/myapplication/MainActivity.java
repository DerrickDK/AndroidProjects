package com.example.android.myapplication;

         import android.os.Bundle;
         import android.support.v7.app.AppCompatActivity;
         import android.view.View; //View class
         import android.widget.TextView;
         import java.text.*;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    private int number = 1;
    private String myName = "Derrick";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This is saying when I create an activity, I want to focus on the activity_main.xml
        //I think R means referring to the activity_main layout
        //R.layout is a complete class
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void submitName(View textView){
        displayName(myName);
    }
    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View textView) {
        //This method is executed in the activity_main.xml file when I call the xml attribute onClick and assign it this method.
            displayPrice(number);
    }
    public void increment(View textView){
        int quantity = number;
        for(int i = quantity; i <= 100; i+=1){
            displayQuantity(quantity);
        }
    }
    public void decrement(View textView){
        int quantity = number;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view_0);
            quantityTextView.setText("" + number); //this is what does the displaying
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int totalPrice) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view_cash);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(totalPrice));
    }
    private void displayName(String myName){
        TextView nameTextView = (TextView) findViewById(R.id.unlockName);
        //nameTextView.setText(R.string.myName);
        nameTextView.setText(myName);
    }
}
