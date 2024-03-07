package com.Home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.room.Room;

public class Home 
{
	List<Room> ro;
	
	public Home() 
	{
		ro=new ArrayList<Room>();
	}
	public void addRoom()
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\t1. Kitchen");
			System.out.println("\t2. Living area");
			System.out.println("\t3. Dining area");
			System.out.println("\t4. Bedroom");
			System.out.println("\t5. Washroom");
			System.out.println("\t6. Corridors");
			System.out.println("\t7. EXIT");
			 ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					ro.add(new Room("Kitchen"));
				}
					break;
				case 2:
				{
					ro.add(new Room("Living area"));
				}
					break;
				case 3:
				{
					ro.add(new Room("Dining area"));
				}
					break;
				case 4:
				{
					ro.add(new Room("Bedroom"));
				}
					break;
				case 5:
				{
					ro.add(new Room("Washroom"));
				}
					break;	
				case 6:
				{
					ro.add(new Room("Corridors"));
				}
					break;
				case 7:
				{
					System.out.println("EXIT");
				}
				break;
			
			}
		}while(ch!=7);	
	}
	public void showRoom()
	{
		for(int i=0;i<ro.size();i++)
		{
			System.out.println(ro.get(i));
			
		}
	}
	public void controlRoom()
	{
		Scanner sc=new Scanner(System.in);
		showRoom();
		System.out.println("\tEnter the Room Name: ");
		String nm=sc.nextLine();
		int ref=search(nm);
		int choice=0;
		while(choice!=5)
		{
			System.out.println("\t1. Control");
			System.out.println("\t2. Add Device");
			System.out.println("\t3. Delete Device");
			System.out.println("\t5.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					if(ref!=-1)
					{
						int s=ro.get(ref).showDevices();
						int ch=sc.nextInt();
						if(ch<s)
						{
						ro.get(ref).controlGadget(ch-1);
						}
						else
						{
							System.out.println("Invalid");
						}
					}

				}
					break;
				case 2:
				{
					ro.get(ref).showDevices();
					ro.get(ref).addDevices();
				}
					break;
				case 3:
				{
					ro.get(ref).showDevices();
					int ch=sc.nextInt();
					ro.get(ref).deleteDevice(ch-1);
				}
					break;
				case 5:
				{
					System.out.println("Exit");
				}
					break;
				default:
				{
					System.out.println("Invalid");
				}
					break;
			}
		}
		
	}
	public int search(String nm)
	{
		for(int i=0;i<ro.size();i++)
		{
			if(ro.get(i).getName().equalsIgnoreCase(nm))
			{
				return i;
			}
		}
		return -1;
	}
	
}
