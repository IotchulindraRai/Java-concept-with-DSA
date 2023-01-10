package com.chulin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	map.put("myName","John");
	map.put("lover","Chulin");
	map.put("ceo","Soniya");
	map.put("ceo","Gg");
/*
System.out.println(map.get("lover"));
System.out.println(map.get("1"));
*/
	Set<String>keys=map.keySet();
	for(String key : keys) {
		System.out.println(key + "  " +map.get(key));
	}
}
}
