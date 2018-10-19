package functionalprogram;

import java.util.Scanner;

public class PrimeFactorization {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	long num=s.nextLong();
	for(long i=2;i*i<=num;i++)
	{
	 while(num%i==0)
	 {
		 System.out.println(i+" ");
		 num=num/i;
	 }
	}
if(num>1) 
	System.out.println(num);
else
	System.out.println();
}
}
