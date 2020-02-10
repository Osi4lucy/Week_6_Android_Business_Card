package com.androidapps.companybusinesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Services extends AppCompatActivity {

    public void contactUsOnClick(View view) {
    Intent intent = new Intent(this, ContactUs.class);
    startActivity(intent);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
    }
}
