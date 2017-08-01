import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class sock2 {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<Integer> list;
		int low;
		int high;
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		long startTime = System.currentTimeMillis();
		list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(input.nextInt());
		}
		input.close();
		Collections.sort(list);

		low = 0;
		high = n - 1;
		Integer[] arr = list.toArray(new Integer[list.size()]);
		while (low < high) {
			if (arr[low] > 0 && arr[high] > 0) {
				arr[low]--;
				arr[high]--;
				count++;
			} else {
				if (arr[low] == 0) {
					low++;
				}
				if (arr[high] == 0) {
					high--;
				}
			}
		}
		System.out.println(count);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}