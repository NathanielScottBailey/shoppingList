package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private int viewTextValue = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {


            }
    }

    public void addGroceries(View view) {
        Intent intent = new Intent(this, groceries.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {

        int[] viewIDS = new int[]{R.id.textView2,R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9, R.id.textView10, R.id.textView11};
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(groceries.EXTRA_REPLY);
                Log.d(LOG_TAG, data.getStringExtra(groceries.EXTRA_REPLY));
                int x = 0;
                TextView textView = findViewById(viewIDS[x]);
                    while(textView.getText() != ""){
                        textView = findViewById(viewIDS[x]);
                        x = x + 1;

                    }
                    textView.setText(reply);
                }
            }
        }
    }


