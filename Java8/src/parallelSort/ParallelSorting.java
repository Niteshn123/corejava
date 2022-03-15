package parallelSort;

import java.util.Arrays;

public class ParallelSorting {

	public static void main(String[] args) {
		
		int[] a = {1,4,8,5,3,7,2,1,5,9};
		Arrays.parallelSort(a);
		
		for(int i:a) {
			System.out.println(i);
		}

	}

}
