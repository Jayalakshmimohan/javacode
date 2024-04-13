package string_Exercise;

import java.util.Scanner;

public class CheckVowels {public static void main(String[] args) {
	int vcount=0;
	int ccount=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String s1 = sc.next();
	
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o' ||s1.charAt(i)=='u'|| s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O' ||s1.charAt(i)=='U' ) {
			vcount++;
		}else  {
			ccount++;
		}
	}
	System.out.println("the vowel count is :"+ vcount);
	System.out.println("the consonent count is:"+ ccount);
	
	
}

}


/* String name ="ahazar hussain";
* char[] vowels ={'a','e','i','o','u'};
* 
* int vcount=0;
* int ccount=0;
* 
* for(index=0;index<name.length();index++){
*  for(ind=0;ind<vowels.length();ind++){
*  if(vowels[ind]==name.charAt(index)){
*     vcount++;
*     }
*     }
*     ccount++;
*     }
*     }
*/


