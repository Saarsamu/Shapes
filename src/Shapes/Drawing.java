/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author saarsamu
 */
public class Drawing {

        private final Map<String, Shape> shapes = new HashMap<String, Shape>();
        public Shape add(Shape s) {
            Shape muoto = shapes.get(s.getName());
            shapes.put(s.getName(),s);
            return muoto;
        }
        
        public Shape remove(String name) {
            Shape muoto = shapes.get(name);
            shapes.remove(name);
            return muoto;
        }
        
        public void list() {
            for (Map.Entry<String, Shape> me : shapes.entrySet()) {
                System.out.println(me.getValue() );
        }
            
            //for (String key : shapes.keySet()) {
            //    System.out.println(shapes.get(key));
            //}
        }
    }

