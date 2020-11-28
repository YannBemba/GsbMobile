package com.example.gsbapp.Controlleurs.Formulaires;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.gsbapp.Controlleurs.Animations.OutroActivity;
import com.example.gsbapp.Controlleurs.Listes.ChoixCompteActivity;
import com.example.gsbapp.R;

public class SecondCompteRenduSaisieActivity extends AppCompatActivity {

    private Spinner spinListMotifs, spinListCoeffConfiance;
    Button btnConfirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_compte_rendu_saisie);

        spinListMotifs = (Spinner) findViewById(R.id.spinListPraticiens);
        spinListCoeffConfiance = (Spinner) findViewById(R.id.spinListCoeffConfiance);
        btnConfirmation = (Button) findViewById(R.id.btnConfirmation) ;

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

    public void annulerSaisie(View view) {
        Toast.makeText(getApplicationContext(),
                "Le compte rendu n'a pas été enregistré",
                Toast.LENGTH_LONG)
                .show();

        startActivity(new Intent(getApplicationContext(), ChoixCompteActivity.class));
    }

    public void confirmationSaisie(View view) {
        Intent intent = new Intent(getApplicationContext(), OutroActivity.class);
        Toast.makeText(getApplicationContext(),
                "Le compte rendu a bien été enregisré",
                Toast.LENGTH_LONG)
                .show();
        startActivity(intent);
        finish();

    }
}