package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tao_Bao_Cao extends AppCompatActivity {
    Toolbar toolbarTaoBaoCao;
    ListView listView;
    TextView txtLoaiBaoCao;
    String[] LoaiBaoCao = {"Báo cáo doanh thu", "Báo cáo kho hàng", "Báo cáo tài chính", "Báo cáo khuyến mại" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao_bao_cao);

        toolbarTaoBaoCao = (Toolbar) findViewById(R.id.ToolbarTBC);
        setSupportActionBar(toolbarTaoBaoCao);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarTaoBaoCao.setNavigationIcon(R.drawable.iconback1);
        toolbarTaoBaoCao.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        txtLoaiBaoCao = (TextView) findViewById(R.id.txtLoaiBaoCao);

        listView = (ListView) findViewById(R.id.listviewTaoBaoCao);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview_taobaocao, LoaiBaoCao);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0 :
                        Intent intent = new Intent(getApplicationContext() ,Bao_Cao_Doanh_Thu.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        Intent intent1 = new Intent(getApplicationContext(), Bao_Cao_Kho_Hang.class);
                        startActivity(intent1);
                        break;
                    case 2 :
                        Intent intent2 = new Intent(getApplicationContext(),Bao_Cao_Tai_Chinh.class);
                        startActivity(intent2);
                        break;
                    case 3 :
                        Intent intent3 = new Intent(getApplicationContext(),Bao_Cao_Khuyen_Mai.class);
                        startActivity(intent3);
                        break;

                }
            }
        });


    }
}