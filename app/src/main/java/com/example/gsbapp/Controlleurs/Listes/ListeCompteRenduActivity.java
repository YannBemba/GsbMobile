package com.example.gsbapp.Controlleurs.Listes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.gsbapp.R;

import java.util.ArrayList;

public class ListeCompteRenduActivity extends AppCompatActivity {

    ListView listeComptes;
    Button btnConsulterListe;
    private String[] comptes = {"Bemba Yann","Montell Fish","Compt 3","Compt 4"};

    //private List<String> comptes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_compte_rendu);

        //listeComptes = (ListView) findViewById(R.id.compteRendu);
        btnConsulterListe = (Button) findViewById(R.id.retourMenu);
        listeComptes = (ListView) findViewById(R.id.listCompteRendu);

        ArrayAdapter<String> adaptateur = new ArrayAdapter<String>(
                this ,android.R.layout.simple_list_item_1,
                comptes);

        listeComptes.setAdapter(adaptateur) ;

        btnConsulterListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeCompteRenduActivity.this,
                        ChoixCompteActivity.class);
                startActivity(intent);
            }
        });

    }
}