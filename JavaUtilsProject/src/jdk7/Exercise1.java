package jdk7;

import java.util.Arrays;

public class Exercise1 {
	public static void main(String[] args) {
		int[] numberArray = { 3, 2, 1,5,4,7 }; // 2 , 3, 1 ,  1, 3, 2,   1, 2, 3 
//		Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
		//You have to read the number only once 
//		print index of 8 and 6
		int temp;
		//System.out.println(numberArray[0]);
		for(int i=0; i<numberArray.length-1;i++) {

//			System.out.println("\n Inside i loop  i = "+ i );
			
			for(int j= i+ 1; j<numberArray.length; j++)
			{
		
				//System.out.println("\n Inside J loop  i = "+ i + " j  = " + j);
				if(numberArray[i]>numberArray[j])
				{

//					System.out.println(numberArray[i] + " > " + numberArray[j]);
								
					temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j]=temp;
					System.out.println("temp " + temp);
				}
                  //System.out.println(Arrays.asList(numberArray));
				
				System.out.println();
			}
		
		}
		for(int i=0; i<numberArray.length;i++)
		System.out.println(numberArray[i]);

	}
}
