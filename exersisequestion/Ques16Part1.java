package exersisequestion;

import java.util.Arrays;

public class Ques16Part1 {
	
	public static int getSecondLargest(int []a,int total) {
		Arrays.sort(a);
		return a[total-2];
		
		
	}
public static void main(String[] args) {
	
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		 int b[]= {44,55,88,77,99,22,33};
		 System.out.println("second Largest"+getSecondLargest(a,9));
		 System.out.println("second largest"+getSecondLargest(b,7));
		 
		

}
}
