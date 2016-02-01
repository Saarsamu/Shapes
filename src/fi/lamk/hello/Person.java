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
public class Person {
    // in every OOP language it is preferable to
    // specify data fields private and provide public 
    // accessory methods if necessary
    private String fname = "Bob";
    private String lname = "Builder";
    private boolean female = false;
    private int shoesize = 43;
    private Date bday = new Date();
    // Constructors are the way to create objects
    // if you don't provide any constructors, the 
    // compiler will create an empty default constructor:
//    public Person(){
//        
//    }
    public Person(){
        // - if we have several constructors we should create one having the
        // "real" body or "all degrees of freedom" and in every other
        // constructor we should call that one with keyword "this"
        // - this() call should be the first call in constructor
        // (unless there is a "super" call..)
        this("David","Bowie",false,45, new Date());
//        setFname("David");
//        setLname("Bowie");
//        setFemale(false);
//        setShoesize(45);
    }
    public Person(String fname, String lname, boolean female){
        this(fname,lname,female,44, new Date());
//        setFname(fname);
//        setLname(lname);
//        setFemale(female);
//        setShoesize(44);
    }
    public Person(String fname, String lname, 
            boolean female, int shoesize){
        this(fname,lname,female,shoesize,new Date());
    }
    public Person(String fname, String lname, 
            boolean female, int shoesize, Date bday){
        setFname(fname);
        setLname(lname);
        setFemale(female);
        setShoesize(shoesize);
        setBday(bday);
    }
    
    @Override
    public String toString(){
        return getFname()+" "+getLname()+" "+
                (isFemale()?"female":"male")+" shoe: "+getShoesize()
                // note: String plus operator uses Object.toString()
                +" bday: "+getBday();
    }
    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the female
     */
    public boolean isFemale() {
        return female;
    }

    /**
     * @param female the female to set
     */
    public void setFemale(boolean female) {
        this.female = female;
    }

    /**
     * @return the shoesize
     */
    public int getShoesize() {
        return shoesize;
    }

    /**
     * @param shoesize the shoesize to set
     */
    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    /**
     * @return the bday
     */
    public Date getBday() {
        return bday;
    }

    /**
     * @param bday the bday to set
     */
    public void setBday(Date bday) {
        this.bday = bday;
    }
}
