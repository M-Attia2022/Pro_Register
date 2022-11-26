package com.example.pro_colculetr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    EditText et1,et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.Colculetr_btn_add);
        btn2=findViewById(R.id.Colculetr_btn_t);
        btn3=findViewById(R.id.Colculetr_btn_a);
        btn4=findViewById(R.id.Colculetr_btn_d);
        et1=findViewById(R.id.Colculetr_et_num1);
        et2=findViewById(R.id.Colculetr_et_num2);
        tv=findViewById(R.id.Colculetr_tv_r);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(et1.getText().toString().trim());
                int n2=Integer.parseInt(et2.getText().toString());
                int r=n1+n2;
                tv.setText("R :"+r);
            }
        });btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int r=n1+n2;
                tv.setText(+r);
            }
        });btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int r=n1-n2;
                tv.setText("R :"+r);
            }
        });btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int r=n1/n2;
                tv.setText("R :"+r);
            }
        });btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int r=n1*n2;
                tv.setText("R :"+r);
            }
        });
    }
}