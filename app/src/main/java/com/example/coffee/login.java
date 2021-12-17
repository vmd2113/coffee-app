package com.example.coffee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText edtuser, edtpass;
    Button btndangky, btndangnhap, btnthoat;
    String ten, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Anhxa();
        ControlButton();
    }

    private void Anhxa() {
        edtuser = findViewById(R.id.edittexttextsure);
        edtpass = findViewById(R.id.edittextpassword);
        btndangnhap = findViewById(R.id.buttondangnhap);
        btndangky = findViewById(R.id.buttondangky);
        btnthoat = findViewById(R.id.buttonthoat);
    }

    // Điều hướng
    private void ControlButton() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(login.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn Có Chắc Muốn Thoát Khỏi App");
                builder.setMessage("Hãy Lựa Chọn Xác Nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
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
                dialog.setTitle("Hộp Thoại Xử Lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialog);
                EditText edttk = (EditText) dialog.findViewById(R.id.edttk);
                EditText edtmk = (EditText) dialog.findViewById(R.id.edtmk);

                Button btnhuy = (Button) dialog.findViewById(R.id.butonhuy);
                Button btndongy = (Button) dialog.findViewById(R.id.butondongy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edttk.getText().toString().trim();
                        mk = edtmk.getText().toString().trim();
                        edtuser.setText(ten);
                        edtpass.setText(mk);
                        dialog.cancel();
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
                        Toast.makeText(login.this, "Bạn Đã Đăng Nhập", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(login.this, "Sai Tài Khoản Hoặc Mật Khẩu", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(login.this, "Vui Lòng Điền Đủ Thông Tin", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
