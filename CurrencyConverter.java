package converter;

import java.util.Scanner;
import java.io.*;

public class CurrencyConverter
{
	
	private double dollar;
	private double euro;
	private double yen;
	private double inr;
	

	public CurrencyConverter()
	{
		
		dollar = 0.0;
		euro = 0.0;
		yen = 0.0;
		inr = 0.0;
	}
	public static void dollarConverter(double amount)
	{
		
		System.out.println("In EURO: "+amount*0.82);
		System.out.println("In YEN: "+amount*105.62);
		System.out.println("In INR: "+amount*72.83);
	}

	public static void euroConverter(double amount)
	{
		
		System.out.println("In DOLLAR: "+amount*1.21);
		System.out.println("In YEN: "+amount*128.14);
		System.out.println("In INR: "+amount*88.37);
	}

	public static void yenConverter(double amount)
	{
		
		System.out.println("In DOLLAR: "+amount*0.0095);
		System.out.println("In EURO: "+amount*0.0078);
		System.out.println("In INR: "+amount*0.69);
	}

	public static void inrConverter(double amount)
	{
		
		System.out.println("In DOLLAR: "+amount*0.014);
		System.out.println("In EURO: "+amount*0.011);
		System.out.println("In YEN: "+amount*1.45);
	}

	public void currencyCon()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input type: ");
		System.out.println("1.DOLLAR\n2.EURO\n3.YEN\n4.INR");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter amount:");
				double amount = sc.nextDouble();
				dollarConverter(amount);
				break;
			case 2:
				System.out.println("Enter amount:");
				double amount2 = sc.nextDouble();
				euroConverter(amount2);
				break;
			case 3:
				System.out.println("Enter amount:");
				double amount3 = sc.nextDouble();
				yenConverter(amount3);
				break;
			case 4:
				System.out.println("Enter amount:");
				double amount4 = sc.nextDouble();
				inrConverter(amount4);
				break;
			default:
				System.out.println("Enter the right choice");
				break;
		}
	}
}