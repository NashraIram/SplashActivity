package com.example.splashactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView nameView, descView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        nameView = findViewById(R.id.nameView);
        descView = findViewById(R.id.descView);

        Intent i = getIntent();
        imageView.setImageResource(i.getIntExtra("image", 0));
        nameView.setText(i.getStringExtra("name"));
        descView.setText(i.getStringExtra("description"));
    }
}
