package fr.umontpellier.iut;

public class App {
    public static void main(String[] args) {

        Compte courant = new CompteCourant(3000,"FR76232313","Sarlin","Juvignac 150 rue de la bitch","120001546464");


        Compte pro = new ComptePro(10000,"FR1310588","Binaud","75 rue des lavandes","siren1451");

        Compte livreta = new LivretA(650,"FR762115498","Bernadas","Clapiers avenue des pigeonniers",0.2,7500);

        Compte livretplus = new LivretPlusPlus(1300,"FR15878423","Capell","derriere la fac de medecine",0.3,0.15);

        Compte livretspec = new LivretSpeculation(2400,"FR224564651","Manelphe","idontknow",0.5,0.3);

        System.out.println(courant.toString());
        System.out.println(pro.toString());
        System.out.println(livreta.toString());
        System.out.println(livretplus.toString());
        System.out.println(livretspec.toString());



        livretspec.setPlafonddecouvert(5000);


        System.out.println(livretspec.toString());



    }
}
