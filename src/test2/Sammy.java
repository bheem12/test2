package test2;
import java.util.*;
class Ageexception extends Exception{
	public Ageexception(String s) {
	System.out.println(s);
	}	
}
public  class Sammy  {
public void input() throws Ageexception {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the user name");
	String name=sc.next();
	System.out.println("enter contact number");
	long contact=sc.nextLong();
	System.out.println("enter age");
	int age=sc.nextInt();
	
		if((age<20)||(age>55)) {
			throw new Ageexception("Age limit");
		}
		
	
		
}

	public static void main(String[] args) throws Ageexception {
		// TODO Auto-generated method stub
		Sammy s=new Sammy();
       s.input();
	}

}

