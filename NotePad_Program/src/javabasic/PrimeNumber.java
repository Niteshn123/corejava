package javabasic;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 1;
		int t = 0;
		int i;

		for (i = 2; i <= n / 2; i++) {

			if ((n % i) == 0) {
				t = 10;
			}
		}
		if (t == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
