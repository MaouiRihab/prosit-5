package tn.tuniprob.GestionEmploye;

import tn.tuniprob.gestionmagasin.Magasin;

public class Test {

    public static void main(String[] args) {
        //Employe e1 = new Employe();

        Caissier c1 = new Caissier();

        Caissier c2 = new Caissier(1, 12, "nom1");


        System.out.println(" id " + c2.getIdentifiant());
        System.out.println("nom :" + c2.getNom());
        System.out.println("num caisse :" + c2.getNumCaisse());
        System.out.println(c2);

        c2.testtoString();

        System.out.println("Vendeur");
        Vendeur v1 = new Vendeur();
        System.out.println("V2");

        Vendeur v2 = new Vendeur(20, 2, "nom1", "ariana", 10);

        Vendeur v3 = new Vendeur(50, 1, "nom", "adree", 30);

        Responsable res1 = new Responsable(1, "nom", "adree", 30, 500);

        Responsable res2 = new Responsable(2, "nom2", "adree2", 15, 300);

        Responsable res3 = new Responsable(2, "nom2", "adree2", 15, 300);

        System.out.println("id :" + v2.getIdentifiant());
        System.out.println(" nom :" + v2.getNom());

        System.out.println("adresse :" + v2.getAdresse());
        System.out.println("taux de vente :" + v2.getTaux_Vente());


        Magasin m1 = new Magasin(1, "tunis", "carrefour");
        m1.ajouter(res2);
        m1.ajouter(v2);
        m1.ajouter(v3);
        m1.ajouter(v1);
        m1.ajouter(c1);

        m1.ajouter(c2);
        m1.ajouter(res1);
        c2.setNbH(40);
        m1.afficherNomEmploye();

        m1.afficherEmploye();
        m1.test();

        m1.afficherSalaire();

        Employe emp = new Responsable(1, "nnn", "ariana", 14, 200);

        System.out.println(emp.toString());

        if (emp instanceof Responsable) {
            Responsable res = (Responsable) emp;

            System.out.println("Prime :" + res.getPrime());
            System.out.println("Prime :"+((Responsable) emp).getPrime());
        } else {
            System.out.println("ce n'est pas un responsable");
        }
        if (emp instanceof Vendeur) {
            Vendeur vend = (Vendeur) emp;

            System.out.println("Taux de vente" + vend.getTaux_Vente());

        } else {
            System.out.println("ce n'est pas un Vendeur");
        }
        m1.affichePrime();

        m1.afficherNbEmpparType();


        System.out.println(res2.equals(res3));


        String str="abc";

        System.out.println(str.equals(v1));

        System.out.println(v1.equals(str));

        System.out.println(res1.equals(v3));

        System.out.println(res1.getClass());
        System.out.println(v3.getClass());
    }
}
