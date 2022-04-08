package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("0 param WishMessageGenerator.WishMessageGenerator()");
	}
	public  void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public String generateMessage(String user) {

		int hours = date.getHours();

		if (hours < 12)
			return "Good Morning : " + user;
		else if (hours < 16)
			return "Good Afternoon : " + user;
		else if (hours < 20)
			return "Good Evening : " + user;
		else
			return "Good Night : " + user;

	}

}
