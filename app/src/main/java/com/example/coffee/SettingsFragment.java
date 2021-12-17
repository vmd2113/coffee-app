package com.example.coffee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {


    public SettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_settings, container, false);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        RecyclerView optionRec = requireView().findViewById(R.id.optionsRec);
        setting_optionRecyclerViewAdapter adapter = new setting_optionRecyclerViewAdapter(this.getContext());
        optionRec.setAdapter(adapter);
        optionRec.setLayoutManager(new LinearLayoutManager(getActivity()));


        ArrayList<setting_Options> options = new ArrayList<>();
        options.add(new setting_Options("Report", R.drawable.setting_report_icon));
        options.add(new setting_Options("Finance", R.drawable.setting_finance_icon));
        options.add(new setting_Options("Config", R.drawable.setting_config_icon));
        options.add(new setting_Options("Helper", R.drawable.setting_helper_icon));

        adapter.setSetting_options(options);


    }


}