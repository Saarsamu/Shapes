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
        Drawing draw = new Drawing();
        
        Rectangle rec = new Rectangle("Neliö", new Point(2,3), 4, 4);
        System.out.println(rec);
        draw.add(rec);
        
        Ellipse ell = new Ellipse("Ellipsi", new Point(5,9), 3, 2);
        System.out.println(ell);
        draw.add(ell);
        
        Square squ = new Square();
        squ = new Square(new Point(1,1), "nelijö" , 6);
        System.out.println(squ);
        draw.add(squ);
        
        Circle cir = new Circle();
        cir = new Circle(new Point(1,1), "Ympyrää" , 10);
        System.out.println(cir);
        draw.add(cir);
        
        draw.add(new Circle(new Point(3,3), "Pyöreä", 3));
        
        System.out.println(draw.add(new Square(new Point(9,8), "neliöysikasi", 2)));
        System.out.println("");
        
        System.out.println("Lista: ");
        draw.list();
        System.out.println("");
        
        System.out.println("Lista ilman Pyöreää: ");
        draw.remove("Pyöreä");
        
        draw.list();
    }
}
