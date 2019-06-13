package com.java.StegnoCloud;

import java.util.*;  
class ArrayList_operations{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Gaurang");  
  al.add("Ashwini");  
  al.add("Mau"); 
  al.add("Gaurang");
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Shah");  
  al2.add("Shimpi");  
  al.addAll(al2);                  //adding second list in first list  
  System.out.println("1. iterating the elements after Adding the elements of al2...");  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  
  //removeAll()
  al.removeAll(al2);  //removing second list in first list 
  System.out.println("2. iterating the elements after removing the elements of al2...");  
  Iterator<String> itr1=al.iterator();  
  while(itr1.hasNext()){  
   System.out.println(itr1.next());  
  }  
  
  //retainAll() method
  al2.add("Mau");  
  al.retainAll(al2);  
  System.out.println("3. iterating the elements after retaining the elements of al2...");  
  Iterator<String> itr2=al.iterator();  
  while(itr2.hasNext()){  
   System.out.println(itr2.next());  
  }  
 }  
}  
