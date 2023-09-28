package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class Count_Reapeating_Char_In_String_Using_Hashmap {
public static void main(String[] args) {
	
 String org ="kalyani";	
	
 HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
	
	for(int i=0;i<=org.length()-1;i++)
	{
		char s1=org.charAt(i);
	
	if(mp.containsKey(s1))
	{
		mp.put(s1, mp.get(s1)+1);
	}
	else
	{
		mp.put(s1, 1);
	}
	}
	Set<Character>allKeys=mp.keySet();
	
	//print only duplicate character
	
	for(Character key:allKeys)
	{
		if(mp.get(key)>1)
		{
		System.out.println(key+":"+mp.get(key));
	}
	
}
}}
