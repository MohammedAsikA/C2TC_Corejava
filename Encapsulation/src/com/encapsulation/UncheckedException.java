package com.encapsulation;

public class UncheckedException {
	public static void main(String[] args) {
		int x[];
		try {
			x = new int[] { 1, 2, 3, 4 };
			System.out.println(x[4]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist. " + e.getMessage());

		}

}
}
