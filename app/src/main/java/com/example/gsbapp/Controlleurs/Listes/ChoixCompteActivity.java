package com.example.gsbapp.Controlleurs.Listes;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gsbapp.Controlleurs.Formulaires.CompteRenduSaisieActivity;
import com.example.gsbapp.Controlleurs.Formulaires.ConsulterCompteRenduActivity;
import com.example.gsbapp.R;

public class ChoixCompteActivity extends AppCompatActivity {

    Button bConsulter, bSaisir;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_compte);

        bConsulter = findViewById(R.id.idConsulter);
        bSaisir = findViewById(R.id.idSaisir);

    }

    public void choixSaisie(View view) {
        switch (view.getId()){
            case R.id.idConsulter:
                consulter();
                break;

            case R.id.idSaisir:
                saisir();
                break;
        }
    }

    public void consulter() {
        startActivity(new Intent(ChoixCompteActivity.this, ConsulterCompteRenduActivity.class));
    }

    public void saisir() {
        startActivity(new Intent(ChoixCompteActivity.this, CompteRenduSaisieActivity.class));
    }

}