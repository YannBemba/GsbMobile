package com.example.gsbapp.Controlleurs.Formulaires;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gsbapp.Controlleurs.Animations.SuccessConnexionActivity;
import com.example.gsbapp.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class AuthentificationActivity extends AppCompatActivity {

    private TextInputLayout mPseudo;
    private TextInputLayout mMdp;
    private Button mValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        mPseudo = (TextInputLayout) findViewById(R.id.pseudo);
        mMdp =  (TextInputLayout) findViewById(R.id.mdp);
        mValider = (Button) findViewById(R.id.validerConnxeion);

    }

    public void seConnecter(View view){

        String nomPseudo = String.valueOf(mPseudo.getEditText().getText());
        String mdp = String.valueOf(mMdp.getEditText().getText());

        System.out.println(nomPseudo);

        if(nomPseudo.equals("Yann") && mdp.equals("1234")){
            Intent intent = new Intent(this, SuccessConnexionActivity.class);
            startActivity(intent);

        } else {

            //Afficher la snackbar en cas d'erreur de connexion

            Snackbar snackbar = Snackbar.make(view,
                    "Identifiant et/ou mot de passe incorrect",
                    Snackbar.LENGTH_LONG);

            snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            snackbar.setAction("OK", new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            snackbar.show();

        }

    }


}