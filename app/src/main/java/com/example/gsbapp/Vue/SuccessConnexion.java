package com.example.gsbapp.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.example.gsbapp.R;

public class SuccessConnexion extends AppCompatActivity {

    private static int TIME = 3000;
    LottieAnimationView mLottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_success_connexion);

        mLottieAnimationView = findViewById(R.id.lottie_layer_name);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), CompteRenduActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME);

    }
}