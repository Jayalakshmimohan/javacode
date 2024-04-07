package javacodingexercise;

public class Number {

	// Method to check if a number is prime
	public int checkPrime(int x) {
		if (x <= 1) {
			return 0; // 0 indicates not prime
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return 0; // 0 indicates not prime
			}
		}
		return 1; // 1 indicates prime
	}

	// Method to check if a number is Armstrong
	public boolean checkArmstrong(int x) {
		int originalNumber, remainder, result = 0, n = 0;
		originalNumber = x;
		while (originalNumber != 0) {
			originalNumber /= 10;
			++n;
		}
		originalNumber = x;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /= 10;
		}
		return result == x;
	}

	// Method to check if a number is palindrome
	public boolean checkPalindrome(int x) {
		int reversedNum = 0, remainder, originalNum;
		originalNum = x;
		while (x != 0) {
			remainder = x % 10;
			reversedNum = reversedNum * 10 + remainder;
			x /= 10;
		}
		return originalNum == reversedNum;
	}

	public static void main(String[] args) {
		Number num = new Number();
		int number = 131;
		System.out.println("Is " + number + " prime? " + (num.checkPrime(number) == 1 ? "Yes" : "No"));
		System.out.println("Is " + number + " Armstrong? " + (num.checkArmstrong(number) ? "Yes" : "No"));
		System.out.println("Is " + number + " Palindrome? " + (num.checkPalindrome(number) ? "Yes" : "No"));
	}
}
