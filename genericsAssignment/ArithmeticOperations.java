package genericsAssignment;

import java.util.List;
import java.util.Vector;

public class ArithmeticOperations {
	// Existing add method...
	public static <T extends Number> Number add(T t1, T t2) {
		return t1.doubleValue() + t2.doubleValue();
	}

	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();
		return d;
	}

	// New subtract method
	public static <T extends Number> Number subtract(T t1, T t2) {
		return t1.doubleValue() - t2.doubleValue();
	}

	// New divide method
	public static <T extends Number> Number divide(T t1, T t2) {
		if (t2.doubleValue() == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return t1.doubleValue() / t2.doubleValue();
	}

	public static void dumpList(List<?> list) {
		System.out.println("List dump with unbounded wildcard:");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	public static void main(String[] args) {
		// Adding 2 integers
		Integer i1 = new Integer(34), i2 = new Integer(43);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
		Integer s1 = new Integer(60), s2 = new Integer(40);
		System.out.println("sub with generic method: " + ArithmeticOperations.subtract(s1, s2));
		Integer d1 = new Integer(80), d2 = new Integer(20);
		System.out.println("divide with generic method: " + ArithmeticOperations.divide(d1, d2));
		Float f1 = new Float(12.56), f2 = new Float(3.6778);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2));
		// Adding 2 integers through a list
		Vector<Number> l = new Vector<Number>();
		l.add(new Integer(34));
		l.add(new Integer(43));
		System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));

		// Dumping the list to the console.
		ArithmeticOperations.dumpList(l);
	}

}
