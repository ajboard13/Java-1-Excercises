package ch14;

import java.io.*;
import java.util.Scanner;

public class ch14_4 {
    public static void main(String[] args) {
        String first, second;
        int index, num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        first = input.nextLine();
        System.out.println("Enter the second string: ");
        second = input.nextLine();
        System.out.println("Enter number of characters: ");
        num=input.nextInt();
        System.out.println("Enter starting index: ");
        index=input.nextInt();
        
        
        if (first.regionMatches(true, index, second, index, num)){
            System.out.println("The strings are equivalent.");
        }
        else
            System.out.println("The strings are not equivalent.");
    }
    
}
