package com.hashmapmain;
import java.util.*;

public class hashmapImplementation {
	
	public static HashMap<String, String> credentialHash()
	{
		HashMap<String, String> nw = new HashMap();
		nw.put("customer", "Bharath3696_crmpro1234567890");
		nw.put("Admin", "UM3434_1234567890");
		
		return nw;
	}
	
	public static HashMap<Integer, String> months()
	{
		HashMap<Integer, String> mon = new HashMap();
		mon.put(1, "January");
		mon.put(2, "February");
		mon.put(3, "March");
		mon.put(4, "April");
		mon.put(5, "May");
		mon.put(6, "June");
		mon.put(7, "July");
		mon.put(8, "August");
		mon.put(9, "September");
		mon.put(10, "October");
		mon.put(11, "November");
		mon.put(12, "December");
		
		return mon;	
	}

	
}
