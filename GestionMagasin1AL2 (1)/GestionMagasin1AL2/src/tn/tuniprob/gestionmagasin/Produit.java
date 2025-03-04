package tn.tuniprob.gestionmagasin;

public class Produit {

  private   int identifiant;
 private    String marque,libelle;
  private   float prix;


  public void setPrix(float prix)
  {
      if(prix>0)
          this.prix=prix;
      else System.out.println("le prix doit être positif");
  }

  public float getPrix()
  {
      return prix;
  }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Produit(int id, String m, String libelle)
{

    this.identifiant=id;
    this.marque=m;
    this.libelle=libelle;
}
public Produit(int id,String m,String l,float p)
{

    this.identifiant=id;
    this.marque=m;
    this.libelle=l;
    this.prix=p;
}
    public Produit(String libelle,String mar,int id)
    {

        this.identifiant=id;
        this.marque=mar;
        this.libelle=libelle;
    }
public Produit(){}

    public void afficher(){

        System.out.println("L'identifiant :"+identifiant+" marque :"+marque+
                " libelle :"+libelle+" prix :"+prix);

    }

    public String toString(){
    return "L'identifiant :"+identifiant+" marque :"+marque+
            " libelle :"+libelle+" prix :"+prix;
    }

    public boolean comparer(Produit p)
    {
        if(this.identifiant==p.identifiant && this.marque==p.marque &&libelle==p.libelle &&prix==p.prix)
            return true;
        return false;

    }

    public static boolean comparer(Produit p1,Produit p2)
    {
        if(p1.identifiant==p2.identifiant && p1.marque==p2.marque &&p1.libelle==p2.libelle &&p1.prix==p2.prix)
            return true;
        return false;
    }
}
