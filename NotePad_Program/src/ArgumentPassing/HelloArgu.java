package ArgumentPassing;

public class HelloArgu {

	public static void main(String[] args) {
		int size = args.length ;
		switch(size) {
		
		case 0:
			System.out.println("geeta");
			break;
		case 1:
			System.out.println("Mohan");
			break;
		case 2:
			System.out.println("Shaym");
			break;
		case 3:
			System.out.println("Ram");
			break;
		case 4:
			System.out.println("Seeta");
			break;
		
			default:
			System.out.println("0");
			break;
		}

	}

}
