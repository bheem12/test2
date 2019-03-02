package test2;
import java.util.*;

public class Largest {
	static void largestnum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number which is greater than 10");
		int num=sc.nextInt();
		int temp=num%10;
		temp=temp+1;
		
		num=num-temp;
		System.out.println("the num satisfies"+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestnum();

	}

}
