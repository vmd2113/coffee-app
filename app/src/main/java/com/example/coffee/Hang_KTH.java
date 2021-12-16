package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Hang_KTH extends AppCompatActivity {
    Toolbar toolbarKTH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hang_kth);
        toolbarKTH = (Toolbar) findViewById(R.id.ToolbarKTH);
        setSupportActionBar(toolbarKTH);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarKTH.setNavigationIcon(R.drawable.iconback1);
    }
}