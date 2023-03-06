import Controller.Controller;
import Model.Monomial;
import Model.Polynomial;

import java.util.Scanner;

public class Main {
    Polynomial p1;
    Polynomial p2;


    public static void main(String[] args) {

       Monomial m = new Monomial();
        Scanner s = new Scanner(System.in);
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();;
        m.setPutere(3);
        m.setCoef(1);
        p1.getPolynom1().add(m);
        m = new Monomial();
        m.setPutere(2);
        m.setCoef(-2);
        p1.getPolynom1().add(m);
        m = new Monomial();
        m.setPutere(1);
        m.setCoef(6);
        p1.getPolynom1().add(m);
        m = new Monomial();
        m.setPutere(0);
        m.setCoef(-5);
        p1.getPolynom1().add(m);

        Polynomial.print(p1);

        m = new Monomial();
        m.setPutere(2);
        m.setCoef(1);
        p2.getPolynom1().add(m);
        m = new Monomial();
        m.setPutere(0);
        m.setCoef(-1);
        p2.getPolynom1().add(m);
        /*m = new Monomial();
        m.setPutere(1);
        m.setCoef(-6);
        p2.getPolynom1().add(m);
        */
         Polynomial.print(p2);

        Controller c = new Controller();
        c.setP(p1);

        //Polynomial p3 = p1.addition(p2);
        //Polynomial p3 = p1.subtract(p2);
        //Polynomial p3 = p1.multiplication(p2);
        //Polynomial p3 = p1.derivation();
        //Polynomial p3 = p1.integration();
         Polynomial p3 = c.dividesr(p2);
        //Polynomial.print(p3);

    }
}
