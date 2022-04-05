package com.example.recyclerviewexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DisplayElementsActivity extends AppCompatActivity {

    // Declaring variables
    private RecyclerView recView;
    private RecViewAdapter adapter;
    private ArrayList<String> dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_elements);

        // Filling the ArrayList with information
        dataset = new ArrayList<>();
        dataset.add("Hola");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("goodbye");
        dataset.add("Adios");
        dataset.add("Hola");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("Adios");
        dataset.add("goodbye");
        dataset.add("Adios");

        // Setting up the RecyclerView (Initializing, and setting the LayoutManager)
        recView = findViewById(R.id.recView);
        recView.setLayoutManager(new LinearLayoutManager(this));

        // Setting up the RecyclerView Adapter (Initializing, and linking it with the recView
        adapter = new RecViewAdapter(dataset);
        recView.setAdapter(adapter);
    }
}