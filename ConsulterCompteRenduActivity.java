package com.example.gsbapp.Controlleurs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.gsbapp.R;

public class ConsulterCompteRenduActivity extends AppCompatActivity {


    private Spinner planets_spinner, planets_spinner3  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter_compte_rendu);

        planets_spinner = findViewById(R.id.planets_spinner);
        planets_spinner3 = findViewById(R.id.planets_spinner3);

        String[] ListeMois = {"Janvier", "Fevrier", "Mai"};
        String[] ListeAnnee = {"Janvier", "Fevrier", "Mai"};



// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, ListeMois);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, ListeAnnee);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        planets_spinner.setAdapter(adapter);
        planets_spinner3.setAdapter(adapter1);
    }
}