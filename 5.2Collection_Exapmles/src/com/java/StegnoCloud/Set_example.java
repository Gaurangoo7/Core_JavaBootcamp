////Java code for adding elements in Set
package com.java.StegnoCloud;

import java.util.*;
public class Set_example
{
 public static void main(String[] args)
 {
     // Set demonstration using HashSet
     Set<String> hash_Set = new HashSet<String>();
     hash_Set.add("Gaurang");
     hash_Set.add("Shah");
     hash_Set.add("Shah");
     hash_Set.add("Gaurang");
     hash_Set.add("Ashwini");
     System.out.print("Set output without the duplicates");

     System.out.println(hash_Set);

     // Set demonstration using TreeSet
     System.out.print("Sorted Set after passing into TreeSet");
     Set<String> tree_Set = new TreeSet<String>(hash_Set);
     System.out.println(tree_Set);
 }
}
