package fr.umontpellier.iut;

public class ComptePro extends Compte {

    private String siren;

    public ComptePro(double solde, String iban, String nomclient, String adresse, String siren) {
        super(solde, iban, nomclient, adresse);
        this.siren = siren;
    }


    @Override
    public String toString() {
        return "ComptePro{" +
                super.toString() +
                "siren='" + siren + '\'' +
                '}';
    }
}
