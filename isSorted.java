/*
 * Kevin Kantono
 * 02/29/2020
 * Checking whether numbers in an arrays are sorted.
 */


import java.util.Arrays;

public class isSorted {

	public static void main(String[] args) {
		double[] list = { 16.1, 12.3, 22.2, 14.4 };
		double[] list1 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };
		double[] list2 = { 1.5, 4.3, 7.0, 19.5, 27.56, 27.57 };
		double[] list3 = { 1.5, 4.3, 7.0, 19.5, 32.63, 32.62 };
		System.out.println(isSorted(list));
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
		System.out.println(isSorted(list3));

	}

	public static boolean isSorted(double[]list) {
		for (int i = 0; i < list.length-1; i++) {
			double prev = list[i];
			double next = list[i + 1];
			if (prev > next) {
				return false;
			}
		}return true;
		
	}
}