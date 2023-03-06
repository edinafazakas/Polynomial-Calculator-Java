package Model;

public class Monomial implements Comparable<Monomial>{
    private int coef;
    private int putere;
    public int checked = 0;

    public Monomial(int coef, int putere) {
        this.coef = coef;
        this.putere = putere;
    }

    public Monomial() {

    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public String Stringto(){
        return this.getCoef() + "*x^" + this.getPutere();
    }


    @Override
    public int compareTo(Monomial o) {
        return Integer.compare(getPutere(), o.getPutere());

    }
}
