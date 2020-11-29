package com.example.gsbapp.Controlleurs.Formulaires;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.gsbapp.Controlleurs.Listes.ChoixCompteActivity;
import com.example.gsbapp.R;

import java.util.ResourceBundle;

import www.sanju.motiontoast.MotionToast;

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
        startActivity(new Intent(getApplicationContext(), SecondCompteRenduSaisieActivity.class));
    }


    public void annulerSaisie(View view) {

        Intent intent = new Intent(CompteRenduSaisieActivity.this, ChoixCompteActivity.class);

        //Création du Motion Toast

        MotionToast.Companion.darkToast(
                CompteRenduSaisieActivity.this,
                "SAISIE ANNULE",
                "Votre compte rendu n'a pas été enregistré",
                MotionToast.TOAST_DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, R.font.montserrat_regular)
        );

        startActivity(intent);
        finish(); //Détruire l'activité
    }
}