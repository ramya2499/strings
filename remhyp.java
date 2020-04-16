package com.tgt.igniteplus;

//program to remove hyphen from the given string in between digits only//

public class remhyp {
    public static void main(String[] args) {
        String teststring = "134-10/5566 A-block, Manyata Tech-Park";
        int size = teststring.length();
        char[] charArray = teststring.toCharArray();
        char[] newArray = new char[size];
        int i, j = 0;
        for (i = 0; i < size; i++) {
            if (charArray[i] == '-' && Character.isDigit(charArray[i - 1]) && Character.isDigit(charArray[i + 1])) ;
            else
                newArray[j++] = charArray[i];
        }
        while (j < i) {
            newArray[j++] = '\0';
        }
        System.out.println(newArray);
    }
}

    /* OUTPUT:
13410/5566 A-block, Manyata Tech-Park */

