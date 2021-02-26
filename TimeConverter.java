package converter;

import java.util.Scanner;
import java.io.*;

public class TimeConverter
{
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public static void secConverter(int seconds)
	{
		
		System.out.println("In MINUTES: "+seconds/60);
		System.out.println("In HOURS: "+seconds/3600);
	}

	public static void minConverter(int minutes)
	{
		
		System.out.println("In HOURS: "+minutes/60);
		System.out.println("In SECONDS: "+minutes*60);
	}
	public static void hourConverter(int hours)
	{
		
		System.out.println("In MINUTES: "+hours*60);
		System.out.println("In SECONDS: "+hours*3600);
	}

	public void timeCon()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input type: ");
		System.out.println("1.Hours\n2.Minutes\n3.Sceonds");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter hours:");
				int hours = sc.nextInt();
				hourConverter(hours);
				break;
			case 2:
				System.out.println("Enter minutes:");
				int minutes = sc.nextInt();
				minConverter(minutes);
				break;
			case 3:
				System.out.println("Enter seconds:");
				int seconds = sc.nextInt();
				secConverter(seconds);
				break;
			default:
				System.out.println("Enter the right choice");
				break;
		}
	}
}