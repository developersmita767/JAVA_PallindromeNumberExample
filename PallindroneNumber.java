package Mypack;

import java.util.Scanner;

public class PallindroneNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=0;
		int originalno=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is :" + rev);
		if(originalno==rev)
		{
			System.out.println("Number is pallindrone");
		}
		else
		{
			System.out.println("Number is not pallindrone");
			
			
		}
	
	}

}
