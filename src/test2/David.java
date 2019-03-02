package test2;
import java.util.Scanner;
public class David {
	 static void Salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("David basic salary");
		long sal=sc.nextLong();
		
		float HRA=(sal/2);
		System.out.println("HRA"+HRA);
		
		float sa=(3*sal)/4;
		System.out.println("Special allowance"+sa);
		float pfd=(3*sal)/25;
		System.out.println("pf deduction"+pfd);
		float netsal=(sal-(HRA+sa+pfd));
		System.out.println("Net salary is"+Math.abs(netsal));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary();
		

	}

}
