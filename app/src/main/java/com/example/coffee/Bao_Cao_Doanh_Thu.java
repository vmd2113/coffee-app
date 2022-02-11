package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class Bao_Cao_Doanh_Thu extends AppCompatActivity {
    Toolbar toolbarBCDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_cao_doanh_thu);

        toolbarBCDT = (Toolbar) findViewById(R.id.ToolbarBCDT);
        setSupportActionBar(toolbarBCDT);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarBCDT.setNavigationIcon(R.drawable.iconback1);
        toolbarBCDT.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}