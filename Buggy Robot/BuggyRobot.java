import java.util.Scanner;

public class BuggyRobot{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int y = 0, x = 0; 
		String s;
		
		y = input.nextInt();
		x = input.nextInt();
		char[][] grid = new char[y][x]; // Since I called the array a grid y is vertical and the x is horizontal
		for (int m = 0; m < y; m++){
			String value = input.next();
			for (int n = 0; n < x; x++){
				
				if(value.matches("U|D|R|L"))
				grid[m][n] = input.nextChar();
			}
		}

	}
}