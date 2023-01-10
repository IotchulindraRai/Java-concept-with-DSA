package com.chulin;

import java.util.Set;
import java.util.TreeSet;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Set<Integer> values = new TreeSet<> ();
  System.out.println(values.add(223));
  System.out.println(values.add(323));
  System.out.println(values.add(225));
  System.out.println(values.add(323));
 
		  for (Integer j : values) {
	  System.out.println(j);
  }
	}

}
