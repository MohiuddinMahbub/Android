package com.mahbub.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    private int quantity = 0;
    private int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        String message = "Price $" +  quantity * 5 + "\nThank You";

        //displayPrice(quantity * 5);

        displayPriceMessage(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private int display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

        return number;
    }

    /**
     * This method display the price against the quantity on the screen.
     * */
    private void displayPrice(int number){
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayPriceMessage(String message){
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method increments the value when the plus button clicked
     * */
    public void increment(View view){

        if(quantity < 1){
            quantity = 3;
        }
        else{
            quantity = quantity + 1;
        }

        display(quantity);
    }

    /**
     * This method decrements the value when the minus button clicked
     * */
    public void decrement(View view){

        if(quantity < 1){
            quantity = 0;
        }
        else{
            quantity = quantity - 1;
        }

        display(quantity);
    }
}
