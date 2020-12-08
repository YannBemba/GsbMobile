package com.example.gsbapp.Modeles;

import android.os.Parcel;
import android.os.Parcelable;

public class Visiteur implements Parcelable {

    private static Visiteur visiteur = null;

    private int matricule;
    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String login;
    private String mdp;

    public Visiteur(){}

    public Visiteur(int matricule, String nom, String prenom, String adresse, String cp, String login, String mdp) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.login = login;
        this.mdp = mdp;
    }

    protected Visiteur(Parcel in) {
        matricule = in.readInt();
        nom = in.readString();
        prenom = in.readString();
        adresse = in.readString();
        cp = in.readString();
        login = in.readString();
        mdp = in.readString();
    }

    public static Visiteur getVisiteur() {
        if(visiteur.equals(null)) {
            visiteur = new Visiteur();
        }
        return visiteur;
    }

    //Création d'un objet CREATOR

    public static final Creator<Visiteur> CREATOR = new Creator<Visiteur>() {
        @Override
        public Visiteur createFromParcel(Parcel in) {
            return new Visiteur(in);
        }

        @Override
        public Visiteur[] newArray(int size) {
            return new Visiteur[size];
        }
    };

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean verifier(String login, String mdp) {
        return login.equals("Yann") && mdp.equals("1234");
    }

    public void stocker(){}

    //Description du contenu du Visiteur

    @Override
    public int describeContents() {
        return 0;
    }

    //Ecrire les champs de l'objet Visiteur

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(matricule);
        dest.writeString(nom);
        dest.writeString(prenom);
        dest.writeString(adresse);
        dest.writeString(cp);
        dest.writeString(login);
        dest.writeString(mdp);
    }

}
