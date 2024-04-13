package string_Exercise;

public class CheckString {
	public static void main(String[] args) {
		String[] inputs = { "ABC1234", "Hello", "3456" };

		for (String input : inputs) {
			boolean containsOnlyDigits = input.matches("[0-9]+");
			boolean containsOnlyLetters = input.matches("[a-zA-Z]+");

			if (containsOnlyDigits) {
				System.out.println("It contains digit only");
			} else if (containsOnlyLetters) {
				System.out.println("It contains string only");
			} else {
				System.out.println("It contains string as well as digits");
			}
		}
	}

}
