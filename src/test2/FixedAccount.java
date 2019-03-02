package test2;
import java.util.*;

public class FixedAccount {
  static void calculatelnterest() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter fixed amount");
	 long fixedAmount=sc.nextLong();
	 System.out.println("enter time(years)");
	 int time=sc.nextInt();
	 System.out.println("enter rate");
	 int rate=sc.nextInt();
	 float intrest=((fixedAmount*time*rate)/100);
	 System.out.println("intrest is"+intrest);
 }
  public class saving extends FixedAccount{
	  public void calculateIntrest() {
		  super.calculatelnterest();
		  
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatelnterest(); 

	}

}
