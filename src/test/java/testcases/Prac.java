package testcases;

public class Prac {
 public static void main(String[] args) {
	
	 
	 String s1="aaassnnaannannanjnsjnwjdbkjbqbdjkbkjqwd";
	 String s2="";
	 
	 for(int i=0;i<s1.length()-1;i++)
	 {
		 char charStore=s1.charAt(i);
		 
		 if(s2.indexOf(charStore)==-1)
		 {
			 s2+=charStore;
		 }
	 }
	 
	 System.out.println(s2);
}
}
