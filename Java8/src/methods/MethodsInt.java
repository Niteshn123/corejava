package methods;

public interface MethodsInt {
	
	public void abst(); // her ek interface ki ek abstract method to hoti hi hai aur 
	                     // eski body test class me bnti hai
	
	public default void def()
	{
		System.out.println("defaul method");
	}
	public static void stat()
	{
		System.out.println("this is static");
	}
	
}
