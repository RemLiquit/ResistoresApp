package com.example.resitoresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnPlayer,btnIa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnPlayer = findViewById(R.id.btnPlayer);
        btnPlayer = findViewById(R.id.btnIA);
    }
    public void btnAi(View v){
        Intent intent = new Intent(HomeActivity.this,GameIaActivity.class);
        startActivity(intent);
        finish();
    }
    public void btnPlayer(View v){
        Intent intent = new Intent(HomeActivity.this,GamePlayerActivity.class);
        startActivity(intent);
        finish();
    }
}