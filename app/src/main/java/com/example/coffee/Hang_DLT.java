package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Hang_DLT extends AppCompatActivity {
    Toolbar toolbarHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hang_dlt);

        toolbarHang = (Toolbar) findViewById(R.id.ToolbarDLT);
        setSupportActionBar(toolbarHang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarHang.setNavigationIcon(R.drawable.iconback1);
    }
}