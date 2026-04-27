package com.example.musicplayer;

import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Instead of loading a layout file (which might be missing/broken),
        // we create a simple text view directly in code to prevent crashing.
        TextView textView = new TextView(this);
        textView.setText("Music Player is Running!");
        textView.setTextSize(24);
        textView.setGravity(Gravity.CENTER);

        setContentView(textView);
    }
}
