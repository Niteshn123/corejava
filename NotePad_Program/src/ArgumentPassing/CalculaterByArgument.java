package ArgumentPassing;

public class CalculaterByArgument {

	public static void main(String[] args) {

		add();

	}
        public static void add(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		int sum = i + j;
		System.out.println("Sum is " + sum);

	}

	public static void subtraction(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		int subtraction = i - j;
		System.out.println("subtraction is " + subtraction);

	}

	public static void MultiFication(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		int MultiFication = i * j;
		System.out.println("Sum is " + MultiFication);

	}

	public static void Division(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		int Division = i * j;
		System.out.println("Sum is " + Division);
	}

}
