package com.example.coffee;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ProductsFragment extends Fragment implements AdapterView.OnItemClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView txtProduct = (TextView) view.findViewById(R.id.Products);
        txtProduct.setText("Sản phẩm");
        TextView txtAddProduct = (TextView) view.findViewById(R.id.AddProduct);
        txtAddProduct.setText("Thêm sản phẩm");
        String[] List = {"Danh sách sản phẩm", "Nhập hàng", "Kiểm hàng", "Nhà cung cấp"};
        ListView listView = (ListView) view.findViewById(R.id.ListProduct);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, List);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0){
            Toast.makeText(getActivity(),"Danh sách sản phẩm", Toast.LENGTH_SHORT).show();
        }
        if(i==1){
            Toast.makeText(getActivity(),"Nhập hàng", Toast.LENGTH_SHORT).show();
        }
        if(i==2){
            Toast.makeText(getActivity(),"Kiểm hàng", Toast.LENGTH_SHORT).show();
        }
        if(i==3){
            Toast.makeText(getActivity(),"Nhà cung cấp", Toast.LENGTH_SHORT).show();
        }
    }
}