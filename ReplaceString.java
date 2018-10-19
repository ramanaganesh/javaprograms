import java.util.Scanner;

public class ReplaceString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter user name");
	String uname=s.next();
	if(uname.length()>=3)
	{
		System.out.println("enter another uname");
		uname=s.next();
		if(uname.length()>=3)
		{
			System.out.println("hello "+uname+" how are you?");
		}
		else
		{
			System.out.println("enter proper name with min 3 character");
		}
	}
	else
	{
		System.out.println("user name with min 3 character");
	}
}
}

