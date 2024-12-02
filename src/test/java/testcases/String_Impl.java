package testcases;

import java.util.HashSet;
import java.util.Set;

public class String_Impl {

	
	
	public static void main(String[] args) {
		
		
		
		String s1="zkcaabbcc";
		
		String s2="aa";
		
		s1=s2;
		System.out.println("the value of s1 is : "+ s1);
		
		for(int i=0;i<s1.length()-1;i++)
		{
			char cStore=s1.charAt(i);
			//System.out.println(cStore);
		//	note : index of method pata kregi is string ke character ka index ky hai 
			
			
			if(s2.indexOf(cStore)==-1)
			{
				s2=s2+cStore;
			}
			
			
		}
		System.out.println("the answer is:"+s2);
	
	
	
	String s3="AbhiAbhi";
	String s4="";
	for(int i=0;i<s3.length()-1;i++)
	{
	System.out.println(s3.indexOf(s3.charAt(i)));
	}
	
	
	
	String s9="zzaksss";
	Set set=new HashSet();
	
	for(char c:s9.toCharArray())
	{
		set.add(c);
	}
	System.out.println(set);
}
}
