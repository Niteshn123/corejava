package javabasic;

public class ArrayByForLoop {

	public static void main(String[] args) {

		int i;
		int[] a = new int[8];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		for (i = 0; i <= 2; i++) {

			System.out.println(a[i]);
		}
	}

}
