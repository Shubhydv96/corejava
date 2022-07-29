package Oop;

public class Const {
	public static void main (String[]args) {
	//	Constructor s1= new Constructor();
		
		Constructor s2= new Constructor("red",4);
		
		String colour=s2.getColour();
		int width= s2.getWidth();
		 System.out.println(colour);
		 System.out.println(width);
		
		
	}

}
