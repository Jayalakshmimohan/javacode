package Assignment2;

import java.util.*;

public class StringBuilderDemo {
	public static void main(String[] args) {
		//stringBuilder is non-synchronized and doesn't ensure thread safety
		StringBuffer sb = new StringBuffer("able was i ere i saw elba.");
		System.out.println(sb.capacity());//string length+16=42
		System.out.println("**************************");
		String hannah = new String ("Did Hannah see bees? Hannah did.");
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf('b'));
		System.out.println("**************************");
		StringBuilder sb1 = new StringBuilder ("was it a car or a cat i saw?");
		System.out.println(sb1.subSequence(9, 12));
		System.out.println("**************************");
		
	

			
			String original = "software";

			StringBuffer result = new StringBuffer("hi");

			int index = original.indexOf('a');

			 result.setCharAt(0, original.charAt(0));

			 result.setCharAt(1, original.charAt(original.length()-1));

			 result.insert(1, original.charAt(4));

			 result.append(original.substring(1,4));

			 result.insert(3, (original.substring(index, index+2) + " "));

			System.out.println(result);
			
			System.out.println("**************************");
			String hi = new String ("Hi,");
			String mom = new String(" mom.");
			
			System.out.println(hi + mom);
			
			mom = hi.concat(mom);
			System.out.println(mom);
			System.out.println("********Write a program that computes your initials from your full name and displays them.******************");
			
			String string1 = new String ("Nandy Prabhu");
			char char1 = string1.charAt(0);
			 int a = string1.indexOf(" ")+1;
			char char2 = string1.charAt(a);
			System.out.println(char1+" "+char2);
			
			System.out.println("************Anagrams**************");
			String str1 = "swear oft";
			String str2 = "software";
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			str1= str1.replace(" ","");
			str2 = str2.replace(" ","");
//			String h="";
//			String b="";
			
			if(str1.length()==str2.length()) {
			
			char array1[] = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			boolean res = Arrays.equals(array1,array2);
			if(res) {
				System.out.println(str1 + " and " + str2 + " are anangrams");
			}else {
				System.out.println(str1 + " and " + str2 + " are not anangrams");
			}
			}
			else {System.out.println(str1 + " and " + str2 + " are not anangrams");
				
			}
//			for(int i=0; i<chararray1.length; i++) {
//				h+=chararray1[i];
//			}
//			for(int j=0; j<chararray2.length; j++) {
//				b+=chararray2[j];
//			}
//			
//			if(h.equals(b)) {
//				System.out.println("equal");
//			}
//			else {
//				System.out.println("not equal");
//				
//			}
//			
			
			
			
			
			 
			
			

			}

			
		
	}