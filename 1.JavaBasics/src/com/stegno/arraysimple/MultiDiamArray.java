package com.stegno.arraysimple;

public class MultiDiamArray {

	public static void main(String[] args) {
		//Declar & initialise 2D array
		int arr[][] = {{10,20,30},{17,25,35},{1,2,3}};
		
		for (int i =0;i<arr.length;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
			

	}

}
