package com.example.duan1_ailatrieuphu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent = new Intent(MainActivity.this,StartActivity.class);
        startActivity(intent);
    }

    public void huongdan(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View alert = LayoutInflater.from(this).inflate(R.layout.dialog_huongdan,null);
        builder.setView(alert);

        TextView tvHuongdan;
        Button btnOke;

        tvHuongdan = alert.findViewById(R.id.tvhd);
        btnOke = alert.findViewById(R.id.btnokee);

        btnOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        builder.create().show();
    }
}