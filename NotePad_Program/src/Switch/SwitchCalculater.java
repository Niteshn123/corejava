package Switch;

public class SwitchCalculater {

	public static void main(String[] args) {
        
		System.out.println("There is your result");
		String size = args[0];
		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);
		int k;
		switch (size) {
		case "add":
			k = i + j;
			System.out.println(+k);
			break;
		case "sub":
			if (i > j) {
				k = i - j;
			} else
				k = i- j;
			System.out.println(+k);
			break;

		case "multi":
			k = i * j;
			System.out.println(+k);
			break;
		case "div":

			k = i / j;
			System.out.println(+k);
			break;

		default:
			System.out.println("invalid number");

		}

	}

}
