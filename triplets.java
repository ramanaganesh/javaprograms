package functionalprogram;

import java.util.Scanner;

public class triplets {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the N integers");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-2;i++)
	{ int sum=0;
		for(int j=i;j<n-2;j++)
		{
			sum=a[j]+a[j+1]+a[j+2];
			if(sum==0)
				{
				System.out.println(a[j]+" "+a[j+1]+" "+a[j+2]);
				break;
				}
		}
		if(sum==0)
			break;
	}
}
}

