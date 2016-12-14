


public class ExceptionA {
    public static void main(String[] args) {
    try {
        ExceptionB.throwExceptionB();
    }
    catch (Exception e) {
        System.err.printf("%s%n%n", e.getMessage());
    }
}
    
}
