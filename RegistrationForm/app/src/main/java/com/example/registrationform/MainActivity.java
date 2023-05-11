package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText name1, email1, phone1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        name1 = findViewById(R.id.name);
        email1 = findViewById(R.id.email);
        phone1 = findViewById(R.id.phone);

//        button coding

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_var, email_var, phone_var;
                name_var = name1.getText().toString();
                email_var = email1.getText().toString();
                phone_var = phone1.getText().toString();
                String[] arr = {name_var, email_var, phone_var};
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("register", arr);
                startActivity(intent);

            }
        });
    }
}