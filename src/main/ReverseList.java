package main;

public class ReverseList {

	public void printArr(int[] array) {
		
		System.out.print("The digits in array : [");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] );
				if (i < array.length-1) {
					System.out.print(", ");
				}
		}
		System.out.println("]");
	
	}

}