package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Hang_QLGH extends AppCompatActivity {
    Toolbar toolbarQLGH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hang_qlgh);
        toolbarQLGH = (Toolbar) findViewById(R.id.ToolbarQLGH);
        setSupportActionBar(toolbarQLGH);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarQLGH.setNavigationIcon(R.drawable.iconback1);
    }
}