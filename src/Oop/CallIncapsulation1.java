package Oop;

public class CallIncapsulation1 {
	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();

		en.setName("shubham");
		en.setSurname("yadav");
		en.setAge("25");
		
		String Name = en.getName();
		System.out.println(Name);
		String Surname = en.getSurname();
		
		System.out.println(Surname);
		String age = en.getAge();
		System.out.println(age);
	} 

}
