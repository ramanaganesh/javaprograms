package functionalprogram;

import java.util.Scanner;

public class PowerOf {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the N value");
	int n=s.nextInt();
	if(n>=0 && n<31)
	{
		
		for(int i=0;i<=n;i++)
		{
			int pow=1;
		for(int j=0;j<i;j++)
		{
			pow=pow*2;
		}
		System.out.println("the power of 2^"+i+" is "+pow);
	}
	}
	else
		System.out.println("n is not valid");
}
}

