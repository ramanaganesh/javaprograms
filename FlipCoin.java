import java.util.Scanner;

public class FlipCoin {
public static void main(String[] args) {
	System.out.println("enter how many times to flip");
	Scanner s=new Scanner(System.in);
	int times=s.nextInt();
	double head=0,tail=0;
	for(int i=0;i<times;i++)
	{
		//double head=0,tail=0;
		if(Math.random()<0.5)
		{
			head++;
			//System.out.println("head="+head/2+" tail="+tail);
		}
		else
		{

			tail++;
			//System.out.println("head="+head+" tail="+tail/2);
			
		}
			
	}
	double hperc=(head/times)*100;
	double tperc=(tail/times)*100;
	System.out.println("number of head "+head+" with head percentage is "+hperc+"%");
	System.out.println("number of tail "+tail+" with tail percentage is "+tperc+"%");
	
}
}
