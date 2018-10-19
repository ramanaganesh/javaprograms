package functionalprogram;

import java.util.Scanner;

public class Array2D {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the row and column ");
	int row=s.nextInt(),col=s.nextInt();
	int arr[][]=new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
		    System.out.print("arr["+i+"]["+j+"]=");
		    arr[i][j]=s.nextInt();
		    System.out.println();
		}
	}
	System.out.println("2D array is");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}

