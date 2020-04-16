package com.tgt.igniteplus;

//to demonstrate string comparison//

import java.util.*;
public class cmpstr {

        public static void main(String[] args){
            String s1,s2;
            System.out.println("Enter the 2 strings");
            Scanner in=new Scanner(System.in);
            s1=in.nextLine();
            s2=in.nextLine();
            System.out.println(s1 +" equals "+ s2 +"->"+s1.equals(s2));
            System.out.println(s1 +" equalsIgnoreCase "+ s2 +"->"+s1.equalsIgnoreCase(s2));
            int result = s1.compareTo(s2);
            if(result == 0)
                System.out.println(s1+" is equal to "+s2);
            else
                System.out.println(s1+" is not equal to "+s2);
            result = s1.compareToIgnoreCase(s2);
            if(result == 0)
                System.out.println(s1+" is equal to "+s2);
            else
                System.out.println(s1+" is not equal to "+s2);
        }
    }
/*OUTPUT:
1.Enter the 2 string:
 BOOLEAN
boolean
BOOLEAN equals boolean->false
BOOLEAN equalsIgnoreCase boolean->true
BOOLEAN is not equal to boolean
BOOLEAN is equal to boolean
*/

