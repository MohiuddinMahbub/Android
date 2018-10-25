package com.mahbub.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        Log.i("Button", "Eat button clicked");

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = findViewById(R.id.status_text_view);
        textView.setText("I'm so full");
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void hungryAgain(View view) {

        Log.i("Button", "Hungry button clicked");

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.before_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = findViewById(R.id.status_text_view);
        textView.setText("I'm so hungry");
    }
}
