package com.example.alertdialogtoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_t = findViewById(R.id.btn_toast);
        Button btn_a = findViewById(R.id.btn_alertdialog);

        btn_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                     //訊息顯示
                Toast.makeText(getBaseContext(), "我好帥", Toast.LENGTH_SHORT).show();        //顯示文字
            }
        });

        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                    //對話框
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
                alertdialog.setTitle("對話框");                    //對話框標題
                alertdialog.setMessage("我是對話視窗");               //對話框內容
                alertdialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertdialog.show();
            }
        });
    }
}