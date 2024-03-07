package com.gadget;

import java.util.Calendar;

import com.interfaces.Devices;

public class AirConditioner  implements Devices{
	String button;
	Calendar time;
	
	public AirConditioner() {
		super();
		this.button = "off";
		this.time=Calendar.getInstance() ;
	}
	
	public Calendar getTime() {
		return time;
	}

	public void setTime() {
		this.time = Calendar.getInstance() ;
	}


	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}
	public void on()
	{
		if(!button.equals("on"))
		{
			this.setButton("on");
			setTime();
		}
		else
		{
			System.out.println("All Ready On");
		}
	}
	public void off()
	{
		if(!button.equals("off"))
		{
			this.setButton("off");
			setTime();
		}
		else
		{
			System.out.println("All Ready On");
		}
	}
	public void status()
	{
		Calendar current=Calendar.getInstance();
		int now=current.get(Calendar.MINUTE) - time.get(Calendar.MINUTE);
		System.out.println("TV is :"+button + "was on for : "+now+"min");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AirConditioner";
	}
	
}
