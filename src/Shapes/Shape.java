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
public class Shape {
    private Point place;
    private String name;
    
    public Shape() {
        this.place = null;
        this.name = null;
    }
    
    public Shape(Point place, String name) {
        setPlace(place);
        setName(name);
    }
    
    @Override
    public String toString() {
        return name + " " + place;
    }

    /**
     * @return the place
     */
    public Point getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(Point place) {
        this.place = place;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
