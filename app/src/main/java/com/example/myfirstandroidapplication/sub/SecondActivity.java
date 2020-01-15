package com.example.myfirstandroidapplication.sub;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        setContentView(textView);

        Bundle extras = getIntent().getExtras();
        int i = extras.getInt("key_1");
        String s = extras.getString("key_2");

        textView.setText(i + " " + s);
    }
}
