/*
 * Kevin Kantono
 * 02/29/2020
 * Checking whether numbers in an arrays are unique.
 */

import java.awt.List;
import java.util.Arrays;

public class isUnique {

	public static void main(String[] args) {
		int[] list = { 2, 9, 17, 43, -8, 46 };
		int[] list1 = { 4, 7, 3, 9, 12, -47, 3, 74 };
		int[] list2 = { 5, -5, 5, 0 };
		int[] list3 = { 10, -5, -2, 0 };
		System.out.println(isUnique(list));
		System.out.println(isUnique(list1));
		System.out.println(isUnique(list2));
		System.out.println(isUnique(list3));

	}

	public static boolean isUnique(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int prev = list[i];
//			System.out.println("prev  " + prev);
			for (int k = i + 1; k < list.length; k++) {
//				System.out.println("K  " + list[k]);
				if (prev == list[k]) {
					return false;
				}
			}
		}
		return true;
	}
}