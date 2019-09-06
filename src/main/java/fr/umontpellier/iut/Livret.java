package fr.umontpellier.iut;

public abstract class Livret extends Compte{

    private double tauxinteret;

    public Livret(double solde, String iban, String nomclient, String adresse, double tauxinteret) {
        super(solde, iban, nomclient, adresse);
        this.tauxinteret = tauxinteret;
    }

    @Override
    public double getSolde() {
        return super.getSolde() * (1 + tauxinteret);
    }
}
