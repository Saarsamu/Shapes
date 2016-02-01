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
public class Circle extends Ellipse{
    public int getRadius() {
        return super.getA();
    }
    
    public void setRadius(int radius) {
        super.setA(radius);
        super.setB(radius);
    } 
    
    public Circle () {
        this(new Point(), null, 0);
    }
    public Circle(Point place, String name, int radius) {
        super(name, place, radius, radius);
    }
    
    public String toString() {
        return super.getName() + " " + super.getPlace() + " radius: " + super.getA();
    }
}
