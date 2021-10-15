package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class KonfirmasiActivity extends AppCompatActivity {
    private TextView tvnama, tvemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        tvnama = findViewById(R.id.tv_nama);
        tvemail = findViewById(R.id.tv_email);

        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("amplopNama");
        String terimaemail = terima.getStringExtra("amplopEmail");

        tvnama.setText(terimanama);
        tvemail.setText(terimaemail);
    }
}