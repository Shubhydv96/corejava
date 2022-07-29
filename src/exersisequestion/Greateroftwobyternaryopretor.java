package exersisequestion;

public class Greateroftwobyternaryopretor {
	public static void main (String[]args) {
		int num1=30,num2=40,temp; 
		
		if(num1==num2)
			System.out.println("Both are equal");
		else {
			temp=num1>num2?num1:num2;
			System.out.println(temp+"is greter");
		}
			
	}

}
