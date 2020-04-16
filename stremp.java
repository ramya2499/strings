package com.tgt.igniteplus;

//program to check if the string is empty//

import java.util.Scanner;
public class stremp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        if (str.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}

/* OUTPUT:
     Enter a string:

     String is empty
 */




