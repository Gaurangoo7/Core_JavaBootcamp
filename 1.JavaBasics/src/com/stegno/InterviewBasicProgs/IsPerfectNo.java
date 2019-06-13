package com.stegno.InterviewBasicProgs;
import java.util.*;
public class IsPerfectNo {
public boolean IsPerfectNo(int number){
		
		int temp = 0;
		for(int i=1;i<=number/2;i++){
			if(number%i == 0){
				temp += i;
			}
		}
		if(temp == number){
			System.out.println("It is a perfect number");
			return true;
		} else {
			System.out.println("It is not a perfect number");
			return false;
		}
	}
	
	public static void main(String a[]){
		IsPerfectNo ipn = new IsPerfectNo();
		System.out.println("Is perfect number: "+ipn.IsPerfectNo(35)); //Pass number here to check
	}}

