package com.example.vedhashala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        button = findViewById(R.id.connectBtn);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this, CallActivity.class);
                startActivity(myIntent);
            }

        });

    }
}
