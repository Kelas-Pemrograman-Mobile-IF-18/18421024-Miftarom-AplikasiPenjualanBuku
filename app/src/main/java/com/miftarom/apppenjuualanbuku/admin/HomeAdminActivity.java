package com.miftarom.apppenjuualanbuku.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.miftarom.apppenjuualanbuku.R;
import com.miftarom.apppenjuualanbuku.users.LoginActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        ButterKnife.bind(this);
//        getSupportActionBar().hide();
    }
    @OnClick(R.id.btnKeluar)
    void keluar() {
        Intent i = new Intent(HomeAdminActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(HomeAdminActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}
