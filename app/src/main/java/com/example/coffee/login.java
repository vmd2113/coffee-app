package com.example.coffee;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    EditText edtuser, edtpass;
    Button btndangnhap, btndangky, btnthoat;
    String ten, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Anhxa();
        ControlButton();
    }

    private void ControlButton() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(login.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Ban Co Chac Muon Thoat");
                builder.setMessage("Lua Chon Ben Duoi De Xac Nhan");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(login.this);
                dialog.setTitle("Hop Thoai Xu Ly");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialoglogin);
                EditText edttk = (EditText) dialog.findViewById(R.id.edttk);
                EditText edtmk = (EditText) dialog.findViewById(R.id.edtpass);
                Button btnhuy = (Button) dialog.findViewById(R.id.btnhuy);
                Button btndongy = (Button) dialog.findViewById(R.id.btndongy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edttk.getText().toString().trim();
                        mk = edtmk.getText().toString().trim();
                        edtuser.setText(ten);
                        edtpass.setText(mk);
                        dialog.cancel();
                        ;
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() != 0 && edtpass.getText().length() != 0) {
                    if (edtuser.getText().toString().equals(ten) && edtpass.getText().toString().equals(mk)) {
                        Toast.makeText(login.this, "Dang Nhap Thanh Cong", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                    } else if (edtuser.getText().toString().equals("admin") && edtpass.getText().toString().equals("admin")) {
                        Toast.makeText(login.this, "Dang Nhap Thanh Cong", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(login.this, "Dang Nhap Sai", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(login.this, "Nhap Du Thong Tin", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void Anhxa() {

        edtpass = (EditText) findViewById(R.id.txtmatkhau);
        edtuser = (EditText) findViewById(R.id.txttaikhoan);
        btndangky = (Button) findViewById(R.id.btndangky);
        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        btnthoat = (Button) findViewById(R.id.btnthoat);
    }
}