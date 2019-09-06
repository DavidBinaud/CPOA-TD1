package fr.umontpellier.iut;

public abstract class Compte{

    private double solde;

    private String iban;

    private String nomclient;

    private String adresse;

    public Compte(double solde, String iban, String nomclient, String adresse) {
        this.solde = solde;
        this.iban = iban;
        this.nomclient = nomclient;
        this.adresse = adresse;
    }

    public double getSolde(){
        return solde;
    }

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }
}
