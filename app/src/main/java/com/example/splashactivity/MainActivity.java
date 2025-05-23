package com.example.splashactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Prepare data list
        List<Founder> founderList = new ArrayList<>();
        founderList.add(new Founder("Elon Musk", R.drawable.elon_musk, "Founder of Tesla and SpaceX."));
        founderList.add(new Founder("Steve Jobs", R.drawable.steve_jobs, "Co-founder of Apple Inc."));

        // Set adapter
        FounderAdapter adapter = new FounderAdapter(this, founderList);
        recyclerView.setAdapter(adapter);
    }
}
