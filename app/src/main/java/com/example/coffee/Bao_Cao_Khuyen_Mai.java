package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class Bao_Cao_Khuyen_Mai extends AppCompatActivity {
    Toolbar toolbarBCKM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_cao_khuyen_mai);

        toolbarBCKM = (Toolbar) findViewById(R.id.ToolbarBCKM);
        setSupportActionBar(toolbarBCKM);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarBCKM.setNavigationIcon(R.drawable.iconback1);
        toolbarBCKM.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}