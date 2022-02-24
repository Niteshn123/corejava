package GetterSetter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("Ram");
		p.setAddress("Kanadia");
		p.setAge("25");
		
		Account a = new Account();
		a.setAccount(556545);
		a.setBalance(556545);
		a.setNumber(556545);
		
		Automobile at = new Automobile();
		at.setColor("green");
		at.setGear(4);
		at.setSpeed(50);
		

		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		
		
		
		
		

	}

}
