package com.prakharjain.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Hi{
	
	
	
	 public static void main(String... arrrrrgs) {
		 
		 
		 float[] temp;
	        Properties p = System.getProperties();
	        p.setProperty("pirate","scurvy");
	        String s = p.getProperty("argProp") + " ";
	        s += p.getProperty("pirate");
	        System.out.println(s);
	    }
}
