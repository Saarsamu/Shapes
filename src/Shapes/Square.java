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
public class Square extends Rectangle{
    public int getSide() {
        return super.getHeight();
    }
    
    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    } 
    
    public Square () {
        this(new Point(), null, 0);
    }
    public Square(Point place, String name, int side) {
        super(name, place, side, side);
    }
    
    public String toString() {
        return super.getName() + " " + super.getPlace() + " side: " + super.getHeight();
    }
}