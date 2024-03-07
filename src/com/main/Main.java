package com.main;

import java.util.Scanner;

import com.Home.Home;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Home h=new Home();
		int p=0;
		while(p!=4)
		{
			System.out.println("\t1. Add Room");
			System.out.println("\t2. Control Room");
			System.out.println("\t3. ShowRoom");
			p=sc.nextInt();
			switch(p)
			{
				case 1:
				{
					h.addRoom();
				} 		
						break;
				case 2:
				{
					h.controlRoom();
				}
					break;
				case 3:
				{
					h.showRoom();
				}
				break;
				case 4:
				{
					System.out.println("Exit");
				}
						
			}
		}
	}

}
