package functionalprogram;

import java.util.Scanner;

public class Permutatation {
public static void main(String[] args) {
;
    String a="abc";
    permutation(a.toCharArray(),0);
}

private static void permutation(char[] ch, int j) {
	
	

	if(ch.length-1==j)
		System.out.println(String.valueOf(ch));
	for(int i=j;i<ch.length;i++)
	{	
		swap(ch,j,i);
		permutation(ch, j+1);
		swap(ch,j,i);
	
	}
}

private static void swap(char c[], int i,int j) {
	
char temp=c[i];
c[i]=c[j];
c[j]=temp;
//System.out.println(c);	
}

}
