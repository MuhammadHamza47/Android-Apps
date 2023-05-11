package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView animationView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = findViewById(R.id.lottieAnimationView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationView.setVisibility(View.VISIBLE);
                btn.setVisibility(View.INVISIBLE);
                animationView.playAnimation();

                Thread thread = new Thread(){

                    public void run(){
                        try {
                            sleep(2000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
    }
}