package Ch1117;

public class ExceptionA extends Exception{

    // constructor
    public ExceptionA(String message){
        super(message);
    }

    ExceptionA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
