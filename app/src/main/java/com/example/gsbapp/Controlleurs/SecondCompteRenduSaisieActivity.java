package com.example.gsbapp.Controlleurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.gsbapp.R;

public class SecondCompteRenduSaisieActivity extends AppCompatActivity {

    Spinner spinListMotifs, spinListCoeffConfiance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_compte_rendu_saisie);

        spinListMotifs = (Spinner) findViewById(R.id.spinListPraticiens);
        spinListCoeffConfiance = (Spinner) findViewById(R.id.spinListCoeffConfiance);

        String[] listeMotifs = new String[]{"Très bien", "", ""};
        String[] listeConfiances = new String[]{"Praticien convaincu", "Hésitant", "Non convaincu"};

        ArrayAdapter<String> listMotifsAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                listeMotifs);

        ArrayAdapter<String> listConfianceAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, listeConfiances);

        spinListMotifs.setAdapter(listMotifsAdapter);
        spinListCoeffConfiance.setAdapter(listConfianceAdapter);

    }


    public void prochaineSaisieCompteRendu2(View view) {
        Intent intent = new Intent(this, ThirdCompteRenduSaisieActivity.class);
        startActivity(intent);
    }

    public void annulerSaisie(View view) {
        //Intent intent = new Intent(getApplicationContext(), SecondCompteRenduSaisieActivity.class);
        Toast.makeText(getApplicationContext(), "Le compte rendu n'a pas été enregistré", Toast.LENGTH_LONG).show();
        //startActivity(intent);
    }

    public void confirmationSaisie(View view) {

    }
}