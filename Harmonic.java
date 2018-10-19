package functionalprogram;

import java.util.Scanner;

public class HarmonicNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n!=0)
	{
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("the compute value of first "+n +" number is "+sum);
	}
	
}
}

