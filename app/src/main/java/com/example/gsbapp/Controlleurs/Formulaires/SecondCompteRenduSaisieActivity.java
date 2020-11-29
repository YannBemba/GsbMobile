package com.example.gsbapp.Controlleurs.Formulaires;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.content.res.ResourcesCompat;

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

import www.sanju.motiontoast.MotionToast;

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

        Intent intent = new Intent(this, ChoixCompteActivity.class);

        MotionToast.Companion.darkToast(
                SecondCompteRenduSaisieActivity.this,
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

    public void confirmationSaisie(View view) {

        Intent intent = new Intent(getApplicationContext(), OutroActivity.class);

        //Création du Motion Toast

        MotionToast.Companion.createToast(
                SecondCompteRenduSaisieActivity.this,
                "Succès",
                "Compte rendu bien enregistré",
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, R.font.helvetica_regular)
        );

        startActivity(intent);
        finish(); //Détruire l'activité

    }
}