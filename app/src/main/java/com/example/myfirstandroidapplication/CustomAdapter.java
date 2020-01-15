package com.example.myfirstandroidapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<DataModel> dataModels;

    CustomAdapter(final List<DataModel> dataModels) {
        this.dataModels = dataModels;
    }

    public void setDataModel(List<DataModel> dataModel) {
        this.dataModels = dataModel;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.row_items, parent, false
        );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(dataModels.get(position));
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView carnameTextView;
        final TextView carColorTextView;
        final ImageView carImage;

        ViewHolder(View itemVIew) {
            super(itemVIew);
            carColorTextView = itemVIew.findViewById(R.id.textColor);
            carnameTextView = itemVIew.findViewById(R.id.textViewCarName);
            carImage = itemVIew.findViewById(R.id.rowImage);
        }

        void bind(final DataModel dataModel) {
            carnameTextView.setText(dataModel.getCarName());
            carColorTextView.setText(dataModel.getCarColor());

            Glide.with(itemView.getContext())
                    .load(dataModel.getImageurl())
                    .into(carImage);
        }
    }
}
