package tn.tuniprob.GestionEmploye;

public class Caissier extends Employe{
    private int numCaisse;



    public Caissier(int numC,int id,String n)
    {

        this.numCaisse=numC;
    }

    public Caissier(){

    }
    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    public String toString()
    {
        return " Caissier "+super.toString()+" num Caisse :"+numCaisse;
    }

    public void testtoString()
    {
        System.out.println(" super :"+super.toString());
        System.out.println("this "+toString());
    }

    @Override
    public void test() {
        System.out.println("caissier");
    }
    public float calculSalaire()
    {
        return nbH*30;
    }
}
