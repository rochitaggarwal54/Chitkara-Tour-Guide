package com.example.android.welcomeguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class galelioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galelio);
    }
    void gotoPhone1(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9825825698"));
        startActivity(phoneActivity);

    }
    void gotoPhone2(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9125825698"));
        startActivity(phoneActivity);

    }
    void gotoPhone3(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"1234567899"));
        startActivity(phoneActivity);

    }
    void gotoPhone4(View v){
        Intent phoneActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9125825698"));
        startActivity(phoneActivity);

    }
}
