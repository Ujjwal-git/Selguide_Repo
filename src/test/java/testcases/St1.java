package testcases;

public class St1 {
public static void main(String[] args) {
	
	String s1="zzaaljajzjkjlajjzjkjjzjzjkjkjzkjkjzkzjjkzkjzkzjkzjkzjkzjsjaiy88@@@yattrtf";
	String s2="";
	
	for(int i=0;i<s1.length()-1;i++)
	{
		
		char check=s1.charAt(i);
		
		if(s2.indexOf(check)==-1)
		{
			s2+=check;
			
		}
	}
	
	
	System.out.println(s2);
	
	
}
}
