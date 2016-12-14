package ch1118;

import Ch1117.*;

public class ExceptionB extends ExceptionA{

    // constructor
    public ExceptionB(String message){
        super(message);
    }

    ExceptionB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
