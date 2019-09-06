package fr.umontpellier.iut;

public class LivretPlusPlus extends Livret {

    private double tauximposition;

    public LivretPlusPlus(double solde, String iban, String nomclient, String adresse, double tauxinteret, double tauximposition) {
        super(solde, iban, nomclient, adresse, tauxinteret);
        this.tauximposition = tauximposition;
    }
}
