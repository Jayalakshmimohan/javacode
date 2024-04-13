package corejavaexercise;

public class SmallestIndexFinder {

	public static void main(String[] args) {
		int[] array = { 5, 3, 7, 1, 9, 2 };
		int smallestIndex = findSmallestIndex(array, 0, array.length - 1);
		System.out.println("Index of the smallest value: " + smallestIndex);
	}

	public static int findSmallestIndex(int[] array, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			return startIndex; // Base case: only one element in the subarray
		} else {
			int midIndex = (startIndex + endIndex) / 2;
			int leftSmallestIndex = findSmallestIndex(array, startIndex, midIndex);
			int rightSmallestIndex = findSmallestIndex(array, midIndex + 1, endIndex);
			return (array[leftSmallestIndex] < array[rightSmallestIndex]) ? leftSmallestIndex : rightSmallestIndex;
		}
	}
}