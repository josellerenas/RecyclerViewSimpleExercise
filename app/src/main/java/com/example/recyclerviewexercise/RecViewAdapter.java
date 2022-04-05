package com.example.recyclerviewexercise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.ViewHolder> {

    // Declaring Variables
    private ArrayList<String> element;


    //Data is passed into the constructor
    public RecViewAdapter(ArrayList<String> data) {
        this.element = data;
    }

    // Inflates the row layout from xml when needed
    @NonNull
    @Override
    public RecViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Here, you need to pay attention to two things:
        //
        // 1.- The part inside the parenthesis after "from".
        // Here goes the context. You can put "parent.getContext()" to get the context from the
        // parent activity. Another way to do it is asking for the context in the constructor of
        // the adapter. In that case, instead of "parent.getContext()", you'd put the context
        // the constructor received.
        //
        // 2.- The first argument after .inflate
        // Here goes the layout file where you put the UI elements that will populate the recView
        //
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    // Binds the data to the TextView / UI elements in each row
    @Override
    public void onBindViewHolder(@NonNull RecViewAdapter.ViewHolder holder, int position) {
        holder.txtElement.setText(element.get(position));
    }

    // Total number of rows
    @Override
    public int getItemCount() {
        return element.size();
    }

    // Stores and recycles views as they are scrolled off screen
    // This part is mainly for linking the variables with the UI elements.
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtElement;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtElement = itemView.findViewById(R.id.txtElement);
        }
    }
}
