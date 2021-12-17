package com.example.coffee;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class setting_optionRecyclerViewAdapter extends RecyclerView.Adapter<setting_optionRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "setting_optionRecyclerViewAdapter";
    private ArrayList<setting_Options> setting_options = new ArrayList<>();
    private Context context;
    private SettingsFragment settingsFragment;

    public setting_optionRecyclerViewAdapter(Context contex) {
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_item_option, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Log.d(TAG, "onBindViewHolder: Called");

        holder.optionsName.setText(setting_options.get(position).getNameOption());
        int resource = setting_options.get(position).getSrcIconOption();
        holder.optionIcon.setImageResource(resource);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,setting_options.get(position).getNameOption().toString()+"selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return setting_options.size();
    }

    public void setSetting_options(ArrayList<setting_Options> setting_options) {
        this.setting_options = setting_options;
        //notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView parent;
        private ImageView optionIcon;
        private TextView optionsName;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            context = itemView.getContext();
            parent = itemView.findViewById(R.id.parent);
            optionsName = itemView.findViewById(R.id.txtNameOption);
            optionIcon = itemView.findViewById(R.id.imgIconOption);


        }


    }


}
