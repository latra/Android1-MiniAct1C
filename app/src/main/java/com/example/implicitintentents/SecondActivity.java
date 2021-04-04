package com.example.implicitintentents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        TextView urlLabel = findViewById(R.id.urlTextLabel);
        urlLabel.setText(data.toString());
    }
}