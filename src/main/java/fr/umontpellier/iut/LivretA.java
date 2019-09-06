package fr.umontpellier.iut;

public class LivretA extends Livret {

    private double plafond;

    public LivretA(double solde, String iban, String nomclient, String adresse, double tauxinteret, double plafond) {
        super(solde, iban, nomclient, adresse, tauxinteret);
        this.plafond = plafond;
    }

    @Override
    public String toString() {
        return "LivretA{" +
                super.toString() +
                "plafond=" + plafond +
                '}';
    }
}
