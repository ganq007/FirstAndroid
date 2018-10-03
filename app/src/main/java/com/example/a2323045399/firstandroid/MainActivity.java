package com.example.a2323045399.firstandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import static com.example.a2323045399.firstandroid.R.id.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载页面布局
        setContentView(R.layout.activity_main);
        //加载控件--文本框
        EditText editText =  findViewById(R.id.editText);
        //加载控件--按钮
        Button  button  = findViewById(R.id.button);
        //给按钮设置点击事件
        button.setOnClickListener(new ClickListener());
    }
    public
}
