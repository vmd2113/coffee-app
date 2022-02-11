package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class Bao_Cao_Kho_Hang extends AppCompatActivity {
    Toolbar toolbarBCKH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_cao_kho_hang);

        toolbarBCKH = (Toolbar) findViewById(R.id.ToolbarBCKH);
        setSupportActionBar(toolbarBCKH);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarBCKH.setNavigationIcon(R.drawable.iconback1);
        toolbarBCKH.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}