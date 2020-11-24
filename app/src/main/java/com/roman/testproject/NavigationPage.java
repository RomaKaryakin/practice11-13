package com.roman.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NavigationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_page);
        getSupportActionBar().hide();
    }
}