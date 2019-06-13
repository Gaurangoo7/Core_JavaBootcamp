package com.stegno.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

   public static void main(String args[]) {
      /* Vector of initial capacity(size) of 2 */
      Vector<String> vec = new Vector<String>(2);

      /* Adding elements to a vector*/
      vec.addElement("Strawberry");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Banana");

      /* check size and capacityIncrement*/
      System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());

      vec.addElement("Blueberry");
      vec.addElement("Raspberry");
      vec.addElement("Badam");

      /*size and capacityIncrement after two insertions*/
      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());

      /*Display Vector elements*/
      Enumeration en = vec.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
      
      //Sort element 
      Collections.sort(vec);
      Enumeration en1 = vec.elements();
      System.out.println("\nElements are:");
      while(en1.hasMoreElements())
         System.out.print(en1.nextElement() + " ");
      
   }
}