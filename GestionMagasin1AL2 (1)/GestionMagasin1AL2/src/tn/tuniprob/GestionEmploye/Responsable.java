package tn.tuniprob.GestionEmploye;

public class Responsable extends Employe{
    private float prime;

    public Responsable(){

    }
    public Responsable(int id, String n, String ad, int nb, float prime) {
        super(id, n, ad, nb);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public String toString(){
        return " Responsable :"+super.toString()+" Prime :"+prime;
    }
    public float calculSalaire()
    {
        return prime+nbH*40;
    }

    @Override
    public void test() {
        System.out.println("Responsable");

    }
}
