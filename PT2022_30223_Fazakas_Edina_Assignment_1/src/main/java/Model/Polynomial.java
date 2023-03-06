package Model;

import java.util.*;
import java.lang.Integer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Polynomial extends ArrayList<Monomial>{

    private ArrayList<Monomial> polynom1;

    public ArrayList<Monomial> getPolynom1() {
        return polynom1;
    }

    public void setPolynom1(ArrayList<Monomial> polynom1) {
        this.polynom1 = polynom1;
    }

    public Polynomial(ArrayList<Monomial> polynom1) {
        this.polynom1 = polynom1;
    }

    public Polynomial() {
          polynom1 = new ArrayList<Monomial>();
    }

    public static Polynomial convertion(String s) {
        Polynomial p = new Polynomial();
        Monomial monomial;
        String pattern = "([+-]?[0-9]*)([xX]?)\\^([0-9]*)";

        if(s.charAt(0) == ' ')
            s = s + "+";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);

        while (m.find( )) {
            monomial = new Monomial();
            if (m.group(1) != null) {
                if (m.group(1) == "-")
                    monomial.setCoef(-1);
                else if (m.group(1) == "+")
                    monomial.setCoef(1);
                else
                    monomial.setCoef(Integer.parseInt(m.group(1)));
            }
            if(m.group(1) != null) {
                if (m.group(3) == null)
                    if (m.group(2) == null)
                        monomial.setPutere(0);
                    else monomial.setPutere(1);
                else monomial.setPutere(Integer.parseInt(m.group(3)));

                p.polynom1.add(monomial);
            }
        }
        return p;
    }

    public static Polynomial validation(String s) {
        Polynomial p = new Polynomial();
        Monomial monomial;
        String pattern = "([+-]?[0-9]*)(x\\^)([0-9]*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        while (m.find( )) {
            monomial = new Monomial();
            if (m.group(1) != null) {
               /* if (m.group(1) == "-")
                    monomial.setCoef(-1);
                else if (m.group(1) == "+")
                    monomial.setCoef(1);
                else*/ monomial.setCoef(Integer.parseInt(m.group(1)));
            }

            if (m.group(3) != null)
                monomial.setPutere(Integer.parseInt(m.group(3)));
            /*else if (m.group(2) == "x" && m.group(3) == null)
                monomial.setPutere(1);
            else if(m.group(2) == null && m.group(3) == null)
                monomial.setPutere(0);*/
            p.polynom1.add(monomial);
        }
        return p;
    }


    public static void print(Polynomial p3){
        System.out.println("\nPolynom: ");
        for (Monomial v1: p3.polynom1) {
            if(v1.getCoef() != 0)
             System.out.print(v1.Stringto() + " + ");
        }
    }

    public String toString() {
        String s = "";
        for (Monomial var1 : this.polynom1) {
            if(var1.getCoef() > 0) {
                if(var1.getCoef() == 1)
                    if(var1.getPutere() == 0)  s = s + "+1";
                    else if(var1.getPutere() == 1)  s = s + "+x";
                    else s = s + "+x^" + var1.getPutere();
                else
                    if(var1.getPutere() == 0)  s = s + "+" + var1.getCoef();
                    else if(var1.getPutere() == 1)  s = s + "+" + var1.getCoef() + "x";
                    else s = s + "+" + var1.getCoef() + "x^" + var1.getPutere();
            }
            else if(var1.getCoef() < 0){
                if(var1.getCoef() == -1) {
                    if (var1.getPutere() == 0) s = s + "-1";
                    else if (var1.getPutere() == 1) s = s + "-x";
                    else s = s + "-x^" + var1.getPutere();
                }
                else {
                    if(var1.getPutere() == 0)  s = s + var1.getCoef();
                    else if(var1.getPutere() == 1)  s = s + var1.getCoef() + "x";
                    else s = s + var1.getCoef() + "x^" + var1.getPutere();
                }
            }
            else s = s + "";
        }
        return s;
    }
}