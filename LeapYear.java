package functionalprogram;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year");
	int year=s.nextInt();
	if(Integer.toString(year).length()==4)
	{
		if(year%400==0 || year%4==0 && year%100!=0)
		{
			System.out.println(year+" is leap year");
		}
		else
			System.out.println(year+" is not leap year");
	}
	else
		System.out.println("year must be 4 digits");
}
}

