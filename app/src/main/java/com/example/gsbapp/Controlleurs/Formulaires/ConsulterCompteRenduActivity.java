package com.example.gsbapp.Controlleurs.Formulaires;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.gsbapp.R;

public class ConsulterCompteRenduActivity extends AppCompatActivity {


    private Spinner spinListMois, spinListAnnee;
    private Button btnConsulter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter);

        spinListMois = findViewById(R.id.spinListMois);
        spinListAnnee = findViewById(R.id.spinListAnnee);
        btnConsulter = findViewById(R.id.button_consulter);

        String[] listeMois = {"Janvier", "Fevrier", "Mai"};
        String[] listeAnnee = {"2020", "2019", "2018"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, listeMois);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, listeAnnee);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinListMois.setAdapter(adapter);
        spinListAnnee.setAdapter(adapter2);

        btnConsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConsulterCompteRenduActivity.this,
                        ListeCompteRenduActivity.class);

                startActivity(intent);
            }
        });

    }





}