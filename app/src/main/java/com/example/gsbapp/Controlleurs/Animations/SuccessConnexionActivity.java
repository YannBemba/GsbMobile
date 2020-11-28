package com.example.gsbapp.Controlleurs.Animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.example.gsbapp.Controlleurs.ChoixCompteActivity;
import com.example.gsbapp.R;

public class SuccessConnexionActivity extends AppCompatActivity {

    private static int TIME = 3000;

    LottieAnimationView mLottieAnimationViewSuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_success_connexion);

        mLottieAnimationViewSuccess = findViewById(R.id.lottie_success);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SuccessConnexionActivity.this, ChoixCompteActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME);

    }
}