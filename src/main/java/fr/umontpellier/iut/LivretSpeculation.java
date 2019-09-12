package fr.umontpellier.iut;

public class LivretSpeculation extends Livret {

    private double taxe;

    private int nbtransaction;

    public LivretSpeculation(double solde, String iban, String nomclient, String adresse, double tauxinteret, double taxe) {
        super(solde, iban, nomclient, adresse, tauxinteret);
        this.taxe = taxe;
        this.nbtransaction = 0;
    }


    @Override
    public double getSolde() {
        return super.getSolde() - (taxe * nbtransaction);
    }

    public void setNbtransaction(int nbtransaction) {
        this.nbtransaction = nbtransaction;
    }

    @Override
    public String toString() {
        return "LivretSpeculation{" +
                super.toString() +
                " taxe=" + taxe +
                ", nbtransaction=" + nbtransaction +
                '}';
    }
}
