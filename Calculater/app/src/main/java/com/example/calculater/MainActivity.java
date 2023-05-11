package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText value1,value2;

    Button addbtn,subbtn,multibtn,dividbtn,resultbtn;

    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        addbtn = findViewById(R.id.addbtn);
        subbtn = findViewById(R.id.subbtn);
        multibtn = findViewById(R.id.mltibtn);
        dividbtn = findViewById(R.id.dividebtn);
        result = findViewById(R.id.result);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Val1 = Float.parseFloat(value1.getText().toString());
                float VAl2 = Float.parseFloat(value2.getText().toString());
                float resadd = (float) (Val1 + VAl2);
                result.setText(String.format(String.valueOf(resadd)));

            }
        });





        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Val1 = Float.parseFloat(value1.getText().toString());
                float VAl2 = Float.parseFloat(value2.getText().toString());
                float resub = (float) (Val1 - VAl2);
                result.setText(String.format(String.valueOf(resub)));


            }
        });

        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Val1 = Float.parseFloat(value1.getText().toString());
                float VAl2 = Float.parseFloat(value2.getText().toString());
                float remul = (float) (Val1 * VAl2);
                result.setText(String.format(String.valueOf(remul)));


            }
        });

        dividbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Val1 = Float.parseFloat(value1.getText().toString());
                float VAl2 = Float.parseFloat(value2.getText().toString());
                float redivide = (float) (Val1 / VAl2);
                result.setText(String.format(String.valueOf(redivide)));


            }
        });

    }
}