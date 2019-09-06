package fr.umontpellier.iut;

public class LivretSpeculation extends Livret {

    private double taxe;

    private int nbtransaction;

    public LivretSpeculation(double solde, String iban, String nomclient, String adresse, double tauxinteret, double taxe) {
        super(solde, iban, nomclient, adresse, tauxinteret);
        this.taxe = taxe;
        this.nbtransaction = 0;
    }
}
