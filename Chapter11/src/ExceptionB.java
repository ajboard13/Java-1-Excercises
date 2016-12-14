


public class ExceptionB extends ExceptionA {
    public static void throwExceptionB() throws Exception {    
    try {
        ExceptionC.throwNewException();
    }    
    catch (Exception e) {
            System.err.println("Exception caught in method ExceptionB from ExceptionC");
            throw new Exception("Exception thrown to ExceptionA");
    }
}
}
