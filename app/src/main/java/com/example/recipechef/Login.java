package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
  TextView tvRecipe;
  EditText txtGmail;
  EditText txtPassword;
  Button   btnmasuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    tvRecipe =findViewById(R.id.tvRecipe);
    txtGmail = findViewById(R.id.txtgmail);
    txtPassword= findViewById(R.id.txtpassword);
    btnmasuk = findViewById(R.id.btnmasuk);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Gmail = txtGmail.getText().toString();
                if (Gmail.equals("admin")) {
                    Toast.makeText(getApplicationContext(), "sukses login", Toast.LENGTH_LONG).show();
                    Intent o = new Intent( Login.this,Dasboard.class);
                    startActivity(o);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(),"gagal login",Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
