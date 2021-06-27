package javapackage;

import java.util.Scanner;

public class scannerClass 
{
	Scanner sc = new Scanner(System.in);
	
	int dispaly()
	{
		System.out.println("scanner class started");
		System.out.println("Enter First Number");
		int firstnum = sc.nextInt();
		System.out.println("Enter second Number");
		int secnum = sc.nextInt();
		System.out.println("Addition result====>"+ (firstnum+secnum));
		return 50;
	}
	int meth1()
	{
		System.out.println("Hi");
		return new scannerClass().dispaly();
	}
	void meth2()
	{
		System.out.println("Hello");
//		new scannerClass().meth1();
		System.out.println("Add Return value===> "+new scannerClass().meth1());
		sc.nextInt();
		System.out.println("Scanner class ended");
	}
	void bank()
	{
		System.out.println("please enter your character");
		String ch = sc.next();
		char val = ch.charAt(3);  // charAt() method is present in String class not in scanner class
		System.out.println("user entered character==> "+val);
	}
	public static void main(String[] args) 
	{
		new scannerClass().bank();
	}
}
