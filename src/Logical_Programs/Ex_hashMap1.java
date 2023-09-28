package Logical_Programs;

import java.util.HashMap;
//1:put ->to add key,value info hashmap
//2:containskey-->to verify pariticular key present or not
//3:get-->To get value of particular key
//4:keySet--> to get keys from map object
import java.util.Set;

public class Ex_hashMap1 {
public static void main(String[] args) {
	
HashMap<Integer,String>	mp=new HashMap<Integer,String>();
	mp.put(101, "ramesh");
	mp.put(102, "ganesh");
	mp.put(103, "umesh");
	mp.put(101, "Ramesh");   //update
	
	System.out.println(mp);
	System.out.println(mp.containsKey(102));
	
	System.out.println(mp.get(102));
	
	System.out.println("------get all keys------");
	Set<Integer>allKeys=mp.keySet();
	for( Integer key:allKeys)
	{
		System.out.println(key);
	}
	System.out.println("----get all keys & values-----------");
	
	for(Integer key:allKeys)
	{
		System.out.println(key+" "+mp.get(key));
	}
}
}
