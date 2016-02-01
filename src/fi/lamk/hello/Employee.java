/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.lamk.hello;

/**
 *
 * @author koskioli
 */
// java allows single inheritance
// (multiple inheritance is used by implementing interfaces)
// keyword "extends" is used
// here Employee extends Person class
// --> Employee is child for the Person
public class Employee extends Person {
    // special fields for the Employee
    private float salary;
    private String id;

    public Employee(){
        // NOTE1: if you put any number values to your code, please
        // keep in mind that you cannot set values having more precision
        // than destination..
        // double --> float or any integral type is illegal
        // float --> any integral type is illegal
        // integral types --> float --> double is ok
        // NOTE2: if you put decimal constants to your code without 'f'
        // --> constant is double. With 'f' it is float
        this("Keijo","Rosberg",false,3000.0f,"999");
    }
    public Employee(String fname, String lname, boolean female, float salary, String id){
        // if (i think you should) you want to call some proper parent constructor,
        // you have to use "super" keyword and compatible parameter set.
        // NOTE: super() call must the first call in constructor body!
        super(fname, lname, female);
        setSalary(salary);
        setId(id);
    }
    @Override
    public String toString(){
        // if we want to call inherited AND overriden method, we must
        // use "super.method()"
        return super.toString()+" salary: "+String.format("%.2f",getSalary())+" id: "+getId();
    }
    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
