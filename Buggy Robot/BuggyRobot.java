import java.util.Scanner;

public class BuggyRobot{
	static int x = 0, y = 0;
	public static void main (String[] args){
		// Declarations
		Scanner input = new Scanner(System.in);
		int robotX, robotY, exitX, exitY; // Saving location of where the Robot and Exit is located
		String s; // A string that will contain commmands for Robot
		y = input.nextInt(); // 2D Array size value
		x = input.nextInt(); // 2D Array size value
		char[][] grid = new char[y][x]; // Since I called the array a grid y is vertical and the x is horizontal
		
		for (int m = 0; m < y; m++){
			String value = input.next();
			char [] temp = value.toCharArray();
			for (int n = 0; n < x; x++){
				grid[m][n] = temp[n];
				if (temp[n] == 'R'){ // Save location of Robot
					robotX = n;
					robotY = m;
				}else if(temp[n] == 'E'){ // Save location of Exit
					exitX = n;
					exitY = m;
				}
			}            
		}
		s = input.next();
		int count = 0;
		while (count < s.length()){
			char letter = s.charAt(count);
			if(letter == 'U'){
				if (!inBounds(locX - 1, locY - 1)){
					break;
				}
			}else if (letter == 'D'){
				if (!inBounds(locX - 1, locY - 1)){
					break;
				}
			}

			}
		}
	static boolean inBounds(int locX, int locY){ // Check to see if Command was inbounds if not ignore
			boolean boundary = false;
			if ((locX >= x) || (locX <= 0) || (locY))
		}
	static int nextMove(char letter, int locX, int locY){

			switch(letter){
				case 'U': -1;


			}
		}
	}
}