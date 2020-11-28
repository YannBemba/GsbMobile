package fr.sio.zi.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Consulter extends AppCompatActivity {
    ListView Compte;
    private String[] compte = {"Compt 1","Compt 2","Compt 3","Compt 4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter);
        Compte = (ListView) findViewById(R.id.CompteRendu);
        ArrayAdapter<String> adaptateur = new ArrayAdapter<String>(
                this ,android.R.layout.simple_list_item_1 , compte );
        Compte.setAdapter( adaptateur ) ;
    }
}