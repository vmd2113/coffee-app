package com.example.coffee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaoCaoFragment extends Fragment {
    Button btntaobaocao;
    TextView baocaodoanhthu, baocaokhohang, baocaotaichinh, baocaokhuyenmai;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baocao, container, false);
        btntaobaocao = view.findViewById(R.id.taobaocao);
        baocaodoanhthu = view.findViewById(R.id.baocaodoanhthu);
        baocaokhohang = view.findViewById(R.id.baocaokhohang);
        baocaotaichinh = view.findViewById(R.id.baocaotaichinh);
        baocaokhuyenmai = view.findViewById(R.id.baocaokhuyenmai);
        btntaobaocao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Tao_Bao_Cao.class);
                startActivity(intent);
            }
        });
        baocaodoanhthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), Bao_Cao_Doanh_Thu.class);
                startActivity(intent1);
            }
        });
        baocaokhohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), Bao_Cao_Kho_Hang.class);
                startActivity(intent2);
            }
        });
        baocaotaichinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), Bao_Cao_Tai_Chinh.class);
                startActivity(intent3);
            }
        });
        baocaokhuyenmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), Bao_Cao_Khuyen_Mai.class);
                startActivity(intent4);
            }
        });
        return view;
    }


}