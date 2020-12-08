package com.example.gsbapp.Controlleurs.Formulaires;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gsbapp.Controlleurs.Listes.ChoixCompteActivity;
import com.example.gsbapp.R;

import java.util.ResourceBundle;

import www.sanju.motiontoast.MotionToast;

public class CompteRenduSaisieActivity extends AppCompatActivity {

    Spinner spinListPraticiens;
    DatePicker mDatePicker;
    //TextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compte_rendu_saisie);

        spinListPraticiens = (Spinner) findViewById(R.id.spinListPraticiens);
        mDatePicker = (DatePicker) findViewById(R.id.date_picker);

        String[] listePraticiens = new String[]{"Yann Bemba", "Childish Gambino", "Montell Fish"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                listePraticiens);

        int mois = mDatePicker.getMonth();
        int annee = mDatePicker.getYear();

        System.out.println("moisCreate : " + mois);
        System.out.println("annéeCreate : " + annee);

        spinListPraticiens.setAdapter(adapter);

    }

    public void prochaineSaisieCompteRendu(View view) {

        Intent intent = new Intent(this, SecondCompteRenduSaisieActivity.class);

        int jour, mois, annee, today;

        jour = mDatePicker.getDayOfMonth();
        mois = mDatePicker.getMonth() + 1;
        annee = mDatePicker.getYear();
        today = mDatePicker.getAutofillType();

        System.out.println("jour : " + jour);
        System.out.println("mois : " + mois);
        System.out.println("année : " + annee);



        startActivity(intent);

    }


    public void annulerSaisie(View view) {

        Intent intent = new Intent(CompteRenduSaisieActivity.this, ChoixCompteActivity.class);

        //Création du Motion Toast

        MotionToast.Companion.createToast(
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