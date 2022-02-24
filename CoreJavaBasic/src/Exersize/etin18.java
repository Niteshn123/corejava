package Exersize;

public class etin18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

    int[] a = { 5, 4, 3, 2, 1};
    int x = 2;
    int k = 0;

    for (int i = 0; i < a.length; i++) {

      if (x == a[i]) {
        k=i;
        System.out.println("Index of "+ x +" = " +k);
      }

    }
    if (k == 0) {
      System.out.println("-1");
    }

  }

}



