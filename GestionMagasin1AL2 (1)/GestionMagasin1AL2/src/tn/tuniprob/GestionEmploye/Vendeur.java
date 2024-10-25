package tn.tuniprob.GestionEmploye;

public class Vendeur extends Employe {
    private int taux_Vente;

    public Vendeur() {

    }

    public Vendeur(int taux, int id, String n, String ad, int nb) {
        super(id, n, ad, nb);
        this.taux_Vente = taux;
    }

    public int getTaux_Vente() {
        return taux_Vente;
    }

    public void setTaux_Vente(int taux_Vente) {
        this.taux_Vente = taux_Vente;
    }
    public String toString(){
        return "Vendeur :"+super.toString()+" taux de vente :"+taux_Vente;
    }

    @Override
    public void test() {
        System.out.println("test vendeur");

    }
    public float calculSalaire()
    {
        return taux_Vente*nbH*20;
    }
}
