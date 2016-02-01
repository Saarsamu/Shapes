/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author saarsamu
 */
public class Ellipse extends Shape {
    private int a, b;
    
    public Ellipse() {
        this.a = 0;
        this.b = 0;      
    }
    
    public Ellipse(String name, Point place, int a, int b) {
        super(place, name);
        setA(a);
        setB(b);
    }
    
    public String toString() {
        return super.toString() + " a: " + getA() + " b: " + getB();
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
}
