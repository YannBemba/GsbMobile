package fr.sio.zi.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button bConsulter;
    Button bSaisir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bConsulter = (Button) findViewById(R.id.idConsulter);
        bConsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consulter();
            }
        });
        bSaisir = (Button) findViewById(R.id.idSaisir);
        bSaisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisir();
            }
        });


    }
    public void consulter() {
        Intent i = new Intent(this, Consulter.class);
        startActivity(i);
    }
    public void saisir() {
        Intent i = new Intent(this, Saisir.class);
        startActivity(i);
    }
}