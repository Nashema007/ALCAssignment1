package com.example.alcassignment1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alcassignment1.R;
import com.example.alcassignment1.modals.Profile;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.MyViewHolder>{

    private Context context;
    private ArrayList<Profile> profileList;

    public ProfileAdapter(Context context, ArrayList<Profile> profileList) {
        this.context = context;
        this.profileList = profileList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.label.setText(profileList.get(position).getLabel());
        holder.value.setText(profileList.get(position).getValue());
    }

    @Override
    public int getItemCount() {
        return profileList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView label;
        private TextView value;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            label = itemView.findViewById(R.id.label);
            value = itemView.findViewById(R.id.value);
        }
    }
}
