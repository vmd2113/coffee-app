package com.example.coffee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

public class BaoCaoFragment extends Fragment {

    ExpandableListView expandableListView;
    ArrayList<String> listGroup = new ArrayList<>();
    HashMap<String,ArrayList<String>> listChild = new HashMap<>();
    MainAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_baocao, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //
        expandableListView = view.findViewById(R.id.ExpListView_BaoCao);

        //Danh sách
        listGroup.add("Báo cáo doanh thu");
        listGroup.add("Báo cáo mặt hàng");
        listGroup.add("Báo cáo kho hàng");
        listGroup.add("Báo cáo tài chính");
        listGroup.add("Báo cáo khuyến mại");

        // Báo cáo doanh thu
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Báo cáo doanh thu tổng quan");
        arrayList.add("Báo cáo doanh thu theo nhân viên");
        arrayList.add("Phí dịch vụ");
        arrayList.add("Hình thức phục vị");
        listChild.put(listGroup.get(0), arrayList);
        //Báo cáo mặt hàng
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Danh mục mặt hàng");
        listChild.put(listGroup.get(1), arrayList1);
        //Báo cáo kho hàng
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Tồn kho tổng hợp");
        listChild.put(listGroup.get(2), arrayList2);
        //Báo cáo tài chính
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Kết quả kinh doanh");
        listChild.put(listGroup.get(3), arrayList3);
        //Báo cáo khuyến mại
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("Chương trình khuyến mại");
        listChild.put(listGroup.get(4), arrayList4);
        //aaaaaaaaaa
        adapter = new MainAdapter(listGroup,listChild);
        expandableListView.setAdapter(adapter);


    }

}