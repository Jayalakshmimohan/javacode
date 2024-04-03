package genericsAssignment1;

public class GenericQ2 {
	public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
		// Check if the indices are within bounds
		if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}

		// Swap the elements
		T temp = list[firstPos];
		list[firstPos] = list[secondPos];
		list[secondPos] = temp;

		return list;
	}

	public static void main(String[] args) {
		Integer[] myArray = { 5, 2, 3, 4, 1 };
		try {
			Integer[] swappedArray = swap(myArray, 1, 3);
			System.out.print("Swapped array: ");
			for (Integer element : swappedArray) {
				System.out.print(element + " ");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}