package tn.tuniprob.gestionmagasin;

import tn.tuniprob.GestionEmploye.Caissier;
import tn.tuniprob.GestionEmploye.Employe;
import tn.tuniprob.GestionEmploye.Responsable;
import tn.tuniprob.GestionEmploye.Vendeur;

public class Magasin {

    private int identifiant;
    private String adresse;

    private final int CAPCITE = 2;

    private Produit[] tabprod = new Produit[CAPCITE];

    private int comp;

    private static int totalP;

    private final int CAPACITE_EMP=20;

    private Employe [] tabEmp=new Employe[CAPACITE_EMP];

    private int compE;

    private String nom;
    public Magasin() {
    }

    public Magasin(int id, String ad) {
        identifiant = id;
        adresse = ad;
    }
    public Magasin(int id, String ad,String nom) {
        identifiant = id;
        adresse = ad;
        this.nom=nom;
    }

    public void ajouter(Employe e)
    {
       if(compE<CAPACITE_EMP){
           tabEmp[compE]=e;
           compE++;
       }
       else{
           System.out.println("Magasin plein");
       }
    }
    public void ajouter (Produit p) throws MagasinPleinException, PrixNegatifException {
        if (p.getPrix() < 0) {
            throw new PrixNegatifException("Erreur : Le prix du produit ne peut pas être négatif !");
        }

        if (comp >= CAPCITE) {
            throw new MagasinPleinException("Erreur : Le magasin est plein, impossible d'ajouter plus de produits.");
        }

        tabprod[comp] = p;
        comp++;
        totalP++;
    }



    public void afficherNomEmploye()
    {
       for (int i=0;i<compE;i++)
           System.out.println(" nom :"+tabEmp[i].getNom());
    }

    public void afficherEmploye()
    {
        for (int i=0;i<compE;i++)
        {
            System.out.println(tabEmp[i]);
        }
    }

    public void test()
    {
        for (int i=0;i<compE;i++)
           tabEmp[i].test();
    }
    public void afficherSalaire()
    {

        for(int i=0;i<compE;i++)
        {
            System.out.println(tabEmp[i]+"salaire "+tabEmp[i].calculSalaire());
        }
    }

    public void affichePrime()
    {

        for (int i= 0;i<compE;i++)
        {if(tabEmp[i] instanceof Responsable) {
            Responsable res = (Responsable) tabEmp[i];
            System.out.println("prime :" + res.getPrime());
        }else{
            System.out.println("ce n'est pas un responsable");
        }
        }
    }
    public void afficherNbEmpparType()
    {
        int nbC=0,nbV=0,nbR=0;

        for (int i=0;i<compE;i++)
        {
            if(tabEmp[i] instanceof Responsable) {
                nbR++;
            }
            if(tabEmp[i] instanceof Caissier) {
                nbC++;
            }
            if(tabEmp[i] instanceof Vendeur) {
                nbV++;
            }
        }

        System.out.println("le nombre de caissier :"+nbC);
        System.out.println("le nombre de vendeur :"+nbV);
        System.out.println("le nombre de responsable :"+nbR);
    }
    public int chercherIndi(Produit p) {
        for (int i = 0; i < comp; i++) {
            if (Produit.comparer(tabprod[i], p))
                return i;
        }
        return -1;
    }

    public boolean supprimer(Produit p) {
        int indice = chercherIndi(p);

        if (indice != -1) {
            for (int i = indice; i <= comp - 1; i++) {
                tabprod[i] = tabprod[i + 1];
            }

            tabprod[comp] = null;
            comp--;
            totalP--;
            return true;
        }
        return false;

    }

    public Magasin plusProduit(Magasin m1)
    {

        if(m1.comp>this.comp)
            return m1;
        else if (m1.comp<this.comp) {
            return this;
        }
        return null;
    }

    public static Magasin plusProduit(Magasin m1,Magasin m2)
    {

        if(m1.comp>m2.comp)
            return m1;
        else if (m1.comp<m2.comp) {
            return m2;
        }
        return null;
    }


    public boolean chercher(Produit p) {
        for (int i = 0; i < comp; i++) {
            if (tabprod[i].comparer(p))
                return true;
        }

        return false;
    }

    public static int getTotalP() {
        return totalP;
    }

    public void afficherMarquePr() {
        for (int i = 0; i < comp; i++)
            System.out.println("Marque :" + tabprod[i].getMarque());
    }

    public String toString() {
        String str = "L'ensemble des produits :\n";
        for (int i = 0; i < comp; i++)
            str += tabprod[i] + "\n";

        return "identifiant ;" + identifiant + " adresse :" + adresse + "\n" + str;

    }
}
