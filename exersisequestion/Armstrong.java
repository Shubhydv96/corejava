package exersisequestion;

public class Armstrong {
	public static void main(String[] args) {
	int n=1634;
	int num=n;
	int sum = 0;
	int rem;
	while  ( n>0) {
		
		rem=n%10;
		
		n=n/10;

		sum=sum+(rem*rem*rem*rem);
		
		System.out.println(sum);
		
	}
	
	if (sum==num) { 
		
		System.out.println(" the value is an armstroong number ");
	
	}
	
	else {
		
		System.out.println("is not an armstrong numer");
		
	}
	
				 
	}

}
