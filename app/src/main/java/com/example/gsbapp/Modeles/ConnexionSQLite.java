package com.example.gsbapp.Modeles;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConnexionSQLite extends SQLiteOpenHelper {

    final String create_table_visiteur = "CREATE TABLE visiteur (nom text, prenom text, adresse text, cp int, login text, mdp text);";
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
    }
}
