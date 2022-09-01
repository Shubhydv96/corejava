package exersisequestion;

public class Ques15 {
		
	 static int a[]= {19,42,43,54,75,96,78,89,95};
	
	
	 static int largest() {
		 
		 int i;
		 
		 int max=a[0];
		 
		 for (i = 0; i < a.length; i++) {
			 if(a[i]>max) {
				 max=a[i];
			 }
			
		}
		 
		 
		 
		 
		return max;
		 }public static void main(String[] args) {System.out.println("Lar "+largest());

		 
		}

}
 
