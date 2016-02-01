/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// it is common and preferable to put all codes in packages
// to avoid naming conflicts. 
// package name starts usually with company domain in reverse order
package fi.lamk.hello;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author koskioli
 */
// everything is in classes in Java!
public class Hello {

    /**
     * @param args the command line arguments
     */
    // --> all static functions including main() is also
    // in classes
    // - programming languages usually allows just one main()
    // function but in Java you can have main() in every class
    // --> when you start your java program you have to tell
    // JVM (Java Virtual Machine) which class is the real main-class
    public static void main(String[] args) {
        // System.out.println() is for console output
        // it adds also trailing linefeed after the message
        System.out.println("Hello World from Java");
        // print() does not add trailing linefeed
        // but you can embed "\n" linefeeds
        System.out.print("A msg without linefeed.. ");
        System.out.print("next msg with\nlinefeeds\n");
        // local non-class variables
        int x=1, y=2, z = x+y;
        // printf() works like C-language printf()
        //  - first parameter is format string
        //  - rest parameters: you should provide as many
        //    as you have "%"-signs in your format string
        //    of course parameters should be compatible for
        //    the "%"-hotspots
        //    %d = integer
        //    %f = float etc..
        System.out.printf("%d+%d=%d\n",x,y,z);
        // in java all class objects has to be created with
        // new operator
        Person p = new Person(); // default person
        System.out.println(p);
//        System.out.println(p.getFname()+" "+p.getLname()+ " "+
//                (p.isFemale()?"female":"male"));
        p = new Person("Kaisa","Mäkäräinen",true);
//        System.out.println(p.getFname()+" "+p.getLname()+ " "+
//                (p.isFemale()?"female":"male"));
        System.out.println(p);
        p.setFname("Kalle");
        p.setFemale(false);
        System.out.println(p);      
        p = new Person("Rami","Viskilä",false,47,new Date(13,12,1950));
        System.out.println(p);   
        // we can put a child object to parent variable
        // --> then we can call just the parent methods
        p = new Employee();
        System.out.println(p);    
        // if we create child variable
        // --> we can call all child and parent public methods
        Employee e = new Employee();
        e.setSalary(4500);
        System.out.println(e);    
    }
    
}
