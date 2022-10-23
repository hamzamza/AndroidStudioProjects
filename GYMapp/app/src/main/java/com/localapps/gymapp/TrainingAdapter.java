package com.localapps.gymapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrainingAdapter extends RecyclerView.Adapter<TrainingAdapter.ViewHolder>{
TrainingAdapter(ArrayList<Training> trainings , Context context)
{
this.myContext = context ;
this.trainigelist = trainings ;
}
    private ArrayList<Training> trainigelist ;
private Context myContext ;
    @NonNull
    @Override
    public TrainingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.training_item,parent,false);
      return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrainingAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
      return trainigelist . size();
    }
  public   class ViewHolder extends RecyclerView.ViewHolder {
    public TextView itemShortdesc, itemName ;
    public ImageView itemImage;
      public ViewHolder(@NonNull View itemView) {
          super(itemView);
          itemShortdesc = itemView.findViewById(R.id.shortdesk);
          itemName = itemView.findViewById(R.id.trainName);
          itemImage = itemView.findViewById(R.id.itemImage);


      }
  }
}
