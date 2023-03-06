package Controller;

import Model.Monomial;
import Model.Polynomial;
import View.Calculator;
import com.sun.deploy.panel.ControlPanel;

import java.util.Collections;

public class Controller {
    public void setP(Polynomial p) {
        this.p = p;
    }

    public Polynomial getP() {
        return p;
    }

    private Polynomial p;

    public Polynomial addition(Polynomial polynom2)
    {
        Polynomial p3 = new Polynomial();
        Monomial var3;
        int found;
        for (Monomial var1: this.p.getPolynom1()){
            found = 0;
            for(Monomial var2: polynom2.getPolynom1()) {
                if (var1.getPutere() == var2.getPutere()) {
                    var3 = new Monomial();
                    var3.setCoef(var1.getCoef() + var2.getCoef());
                    var3.setPutere(var1.getPutere());
                    p3.getPolynom1().add(var3);
                    var1.checked = 1;
                    var2.checked = 1;
                    found++;
                }
            }
            if(found == 0)
                p3.getPolynom1().add(var1);
        }

        for(Monomial var2: polynom2.getPolynom1()) {
            if(var2.checked == 0)
                p3.getPolynom1().add(var2);
        }
        return p3;
    }

    public Polynomial subtract(Polynomial polynom2)
    {
        Polynomial p3 = new Polynomial();
        Monomial var3;
        int found;
        for (Monomial var1: this.p.getPolynom1()){
            found = 0;
            for(Monomial var2: polynom2.getPolynom1()) {
                if (var1.getPutere() == var2.getPutere()) {
                    var3 = new Monomial();
                    var3.setCoef(var1.getCoef() - var2.getCoef());
                    var3.setPutere(var1.getPutere());
                    p3.getPolynom1().add(var3);
                    var1.checked = 1;
                    var2.checked = 1;
                    found++;
                }
            }
            if(found == 0) {
                p3.getPolynom1().add(var1);
            }
        }

        for(Monomial var2: polynom2.getPolynom1()) {
            if (var2.checked == 0) {
                var2.setCoef(-var2.getCoef());
                p3.getPolynom1().add(var2);
            }
        }
        return p3;
    }


    public Polynomial multiplication(Polynomial polynom2) {
        Polynomial p3 = new Polynomial();
        Monomial var3;
        for (Monomial var1 : this.p.getPolynom1()) {
            for (Monomial var2 : polynom2.getPolynom1()) {
                var3 = new Monomial();
                var3.setCoef(var1.getCoef() * var2.getCoef());
                var3.setPutere(var1.getPutere() + var2.getPutere());
                p3.getPolynom1().add(var3);
            }
        }
        Polynomial p4 = new Polynomial();
        for (Monomial var4 : p3.getPolynom1()) {
            Monomial var6 = new Monomial(var4.getCoef(), var4.getPutere());
            if(var4.checked == 0) {
                for (Monomial var5 : p3.getPolynom1()) {
                    if (var4.getPutere() == var5.getPutere() && var4 != var5 && var4.checked != 1) {
                        var6.setCoef(var6.getCoef() + var5.getCoef());
                        var5.checked = 1;
                    }
                }
                p4.getPolynom1().add(var6);
                var4.checked = 1;
            }
        }
        Polynomial.print(p3);
        for(Monomial var4 : p3.getPolynom1())
            if(var4.checked == 0)
                p4.getPolynom1().add(var4);
        return p4;
    }


    public Polynomial derivation() {
        Polynomial p3 = new Polynomial();
        for (Monomial var1 : this.p.getPolynom1()) {
            if (var1.getPutere() != 0) {
                Monomial var2 = new Monomial();
                var2.setCoef(var1.getCoef() * var1.getPutere());
                var2.setPutere(var1.getPutere() - 1);
                p3.getPolynom1().add(var2);
            }
        }
        return p3;
    }

    public Polynomial integration() {
        Polynomial p3 = new Polynomial();
        for (Monomial var1 : this.p.getPolynom1()) {
            if (var1.getPutere() != 0) {
                Monomial var2 = new Monomial();
                var2.setPutere(var1.getPutere() + 1);
                var2.setCoef(var1.getCoef());
                p3.getPolynom1().add(var2);
            }
        }
        return p3;
    }

    public Polynomial dividesr(Polynomial p2) {
        Polynomial p3 = new Polynomial();
        Collections.sort(p2.getPolynom1(), Collections.reverseOrder());
        Collections.sort(this.p.getPolynom1(), Collections.reverseOrder());
        //Polynomial q = new Polynomial();
        Polynomial r = new Polynomial();
        if(p2.getPolynom1() != null) {
            //q = new Polynomial();
            r = new Polynomial(p2.getPolynom1());
        }

        for(Monomial var1 : r.getPolynom1())
            for(Monomial var2 : p2.getPolynom1())
                if (r.getPolynom1() != null && var1.getPutere() >= var2.getPutere()){
                    Monomial t = new Monomial();
                    Polynomial t1 = new Polynomial();
                    t.setCoef(var1.getCoef() / var2.getCoef());
                    t.setPutere(var1.getPutere() - var2.getPutere());
                    //q.getPolynom1().add(t);
                    t.setCoef(-t.getCoef());
                    t1.getPolynom1().add(t);
                    Controller c = new Controller();
                    Controller c1 = new Controller();
                    c.setP(p2);
                    c1.setP(r);
                    p3 = c.multiplication(t1);
                    r = c1.subtract(p3);
                }
        return r;
    }

    public Polynomial dividesq(Polynomial p2) {
        Polynomial p3 = new Polynomial();
        Collections.sort(p2.getPolynom1(), Collections.reverseOrder());
        Collections.sort(this.p.getPolynom1(), Collections.reverseOrder());
        Polynomial q = new Polynomial();
        Polynomial r = new Polynomial();
        if(p2.getPolynom1() != null) {
            q = new Polynomial();
            r = new Polynomial(p2.getPolynom1());
        }

        for(Monomial var1 : r.getPolynom1())
            for(Monomial var2 : p2.getPolynom1())
                if (r.getPolynom1() != null && var1.getPutere() >= var2.getPutere()){
                    Monomial t = new Monomial();
                    Polynomial t1 = new Polynomial();
                    t.setCoef(var1.getCoef() / var2.getCoef());
                    t.setPutere(var1.getPutere() - var2.getPutere());
                    q.getPolynom1().add(t);
                    t.setCoef(-t.getCoef());
                    t1.getPolynom1().add(t);
                    Controller c = new Controller();
                    Controller c1 = new Controller();
                    c.setP(p2);
                    c1.setP(r);
                    p3 = c.multiplication(t1);
                    r = c1.subtract(p3);
                }
        return q;
    }

    public static void main(String[] args) throws Exception {
        new Calculator();

    }

}
