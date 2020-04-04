package com.lesson8;

public class MultiDimantionalArray {

	public static void main(String[] args) {
		
		//rows and columns
		int [][] twoD = 		{{1,2,3} , 
								 {6,7,9}, 
								 {9,2} };
		
		System.out.print(twoD[1] [2]);
		
		int[] [] twoDi = new int[3] [3];
		
		for (int i = 0; i<twoD.length; i++) {
			for (int j = 0; j<twoD[i].length; j++) {
//				System.out.print(twoD[i][j] + " ");
			}
//			System.out.println();
		}
	}//end main
}//end class
