package com.example.gsbapp.Controlleurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.gsbapp.R;

public class CompteRenduSaisieActivity extends AppCompatActivity {

    Spinner spinListPraticiens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compte_rendu_saisie);

        spinListPraticiens = (Spinner) findViewById(R.id.spinListPraticiens);

        String[] listePraticiens = new String[]{"Yann Bemba", "Childish Gambino", "Montell Fish"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                listePraticiens);

        spinListPraticiens.setAdapter(adapter);

    }

    public void prochaineSaisieCompteRendu(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondCompteRenduSaisieActivity.class);

        startActivity(intent);
    }


    public void annulerSaisie(View view) {
        //Intent intent = new Intent(getApplicationContext(), SecondCompteRenduSaisieActivity.class);
        Toast.makeText(getApplicationContext(), "Le compte rendu n'a pas été enregistré", Toast.LENGTH_LONG).show();
        //startActivity(intent);
    }
}