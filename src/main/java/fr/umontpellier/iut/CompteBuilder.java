package fr.umontpellier.iut;
//Builder inheritance Class to search on google
public abstract class CompteBuilder<T extends CompteBuilder<T>> {
    private double solde;
    private String iban;
    private String nomclient;
    private String adresse;

    public T setSolde(double solde) {
        this.solde = solde;
        return self();
    }

    public T setIban(String iban) {
        this.iban = iban;
        return self();
    }

    public T setNomclient(String nomclient) {
        this.nomclient = nomclient;
        return self();
    }

    public T setAdresse(String adresse) {
        this.adresse = adresse;
        return self();
    }

    public abstract  T self();

    public abstract Compte build();
}