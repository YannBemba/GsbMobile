package com.example.gsbapp.Controlleurs.Animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.example.gsbapp.Controlleurs.Listes.ChoixCompteActivity;
import com.example.gsbapp.R;

public class OutroActivity extends AppCompatActivity {

    private static int TIME = 3000;

    LottieAnimationView mLottieAnimationViewIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_outro);

        mLottieAnimationViewIntro = (LottieAnimationView) findViewById(R.id.lottie_layer_outro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), ChoixCompteActivity.class);
                startActivity(intent);
                finish(); // Pour détruire l'activité en cas d'un call back
            }
        }, TIME);

    }

}