import java.util.ArrayList;
import java.util.Scanner;
public class Histogram{
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		while (count != 0){
			arr.add(input.nextInt());
			count--;
		}
		for (Integer x : arr)
			while(x != 0){
				if (x == 1)
					System.out.print("= \n");
				else
					System.out.print("=");
				x--;
			}
	}
}