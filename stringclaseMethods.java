 import java.util.*;
//import java.util.Scanner;

public class srthh {

	public static void main(String[] args) {
		 String s1=new String("aditya has thub ");
//length
		 int l=s1.length();
		   System.out.println(l);
		   
		   s1=s1.concat("is ADitya");
		   System.out.println(s1);
//lower case upper case
		   System.out.println(s1.toLowerCase());
		   System.out.println(s1.toUpperCase());
		   
//split()
		   String word[]=s1.split(" ");
		   for(String i:word)
		   {
			   System.out.println(i);
		   }
//equals
		   String s11=new String("aditya has thub ");
		   String s12=new String("aditya has thuB ");
		   System.out.println(s11.equals(s12));
		   System.out.println(s11.equalsIgnoreCase(s12));
 //replace
		   System.out.println(s11.replace('a','z'));
		   System.out.println(s1.replaceFirst("has","was"));
//count of a's
		   System.out.println(s11.length()-s11.replace("a","").length());
		   
//substring
		   String su=new String("ram is a good boy");
		   System.out.println(su);
		   System.out.println(su.indexOf('i'));
		   System.out.println(su.lastIndexOf('a')); 
		   System.out.println(su.substring(7));
		   System.out.println(su.substring(1,6));
		   
		   

//		   System.out.println(su.indexOf('i'));
		}
	
	}

			
 	
