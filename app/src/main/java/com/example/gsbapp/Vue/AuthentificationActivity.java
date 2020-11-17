package com.example.gsbapp.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gsbapp.R;

public class AuthentificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

    }

    public void connexionReussie(View view){
        Intent intent = new Intent(this, SuccessConnexion.class);
        startActivity(intent);
    }


}