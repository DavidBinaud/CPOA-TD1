package fr.umontpellier.iut;

import java.util.ArrayList;
import java.util.List;

public class CompteGroupe extends Compte {

    private double prix;

    private List<Compte> listecompte;

    public CompteGroupe(String iban, String nomclient, String adresse, double prix) {
        super(0, iban, nomclient, adresse);
        this.prix = prix;
        this.listecompte = new ArrayList<>();
    }

    public void ajouterCompte(Compte c){
        listecompte.add((c));
    }

    public double getSolde(){
        double sommesolde = 0;
        for (Compte c: listecompte) {
            sommesolde += c.getSolde();
        }
        return sommesolde;
    }

    @Override
    public String toString() {
        String str = super.toString();
        int i = 1;
        for (Compte c: listecompte) {
            str += "\n\t" + c.toString();

        }
        return "\n\nCompteGroupe{" + "prix=" + prix + " " + str + "\n\n}" ;
    }
}
