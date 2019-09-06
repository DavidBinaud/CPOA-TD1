package fr.umontpellier.iut;

public class CompteCourant extends Compte {
    private String numinsee;

    public CompteCourant(double solde, String iban, String nomclient, String adresse, String numinsee) {
        super(solde, iban, nomclient, adresse);
        this.numinsee = numinsee;
    }
}
