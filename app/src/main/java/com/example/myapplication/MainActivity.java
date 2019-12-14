package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Object Intent;
    private Button mBtnEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //跳转到TextView演示界面
                Intent intent= new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button演示界面
                Intent intent= new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText =(Button) findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到EditText演示界面
                Intent intent= new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}
