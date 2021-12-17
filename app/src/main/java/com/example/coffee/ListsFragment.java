package com.example.coffee;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListsFragment extends Fragment {

    ListView    lvHang;
    ArrayList<String> arrayHang;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListsFragment newInstance(String param1, String param2) {
        ListsFragment fragment = new ListsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lists, container, false);

        lvHang = (ListView) view.findViewById(R.id.ListViewHang);
        arrayHang =  new ArrayList<>();
        arrayHang.add("Danh sách đơn hàng");
        arrayHang.add("Khách trả hàng");
        arrayHang.add("Đơn lưu tạm");
        arrayHang.add("Quản lý giao hàng");

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayHang);

        lvHang.setAdapter(adapter);

        lvHang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0 :
                        Intent intent = new Intent(getActivity(),Hang_DSDH.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        Intent intent1 = new Intent(getActivity(),Hang_KTH.class);
                        startActivity(intent1);
                        break;
                    case 2 :
                        Intent intent2 = new Intent(getActivity(),Hang_DLT.class);
                        startActivity(intent2);
                        break;
                    case 3 :
                        Intent intent3 = new Intent(getActivity(),Hang_QLGH.class);
                        startActivity(intent3);
                        break;

                }
            }
        });


        // Inflate the layout for this fragment
        return view;
    }
}