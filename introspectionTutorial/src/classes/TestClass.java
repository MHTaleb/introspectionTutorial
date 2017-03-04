/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Taleb
 * 
 * for educational purpose
 * 
 */
public class TestClass {
    private int myInt;
    private String myString;

    public int getMyInt() {
        return myInt;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public TestClass() {
    }

    public TestClass(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
