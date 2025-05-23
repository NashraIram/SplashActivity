package com.example.splashactivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FounderAdapter extends RecyclerView.Adapter<FounderAdapter.ViewHolder> {
    private final Context context;
    private final List<Founder> founders;

    public FounderAdapter(Context context, List<Founder> founders) {
        this.context = context;
        this.founders = founders;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_founder, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Founder founder = founders.get(position);
        holder.imageView.setImageResource(founder.getImageResId());
        holder.name.setText(founder.getName());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("image", founder.getImageResId());
            intent.putExtra("name", founder.getName());
            intent.putExtra("description", founder.getDescription());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return founders.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.founderImage);
            name = itemView.findViewById(R.id.founderName);
        }
    }
}
