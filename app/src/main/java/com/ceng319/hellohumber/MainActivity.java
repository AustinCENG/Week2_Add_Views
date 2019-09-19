package com.ceng319.hellohumber;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MapleLeaf";
    private LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        Log.d(TAG, getString(R.string.message1));
        System.out.println(getString(R.string.message2));  // Print some messages on the debug screen.
        myLayout = findViewById(R.id.activity_linear);
        // This is to generate a button Second Try
        generateButton();
    }

    private void generateButton() {
// Add button to the screen
       Button myButton = new Button(this);
       // parms is used to set parameters.
       LinearLayout.LayoutParams params =  new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(100,200,100,200);
        // myButton.setId(R.id.idReset);
        myButton.setBackgroundColor(Color.RED);
        myButton.setText(R.string.resetEnglish);
        myButton.setLayoutParams(params);
        myLayout.addView(myButton, params); // Add button to the layout.

        // add button click event.
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
