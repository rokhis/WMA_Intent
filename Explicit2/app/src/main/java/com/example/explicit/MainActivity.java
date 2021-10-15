package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etnama, etemail;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.et_nama);
        etemail = findViewById(R.id.et_email);
        btnlogin = findViewById(R.id.btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etnama.getText().toString();
                String email = etemail.getText().toString();

                if(Nama.trim().equals("")) {
                    etnama.setError("nama tidak boleh kosong");
                }
                else if(email.trim().equals("")) {
                    etemail.setError("Email tidak boleh kosong");
                }
                else{
                    Intent kirim = new Intent(MainActivity.this,KonfirmasiActivity.class);
                    kirim.putExtra("amplopNama",Nama);
                    kirim.putExtra("amplopEmail",email);
                    startActivity(kirim);
                }
            }
        });
    }
}