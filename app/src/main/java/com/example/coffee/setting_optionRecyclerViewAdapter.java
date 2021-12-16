package com.example.coffee;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class setting_optionRecyclerViewAdapter extends RecyclerView.Adapter<setting_optionRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "setting_optionRecyclerViewAdapter";
    private ArrayList<setting_Options> setting_options = new ArrayList<>();
    private Context context;

    public setting_optionRecyclerViewAdapter(Context context) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: Called");

        holder.optionsName.setText(setting_options.get(position).getNameOption());
        int resource = setting_options.get(position).getSrcIconOption();
        holder.optionIcon.setImageResource(resource);
    }

    @Override
    public int getItemCount() {
        return setting_options.size();
    }

    public void setSetting_options(ArrayList<setting_Options> setting_options) {
        this.setting_options = setting_options;
        //notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private CardView parent;
        private ImageView optionIcon;
        private TextView optionsName;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            context = itemView.getContext();
            parent = itemView.findViewById(R.id.parent);
            optionsName = itemView.findViewById(R.id.txtNameOption);
            optionIcon = itemView.findViewById(R.id.imgIconOption);
            parent.setClickable(true);
            parent.setOnClickListener((View.OnClickListener) this);

        }

        @Override
        public void onClick(View view) {
            final Intent intent;
            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(context, setting_reportSetting.class);
                    break;

                case 1:
                    intent = new Intent(context, setting_configSetting.class);
                    break;
                case 2:
                    intent = new Intent(context, setting_financeSetting.class);
                    break;
                case 3:
                    intent = new Intent(context, setting_helperSetting.class);
                    break;
                default:
                    intent = new Intent(context, SettingsFragment.class);
                    break;
            }
            context.startActivity(intent);
        }
    }


}
