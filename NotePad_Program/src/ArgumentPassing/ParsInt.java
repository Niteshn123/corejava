package ArgumentPassing;

public class ParsInt {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
        int sum = i+j;
        System.out.println("Sum is " + sum);
	}
	}

