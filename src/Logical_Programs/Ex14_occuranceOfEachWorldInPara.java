package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Ex14_occuranceOfEachWorldInPara {
public static void main(String[] args) {
	
	String org="my name is kalyani be";
	
	String[]ar=org.split("");
	
	HashMap<String,Integer>mp=new HashMap<String,Integer>();
	for(int i=0;i<=ar.length-1;i++)
	{
		String s1= ar[i];
		if(mp.containsKey(s1))
		{
			mp.put(s1, mp.get(s1)+1);
		}
		else
		{
			mp.put(s1, 1);
		}
	}
	//get all keys
      Set<String>allkeys=mp.keySet();
	
      //print duplicate words
	for(String key:allkeys)
	{
		if(mp.get(key)>1)
		{
			System.out.println(key+":"+mp.get(key));
		}
	}
	
	
	
	
	
	
	
	
	
}
}
