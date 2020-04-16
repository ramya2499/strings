package com.tgt.igniteplus;

//program to check if a string contains only digits//

import java.util.Scanner;

public class strdig {
    public static void main(String []args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=in.nextLine();
        if(str.matches("[0-9]+") ) {
            System.out.println("String contains only digits");
        }
        else{
            System.out.println("String does not contain only digits");
        }
    }
}

/* OUTPUT :
Enter a string:
2662
String contains only digits */

