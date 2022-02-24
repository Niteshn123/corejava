package ArgumentPassing;

public class DemoMeethod {

	public static void main(String[] args) {
		printAll(args);

	}
	
	public static void printAll(String[] args) {
		
		for (int i = 0; i<args.length; i++) {
			System.out.println("Hello " + args[i]);
		}
	}

}
