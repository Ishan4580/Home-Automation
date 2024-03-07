package com.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gadget.AirConditioner;
import com.gadget.ElectronicDevices;
import com.gadget.Lights;
import com.gadget.Showers;
import com.gadget.TV;
import com.interfaces.Devices;

public class Room {
	String name;
	List<Devices> d;
	
	public Room(String name) {
		this.name = name;
		d=new ArrayList<Devices>();
		addDevices();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addDevices()
	{
		Scanner sc=new Scanner(System.in);
		int p=0;
		while(p!=6)
		{
			System.out.print("\n\t1. TV \n\t2. ElectronicDevices \n\t3. Lights \n\t4. AirConditioner \n\t5. Showers \n\t6. Exit\n");
			 p=sc.nextInt();
			switch(p)
			{
				case 1:
				{
					d.add(new TV());
				}
					break;
				case 2:
				{
					d.add(new ElectronicDevices());
				}
					break;
				case 3:
				{
					d.add(new Lights());
				}
					break;
				case 4:
				{
					d.add(new AirConditioner());
				}
				 	break;
				case 5:
				{
					d.add(new Showers());
				}
					break;
			}
		}	
	}
	public int showDevices()
	{
		int i=1;
		for(Devices ref: d)
		{
			System.out.println(i+". "+ref);
			i++;
		}
		return i;
	}
	public void controlGadget(int ref)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=4)
		{
			System.out.println("\t1. On");
			System.out.println("\t2. Off");
			System.out.println("\t3. Status");
			System.out.println("\t4. Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					d.get(ref).on();
				}
					break;
				case 2:
				{
					d.get(ref).off();
				}
					break;
				case 3:
				{
					d.get(ref).status();
				}
					break;
				case 4:
				{
					System.out.println("Exit");
				}
					break;
				default :
				{
					System.out.println("Invalid");
				}
					break;
			}
		}
	}
	public void deleteDevice(int ref)
	{
		d.remove(ref);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room Name : "+name;
	}
	
	
	
}
