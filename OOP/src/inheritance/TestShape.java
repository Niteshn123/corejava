package inheritance;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setWidth(5);
		r.setArea(25);
		r.setColor("red");
		r.setBorderWidth(2);
		
System.out.println("Arear = "+r.getArea()+" lengt = "+r.getLength()+"Width = " +r.getWidth());
System.out.println("color = "+r.getColor()+ " BorderWidth = "+r.getBorderWidth());	

     Circle c = new Circle();
     c.setRadius(2.5);
     c.setColor("blue");
     c.setArea(3.14*2.5*2.5);
     c.setBorderWidth(45);
     
     System.out.println("Arear = "+c.getArea());
     System.out.println("color = "+c.getColor()+ " BorderWidth = "+c.getBorderWidth());	
     
     Triangle t = new Triangle();
     t.setBase(5);
     t.setHeight(6);
     t.setColor("white");
     t.setArea(0.5*5*6);
     t.setBorderWidth(8);
     
     System.out.println("Arear = "+t.getArea());
     System.out.println("base = "+t.getBase()+ " BorderWidth = "+t.getBorderWidth()+"color = "+t.getColor());	
     
     
     
     
		
	
		
		

	}

}
