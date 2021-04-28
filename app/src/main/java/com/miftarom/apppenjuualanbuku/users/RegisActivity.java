package com.miftarom.apppenjuualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.miftarom.apppenjuualanbuku.R;
import com.miftarom.apppenjuualanbuku.admin.HomeAdminActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
    }
    @OnClick(R.id.btnLogin)
    void Login(){
        Intent i =  new Intent(RegisActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(RegisActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}