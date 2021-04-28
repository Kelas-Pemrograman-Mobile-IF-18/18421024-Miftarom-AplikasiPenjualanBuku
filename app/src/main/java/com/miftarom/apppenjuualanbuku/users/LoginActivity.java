package com.miftarom.apppenjuualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.miftarom.apppenjuualanbuku.R;
import com.miftarom.apppenjuualanbuku.admin.HomeAdminActivity;
import com.ornach.nobobutton.NoboButton;

import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    Button btnRegis;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        getSupportActionBar().hide();

        btnLogin = (NoboButton) findViewById(R.id.LoginBtn);
        btnRegis = (Button) findViewById(R.id.btnRegis);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(LoginActivity.this, RegisActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}