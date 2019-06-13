package com.java.oops.polymorphism;

//A Java program with overloaded main()
import java.io.*;

public class TestOverloading2 {
   
 // Normal main()
 public static void main(String[] args) {
     System.out.println("Hi Gaurang (from main)");
     TestOverloading2.main("Geek");
 }

 // Overloaded main methods
 public static void main(String arg1) {
     System.out.println("Hi, " + arg1);
     TestOverloading2.main("Dear Geek","My Geek");
 }
 public static void main(String arg1, String arg2) {
     System.out.println("Hi, " + arg1 + ", " + arg2);
 }
}




