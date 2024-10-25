package tn.tuniprob.GestionEmploye;

public  abstract class Employe {

    protected int identifiant;
    protected  String nom,adresse;
    protected  int nbH;

    public Employe(){
        System.out.println("je suis employe par defaut");
    }
    public Employe(int id,String nom)
    {
        this.identifiant=id;
        this.nom=nom;
        System.out.println("je suis le constructeur à deux paramètres");
    }

    public Employe (int id,String n,String ad,int nb)
    {

        this(id,n);
        this.adresse=ad;
        nbH=nb;
        System.out.println("Employe 4 paramètres");
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbH() {
        return nbH;
    }

    public void setNbH(int nbH) {
        this.nbH = nbH;
    }


    public String toString()
    {
        return "identifiant :"+identifiant+" nom :"+nom+" adresse :"+adresse+" nombre d'heure "+nbH;
    }

    public abstract void test();


    public abstract float calculSalaire();


    public boolean equals(Object o)
    {if (o==this) return true;
       if(o==null) return false;
       if (o.getClass()!=this.getClass()) return false;

        Employe emp = (Employe)o;
        if(emp.nbH==this.nbH && emp.adresse.equals(this.adresse)&&emp.nom.equals(this.nom)&&emp.identifiant == this.identifiant)
            return true;
        return false;
    }
}
