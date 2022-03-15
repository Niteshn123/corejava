package lambda;

public  class Test implements Demo {
	
	public static void main(String[] args) {
		
		Demo l =()->{
			System.out.println(3);
			
		};
		l.lam();
	}

	@Override
	public void lam() {
		// TODO Auto-generated method stub
		
	}
	

}
