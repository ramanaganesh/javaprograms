package functionalprogram;

import java.util.Scanner;

public class Gambler {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the stake amount");
	int stake=s.nextInt();
	System.out.println("enter the goal");
	int goal=s.nextInt();
	System.out.println("enter the trail");
	int trial=s.nextInt();
	int win=0,bet=0;
	for(int i=1;i<=trial;i++)
	{
		int cash=stake;
		while(cash >0 && cash<goal)
		{
			bet++;
		if(Math.random()<0.5)
		{
			cash++;
		}
		else
			cash--;
	}
		if(cash==goal)
			win++;
}
	System.out.println(win + " of "+trial);
	System.out.println("the win percentage is "+100.0*win/trial);
	System.out.println("average bet "+1.0*bet/trial);
}
}
