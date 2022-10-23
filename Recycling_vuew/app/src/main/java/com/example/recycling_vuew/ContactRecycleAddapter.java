package com.example.recycling_vuew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import javax.microedition.khronos.opengles.GL;


public class ContactRecycleAddapter extends RecyclerView.Adapter<ContactRecycleAddapter.ViewHolder> {
public ContactRecycleAddapter(Context c){
    this.context = c;
}
    private ArrayList<Contacts> contacts = new ArrayList<>();
private Context context;
        public void setContacts(ArrayList<Contacts> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     LayoutInflater layview  = LayoutInflater.from(parent.getContext());
     View view = layview.inflate(R.layout.contact_list_item,parent,false);
ViewHolder  holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView")  int position) {
holder.txtName.setText(contacts.get(position).getName());
holder.parent.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(context, "clicked " + contacts.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
});
        Glide
                .with(context)
                .load(contacts.get(position).getImageUrl())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
     return contacts.size();
    }

    public static class  ViewHolder extends RecyclerView.ViewHolder{
private TextView txtName ;
private RelativeLayout parent ;
private ImageView image;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
txtName = itemView.findViewById(R.id.txtName);
parent = itemView.findViewById(R.id.parent);
    }
}
}
