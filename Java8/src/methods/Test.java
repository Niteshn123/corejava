package methods;

public  class Test implements MethodsInt{
     
		public void abst()
		
	
		{
			System.out.println("nitesh");
		}
		public static void main(String[] args) {
			Test t = new Test();
			t.abst();
			t.def();
			MethodsInt.stat();// static mathod interface ke through call hoti hai.
		}
	
}
	

