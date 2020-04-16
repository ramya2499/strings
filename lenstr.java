package com.tgt.igniteplus;

//program to determine length of a string//

import java.util.Scanner;
public class lenstr {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        System.out.println("string length is:"+str.length());
    }
}

/* OUTPUT :
Enter a string:
HappY
string length is:5
 */