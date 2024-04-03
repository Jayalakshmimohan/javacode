package genericsAssignment1;

import java.util.List;
import java.util.Vector;

/**
 * Supports arithmetic operations of +, -, *, / on any type that are subclasses
 * of {@link java.lang.Number}.
 * 
 * @author pchandra
 */
public class ArithmeticOperations {

	/**
	 * Generic method to add 2 numbers.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number add(T t1, T t2) {
		return t1.doubleValue() + t2.doubleValue();
	}

	/**
	 * Demostrates Upper Bounded Wildcards. Generic method to add numbers from a
	 * list.
	 * 
	 * @param list
	 * @return
	 */
	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();

		return new Double(d);
	}

	/**
	 * Demonstrates Unbounded Wildcards. Generic method to dump list data to
	 * console.
	 * 
	 * @param list
	 */
	public static void dumpList(List<?> list) {
		System.out.println("List dump with unbounded wildcard:");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	/**
	 * Generic method to subtract 2 numbers.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number subtract(T t1, T t2) {
		return t1.doubleValue() - t2.doubleValue();
	}

	/**
	 * Generic method to divide 2 numbers.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number divide(T t1, T t2) {
		if (t2.doubleValue() == 0) {
			throw new IllegalArgumentException("Division by zero");
		}
		return t1.doubleValue() / t2.doubleValue();
	}

	public static void main(String[] args) {
		// Adding 2 integers
		Integer i1 = new Integer(34), i2 = new Integer(43);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));

		// Subtracting 2 integers
		System.out.println("Subtract with generic method: " + ArithmeticOperations.subtract(i1, i2));

		// Dividing 2 integers
		System.out.println("Divide with generic method: " + ArithmeticOperations.divide(i1, i2));

		Float f1 = new Float(12.56), f2 = new Float(3.6778);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2));

		// Adding 2 integers through a list
		Vector<Number> l = new Vector<Number>();
		l.add(new Integer(34));
		l.add(new Integer(43));
		System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));

		// Dumping the list to the console
		ArithmeticOperations.dumpList(l);
	}
}
