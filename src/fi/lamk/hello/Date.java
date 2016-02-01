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
public class Date {
    // private fields day, mon, year
    private int day = 1;
    private int mon = 1;
    private int year = 2016;
            
    // default constructor
    public Date(){
        this(1,1,2000);
    }    
    // constructor having all information day, mon, year
    public Date(int day, int mon, int year){
        setDay(day);
        setMon(mon);
        setYear(year);
    }
    // toString() which returns "dd.mm.yyyy"
    @Override
    public String toString(){
        return String.format("%02d.%02d.%04d",getDay(),getMon(),getYear());
    }
    // you can use String.format() method which behaves like System.out.printf()
    // but instead of printing the string method returns the string

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the mon
     */
    public int getMon() {
        return mon;
    }

    /**
     * @param mon the mon to set
     */
    public void setMon(int mon) {
        this.mon = mon;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
}
