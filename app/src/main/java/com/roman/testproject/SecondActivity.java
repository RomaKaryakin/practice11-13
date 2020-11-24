package com.roman.testproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView, hintButt;
    Button button;
    EditText phone, pss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();
        onCreateListener();
    }

    private void onCreateListener() {
        textView = (TextView)findViewById(R.id.textView2);
        button = (Button)findViewById(R.id.button2);
        phone = (EditText)findViewById(R.id.editTextPhone);
        pss = (EditText)findViewById(R.id.editTextTextPassword);
        hintButt = (TextView)findViewById(R.id.hintReg);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.unicourse.kz"));
                startActivity(browserIntent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, NavigationPage.class);
                if (phone.getText().toString().equals("87079496953") && pss.getText().toString().equals("qwerty")){
                    startActivity(intent);
                }else{
                    hintButt.setText("Не верный логин или пароль");
                }
            }
        });
    }
}