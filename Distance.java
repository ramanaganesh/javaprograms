package functionalprogram;

import java.util.Scanner;

public class Distance {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=0,y=0;
	System.out.println("enter the two points ");
	int x1=s.nextInt(),y1=s.nextInt();
	int sq=(x1*x1)+(y1*y1);
	System.out.println(Math.sqrt(sq));
}
}

