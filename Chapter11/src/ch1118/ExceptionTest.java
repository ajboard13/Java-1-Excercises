
package ch1118;

import java.io.IOException;


public class ExceptionTest{
    public static void main(String[] args){

        try{
            throw new IOException();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.err.println("IOException");
        }
    }
}

