package fr.umontpellier.iut;

public class App {
    public static void main(String[] args) {

        //Compte courant = new CompteCourantBuilder().setSolde(3000).setIban("FR76232313").setNomclient("Sarlin").setAdresse("Juvignac 150 rue de la bitch").setNuminsee("120001546464").createCompteCourant();


        Compte pro = new ComptePro(10000,"FR1310588","Binaud","75 rue des lavandes","siren1451");

        Compte livreta = new LivretA(650,"FR762115498","Bernadas","Clapiers avenue des pigeonniers",0.2,7500);

        Compte livretplus = new LivretPlusPlus(1300,"FR15878423","Capell","derriere la fac de medecine",0.3,0.15);

        Compte livretspec = new LivretSpeculation(2400,"FR224564651","Manelphe","idontknow",0.5,0.3);
        /*
        System.out.println(courant.toString());
        System.out.println(pro.toString());
        System.out.println(livreta.toString());
        System.out.println(livretplus.toString());
        System.out.println(livretspec.toString());



        livretspec.setPlafonddecouvert(5000);

         */

        System.out.println(livretspec.toString());


        CompteGroupe groupeA = new CompteGroupe("FR84512235","Tintin Duchmolle","chez Dorian",50);
        CompteGroupe groupeB = new CompteGroupe("FR845415125","RINRIN TUCHMOLLE","chez nath",90);

        //groupeA.ajouterCompte(courant);
        groupeA.ajouterCompte(groupeB);

        groupeB.ajouterCompte(livretspec);
        groupeB.ajouterCompte(livreta);
        groupeB.ajouterCompte(livretplus);


        System.out.println(groupeA.getSolde());
        System.out.println("\n" + groupeA);


    }
}
