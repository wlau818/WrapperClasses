import java.util.Scanner;

public class WrapperClasses {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Number of values: ");
		String num = scnr.next();
		Integer number = Integer.parseInt(num);
		String[] sValues = new String[number];
		Integer[] values = new Integer[number];
		for (Integer i = Integer.valueOf(0); i.compareTo(number) < 0; i = Integer.valueOf(i + 1)) {
			System.out.print("Value " + (i + 1) + ": ");
			sValues[i] = scnr.next();
			values[i] = Integer.parseInt(sValues[i]);
		}
		
		for (Integer i = Integer.valueOf(number - 1); i.compareTo(0) > 0; i = Integer.valueOf(i - 1)) {
			for (Integer j = Integer.valueOf(0); j.compareTo(i) < 0; j = Integer.valueOf(j + 1)) {
				if (values[j].compareTo(values[j + 1]) > 0) {
					Integer temp = Integer.valueOf(values[j]);
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
		}
		System.out.print("To string: ");
		for (Integer i = Integer.valueOf(0); i.compareTo(number) < 0; i = Integer.valueOf(i + 1)) {
			System.out.print(values[i].toString() + " ");
		}
	}

}
