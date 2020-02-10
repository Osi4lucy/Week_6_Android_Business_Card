package com.androidapps.companybusinesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void aboutOnClick(View view){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void servicesOnClick(View view){
        Intent intent = new Intent(this, Services.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
