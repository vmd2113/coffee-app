package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Hang_DSDH extends AppCompatActivity {
    Toolbar toolbarDSDH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hang_dsdh);
        toolbarDSDH = (Toolbar) findViewById(R.id.ToolbarDSDH);
        setSupportActionBar(toolbarDSDH);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarDSDH.setNavigationIcon(R.drawable.iconback1);
    }
}