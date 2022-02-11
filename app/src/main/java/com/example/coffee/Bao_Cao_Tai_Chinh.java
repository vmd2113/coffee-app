package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class Bao_Cao_Tai_Chinh extends AppCompatActivity {
    Toolbar toolbarBCTC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_cao_tai_chinh);

        toolbarBCTC = (Toolbar) findViewById(R.id.ToolbarBCTC);
        setSupportActionBar(toolbarBCTC);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarBCTC.setNavigationIcon(R.drawable.iconback1);
        toolbarBCTC.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}