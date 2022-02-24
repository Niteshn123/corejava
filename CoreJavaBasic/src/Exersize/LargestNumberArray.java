package Exersize;

public class LargestNumberArray {

	public static void main(String[] args) {

		int[] array = { 5, 15, 9, 1, 2 ,78};
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			if (x < array[i]) {
				x = array[i];
			}

		}
		//System.out.println(array.length);
		System.out.println(x + "Largest Array");
	}
}
/*array.length = total number of array
array[i] = element of i
it means if  Array is 
int[] array = { 5, 15, 9, 1, 2 ,78};
than
array[3] = 9;
array[2] = 15;

*/