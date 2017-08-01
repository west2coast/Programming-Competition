import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Socks {
	static ArrayList<Long> sockColors = new ArrayList<Long>();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		long totalPairs = 0;
		int totalColors = input.nextInt(); // number of color socks
long startTime = System.currentTimeMillis();
		for (int x = 0; x < totalColors; x++) {
			sockColors.add(count++, input.nextLong());
		}
		input.close();
		Collections.sort(sockColors);
		System.out.println(mismatchedPairs(totalPairs, totalColors - 1));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	public static long mismatchedPairs(long totalPairs, int totalColors) {
		while (sockColors.size() > 1) {
			int index = sockColors.size() - 1;
			int firstSockIndex = index;
			int secondSockIndex = index - 1;
			long firstSockTotal = sockColors.get(firstSockIndex);
			long secondSockTotal = sockColors.get(secondSockIndex);

			if (firstSockTotal >= secondSockTotal) {
				firstSockTotal -= secondSockTotal;
				if (firstSockTotal == 0)
					sockColors.remove(firstSockIndex);
				else
					sockColors.set(firstSockIndex, firstSockTotal);
				sockColors.remove(secondSockIndex);
				totalPairs += secondSockTotal;

			} else {
				sockColors.set(secondSockIndex, secondSockTotal - firstSockTotal);
				sockColors.remove(firstSockIndex);
				totalPairs += firstSockTotal;

			}
		}

		return totalPairs;
	}

}
