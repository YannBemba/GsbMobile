package com.example.gsbapp.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;
import com.example.gsbapp.R;

public class IntroApp extends AppCompatActivity {

    private static int TIME = 4000;

    LottieAnimationView mLottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_app);

        mLottieAnimationView = findViewById(R.id.lottie_layer_name);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), AuthentificationActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME);

    }
}