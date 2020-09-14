package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class groceries extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_REPLY =
            "com.example.android.ShoppingCart.extra.REPLY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
    }

    public void pickGrocery(View view) {
        Intent replyIntent = new Intent();
        int id = view.getId();
        Button b = (Button)findViewById(id);
        String buttonText = b.getText().toString();
        replyIntent.putExtra(EXTRA_REPLY, buttonText);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}