package com.example.gsbapp.Modeles;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConnexionSQLite extends SQLiteOpenHelper {


    public static final String DB_NAME = "DBgsb.db";
    public static final int DB_VERSION = 1;

    private final Context context;
    private static ConnexionSQLite modele = null;







    // constructeur - Singleton
    public static ConnexionSQLite getInstance(Context context) {
        if (modele == null) {
            modele = new ConnexionSQLite(context);
        }
        return modele;
    }

    private ConnexionSQLite(Context context) {
        // crée un objet pour créer, ouvrir et gérer une BDD Sqlite
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase DB_NAME) {
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB_NAME, int i, int i1) {

    }

    /*final String create_table_visiteur = "CREATE TABLE visiteur (nom text, prenom text, adresse text, cp int, login text, mdp text);";
    final String create_table_1 = "CREATE TABLE CompteRendu (); ";
    final String create_table_3 = "CREATE TABLE  ();";


    public ConnexionSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase DBgsb) {
        DBgsb.execSQL(create_table_visiteur);

    }

    @Override
    public void onUpgrade(SQLiteDatabase DBgsb, int i, int i1) {
        DBgsb.execSQL("DROP TABLE IF EXISTS visiteur");
        onCreate(DBgsb);
    }*/
}
