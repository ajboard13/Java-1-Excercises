
package ch14;
import java.util.Scanner;
import java.util.*;
        
public class ch14_9 {
    public static void main(String[] args) {
        String stringToToken;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be reversed: ");
        stringToToken = input.nextLine();
        StringTokenizer tokens = new StringTokenizer(stringToToken);
        int count = tokens.countTokens();
        String reverse[] = new String[count];
        int index = count-1;
        
        while (tokens.hasMoreTokens()){
            reverse[index--] = tokens.nextToken();
        }
            
            for (int i =0; i <count; i++){
                System.out.print(" "+ reverse[i]+" ");
            }
        
    }
    
}
