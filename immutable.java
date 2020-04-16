package com.tgt.igniteplus;

//program to prove string is immutable//

public class immutable {
  public static void referenceCheck(Object x, Object y) {
   if (x == y) {
    System.out.println("Both pointing to the same reference");

   } else {
    System.out.println("Both are pointing to different reference");
   }
  }
  public static void main(String[] args) {
   String st1 = "Java";
   String st2 = "Java";
   System.out.println("Before Modification in st1");
   referenceCheck(st1, st2);
   st1 += "ava";
   System.out.println("After Modification");
   referenceCheck(st1, st2);
  }

 }

 /* OUTPUT
 Before Modification in st1
Both pointing to the same reference
After Modification
Both are pointing to different reference  */
