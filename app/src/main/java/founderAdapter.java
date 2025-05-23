import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashactivity.DetailActivity;
import com.example.splashactivity.Founder;
import com.example.splashactivity.R;

import java.util.List;

public class founderAdapter extends RecyclerView.Adapter<founderAdapter.ViewHolder> {
    Context context;
    List<Founder> founders;

    public founderAdapter(Context context, List<Founder> founders) {
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
        Founder f = founders.get(position);
        holder.imageView.setImageResource(f.getImageResId());
        holder.name.setText(f.getName());

        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(context, DetailActivity.class);
            i.putExtra("image", f.getImageResId());
            i.putExtra("name", f.getName());
            i.putExtra("description", f.getDescription());
            context.startActivity(i);
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
