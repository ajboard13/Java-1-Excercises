
package ch1119;


public class SomeClassTest {
    public static void main(String[] args) {
        SomeClass someclass;
        try{
            someclass = new SomeClass();
        }
        catch(Exception e){
            System.out.println("Exception: " + e.toString());
        }
    }
    
}
