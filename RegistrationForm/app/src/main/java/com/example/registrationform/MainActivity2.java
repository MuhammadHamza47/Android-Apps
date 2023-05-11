package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name, email, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name1);
        email = findViewById(R.id.email1);
        phone = findViewById(R.id.phone1);

        Intent intent = getIntent();
        String[] arr = intent.getStringArrayExtra("register");
        name.setText(arr[0]);
        email.setText(arr[1]);
        phone.setText(arr[2]);
    }
}