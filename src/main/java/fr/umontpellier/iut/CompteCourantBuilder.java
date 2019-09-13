package fr.umontpellier.iut;

public class CompteCourantBuilder extends CompteBuilder{
    private double solde;
    private String iban;
    private String nomclient;
    private String adresse;
    private String numinsee;

    public CompteCourantBuilder setSolde(double solde) {
        this.solde = solde;
        return this;
    }

    public CompteCourantBuilder setIban(String iban) {
        this.iban = iban;
        return this;
    }

    public CompteCourantBuilder setNomclient(String nomclient) {
        this.nomclient = nomclient;
        return this;
    }

    public CompteCourantBuilder setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public CompteCourantBuilder setNuminsee(String numinsee) {
        this.numinsee = numinsee;
        return this;
    }


    @Override
    public Compte build() {
            return new CompteCourant(solde, iban, nomclient, adresse, numinsee);
    }
}