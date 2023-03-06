package View;

import Controller.Controller;
import Model.Monomial;
import Model.Polynomial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;


public class Calculator implements ActionListener
{
    JFrame f;
    JTextField t1, t2, t3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b0,bdiv,bsub,badd,bdec,beq,bdel,bclr,beh,bx;
    JLabel l1, l2, l3, l;
    String text1, text2; int k;
    Polynomial p1, p2, p3;
    Controller c = new Controller();
    public Calculator() throws Exception {
        f=new JFrame("POLYNOMIAL CALCULATOR");
        t1=new JTextField(100);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 2000, /*20*/200));
        t2=new JTextField(100);
        t3=new JTextField(100);
        l1 = new JLabel("First Polynomial =");
        l2 = new JLabel("Second Polynomial =");
        l3 = new JLabel("Result Polynomial =");
        l = new JLabel("Polynomial Calculator");
        b1=new JButton("Multiplicate");
        b2=new JButton("Substract");
        b3=new JButton("Integrate");
        b4=new JButton("Derivate");
        b5=new JButton("Add");
        b6=new JButton("Divide");
        b7=new JButton("1");
        b8=new JButton("2");
        b9=new JButton("3");
        b10=new JButton("4");
        b11=new JButton("5");
        b12=new JButton("6");
        b13=new JButton("7");
        b14=new JButton("8");
        b15=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        beh= new JButton("^");
        bdel=new JButton("del");
        bclr=new JButton("clr");
        bx = new JButton("x");

        t1.setBounds(160,60,280,30);
        t2.setBounds(160,100,280,30);
        t3.setBounds(160,140,280,30);
        l.setBounds(120, 10, 300, 30);
        l1.setBounds(40, 60, 200, 30);
        l2.setBounds(20, 100, 200, 30);
        l3.setBounds(25, 140, 200, 30);
        b1.setBounds(20,200,200,40);
        b2.setBounds(240,200,200,40);
        b3.setBounds(20,260,200,40);
        b4.setBounds(240,260,200,40);
        b5.setBounds(20,320,200,40);
        b6.setBounds(240,320,200,40);

        b13.setBounds(20,380,60,40);
        b14.setBounds(90,380,60,40);
        b15.setBounds(160,380,60,40);
        b10.setBounds(20,440,60,40);
        b11.setBounds(90,440,60,40);
        b12.setBounds(160,440,60,40);
        b7.setBounds(20,500,60,40);
        b8.setBounds(90,500,60,40);
        b9.setBounds(160,500,60,40);

        b0.setBounds(240,380,60,40);
        badd.setBounds(310,380,60,40);
        bsub.setBounds(380,380,60,40);
        bdiv.setBounds(240,440,60,40);
        bx.setBounds(310,440,60,40);
        beh.setBounds(380,440,60,40);
        bdec.setBounds(240,500,60,40);
        bclr.setBounds(310,500,60,40);
        bdel.setBounds(380,500,60,40);
        l.setFont(new Font("cooper",Font.BOLD,20));

        f.add(l);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l1);
        f.add(l2);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(bx);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(beh);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(480,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        beh.addActionListener(this);
        bx.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        t1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = 1;
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        t2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = 2;
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }


    public void actionPerformed(ActionEvent e)
    {
        if(k == 1)
        {
            if (e.getSource() == b7)
                t1.setText(t1.getText().concat("1"));
            if (e.getSource() == b8)
                t1.setText(t1.getText().concat("2"));
            if (e.getSource() == b9)
                t1.setText(t1.getText().concat("3"));
            if (e.getSource() == b10)
                t1.setText(t1.getText().concat("4"));
            if (e.getSource() == b11)
                t1.setText(t1.getText().concat("5"));
            if (e.getSource() == b12)
                t1.setText(t1.getText().concat("6"));
            if (e.getSource() == b13)
                t1.setText(t1.getText().concat("7"));
            if (e.getSource() == b14)
                t1.setText(t1.getText().concat("8"));
            if (e.getSource() == b15)
                t1.setText(t1.getText().concat("9"));
            if (e.getSource() == b0)
                t1.setText(t1.getText().concat("0"));
            if (e.getSource() == bdec)
                t1.setText(t1.getText().concat("."));
            if (e.getSource() == badd)
                t1.setText(t1.getText().concat("+"));
            if (e.getSource() == bsub)
                t1.setText(t1.getText().concat("-"));
            if (e.getSource() == bdiv)
                t1.setText(t1.getText().concat("/"));
            if (e.getSource() == beh)
                t1.setText(t1.getText().concat("^"));
            if (e.getSource() == beq)
                t1.setText(t1.getText().concat("="));
            if (e.getSource() == bx)
                t1.setText(t1.getText().concat("x"));
            if(e.getSource()==bclr)
                t1.setText("");

            if(e.getSource()==bdel)
            {
                String s=t1.getText();
                t1.setText("");
                for(int i=0;i<s.length()-1;i++)
                    t1.setText(t1.getText()+s.charAt(i));
            }
        }

        if(k == 2) {
            if (e.getSource() == b7)
                t2.setText(t2.getText().concat("1"));
            if (e.getSource() == b8)
                t2.setText(t2.getText().concat("2"));
            if (e.getSource() == b9)
                t2.setText(t2.getText().concat("3"));
            if (e.getSource() == b10)
                t2.setText(t2.getText().concat("4"));
            if (e.getSource() == b11)
                t2.setText(t2.getText().concat("5"));
            if (e.getSource() == b12)
                t2.setText(t2.getText().concat("6"));
            if (e.getSource() == b13)
                t2.setText(t2.getText().concat("7"));
            if (e.getSource() == b14)
                t2.setText(t2.getText().concat("8"));
            if (e.getSource() == b15)
                t2.setText(t2.getText().concat("9"));
            if (e.getSource() == b0)
                t2.setText(t2.getText().concat("0"));
            if (e.getSource() == bdec)
                t2.setText(t2.getText().concat("."));
            if (e.getSource() == badd)
                t2.setText(t2.getText().concat("+"));
            if (e.getSource() == bsub)
                t2.setText(t2.getText().concat("-"));
            if (e.getSource() == bdiv)
                t2.setText(t2.getText().concat("/"));
            if (e.getSource() == beh)
                t2.setText(t2.getText().concat("^"));
            if (e.getSource() == beq)
                t2.setText(t2.getText().concat("="));
            if (e.getSource() == bx)
                t2.setText(t2.getText().concat("x"));
            if(e.getSource()==bclr)
                t2.setText("");

            if(e.getSource()==bdel)
            {
                String s=t2.getText();
                t2.setText("");
                for(int i=0;i<s.length()-1;i++)
                    t2.setText(t2.getText()+s.charAt(i));
            }
        }

        //multiplication
        if(e.getSource()==b1)
        {
            text1 = (t1.getText());
            text2 = (t2.getText());
            p1 = Polynomial.convertion(text1);
            p2 = Polynomial.convertion(text2);
            c.setP(p1);
            p3 = c.multiplication(p2);
            Collections.sort(p3.getPolynom1(), Collections.reverseOrder());
            t3.setText(p3.toString());
        }

        //substract
        if(e.getSource()==b2)
        {
            text1 = (t1.getText());
            text2 = (t2.getText());
            p1 = Polynomial.convertion(text1);
            p2 = Polynomial.convertion(text2);
            c.setP(p1);
            p3 = c.subtract(p2);
            Collections.sort(p3.getPolynom1(), Collections.reverseOrder());
            t3.setText(p3.toString());
        }

        //divide
        if(e.getSource()==b3)
        {

        }

        //derivate
        if(e.getSource()==b4)
        {
            text1 = (t1.getText());
            text2 = (t2.getText());

            if(k==1) {
                p1 = Polynomial.convertion(text1);
                c.setP(p1);
                p3 = c.derivation();

            }

            if(k==2) {
                p2 = Polynomial.convertion(text2);
                c.setP(p2);
                p3 = c.derivation();
            }
            Collections.sort(p3.getPolynom1(), Collections.reverseOrder());
            t3.setText(p3.toString());
        }

        //addition
        if(e.getSource()==b5)
        {
            text1 = (t1.getText());
            text2 = (t2.getText());
            p1 = Polynomial.convertion(text1);
            p2 = Polynomial.convertion(text2);
            c.setP(p1);
            p3 = c.addition(p2);
            Collections.sort(p3.getPolynom1(), Collections.reverseOrder());
            t3.setText(p3.toString());
        }

        //integration
        if(e.getSource()==b3) {
            text1 = (t1.getText());
            text2 = (t2.getText());

            if (k == 1) {
                p1 = Polynomial.convertion(text1);
                c.setP(p1);
                p3 = c.integration();
            }

            if (k == 2) {
                p2 = Polynomial.convertion(text2);
                c.setP(p2);
                p3 = c.integration();
            }
            Collections.sort(p3.getPolynom1(), Collections.reverseOrder());

            String s = "";
            for (Monomial var1 : p3.getPolynom1()) {
                if(var1.getCoef() > 0) {
                    if(var1.getCoef() == 1)
                        if(var1.getPutere() == 0)  s = s + "+1/" + var1.getPutere();
                        else if(var1.getPutere() == 1)  s = s + "+1/x" + var1.getPutere();
                        else s = s + "+1/" + var1.getPutere() + "^" + var1.getPutere();
                    else
                    if(var1.getPutere() == 0)  s = s + "+" + var1.getCoef() + "/" + var1.getPutere();
                    else if(var1.getPutere() == 1)  s = s + "+" + var1.getCoef() + "/" + var1.getPutere() + "x";
                    else s = s + "+" + var1.getCoef() + "/" + var1.getPutere() + "x^" + var1.getPutere();
                }
                else if(var1.getCoef() < 0){
                    if(var1.getCoef() == -1) {
                        if (var1.getPutere() == 0) s = s + "-1/" + var1.getPutere();
                        else if (var1.getPutere() == 1) s = s + "-1/" + var1.getPutere() + "x";
                        else s = s + "-1/" + var1.getPutere() + "x^" + var1.getPutere();
                    }
                    else {
                        if(var1.getPutere() == 0)  s = s + var1.getCoef() + "/" +var1.getPutere();
                        else if(var1.getPutere() == 1)  s = s + var1.getCoef() + "/" + var1.getPutere() + "x";
                        else s = s + var1.getCoef() + "/" + var1.getPutere() + "x^" + var1.getPutere();
                    }
                }
                else s = s + "";
            }
            t3.setText(s);
        }
    }
}