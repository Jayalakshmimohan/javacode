package corejavaexercise;

public class SmallestInteger {

	public static int findSmallest(int[] arr, int i) {
		// Base case: If the array has only one element, return that element
		if (i == 0) {
			return arr[i];
		}

		// Recursive case: Compare the current element with the smallest value in the
		// rest of the array
		int currentElement = arr[i];
		int smallestInRest = findSmallest(arr, i - 1);

		// Return the smaller of the two values
		return Math.min(currentElement, smallestInRest);
	}

	public static void main(String[] args) {
		int[] inputArray = { 5, 3, 1 };
		int smallestValue = findSmallest(inputArray, inputArray.length - 1);
		System.out.println("The smallest value in the array is: " + smallestValue);
	}
}
