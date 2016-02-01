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
public class Shapes {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec);
        
        rec = new Rectangle("Neliö", new Point(2,3), 4, 4);
        System.out.println(rec);
    }
}
