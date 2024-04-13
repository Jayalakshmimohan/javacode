package string_Exercise;

public class ReverseString {
	public static void main(String[] args) {
		String str ="Nandy";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=(str.charAt(i));
		}
		System.out.println(s);
	}
 

}