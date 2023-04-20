import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = scanner.nextInt();
		
		System.out.println("Enter number of columns: ");
		int column = scanner.nextInt();
		
		String[][] rowColumn = new String[row][column];	
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				rowColumn[i][j] = " - ";
			}
			
		}
		
	
		Random random = new Random();
		int counter = 0;
		
		
		while(counter < (row * column / 4)) {
			int rowPoint = random.nextInt(row);
			int columnPoint = random.nextInt(column);
			
			if(!rowColumn[rowPoint][columnPoint].equals(" * ")) {
				rowColumn[rowPoint][columnPoint] = " * ";
				counter++;
				
			}else
				continue;
		}
		
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < column; j ++) {
				
				if(rowColumn[i][j] == null) {
					rowColumn[i][j] = " - ";
				}else
					continue;
			}
		}
		
		
		System.out.println("\nLocation of mines: \n");
		
		for(String[] stringArray : rowColumn) {
			for(String string : stringArray) {
				System.out.print(string);
			}
			System.out.println("\n");
		}
		
		System.out.println("===================================");
		System.out.println("\nWelcome to the minefield game!\n");
		
		boolean willContinue = true;
		
		while(willContinue) {
			
			System.out.println("Enter row number: ");
			int enteredRow = scanner.nextInt();
			
			System.out.println("Enter column number: ");
			int enteredColumn = scanner.nextInt();
			System.out.println("\nCurrent situation: \n");
			
			
			if(enteredRow < 0 || enteredRow > row || enteredColumn < 0 || enteredColumn > column) {
				System.out.println("You entered invalid numbers. Please try again.");
				continue;
			}
			else {
				if(rowColumn[enteredRow - 1][enteredColumn - 1].equals(" * ")) {
					System.out.println("Game over!");
					willContinue = false;
					break;
				}
				else {
					int inCounter = 0;
					
					for(int i = enteredRow - 2; i <= enteredRow; i++) {
						
						if(i < 0 || i == row)
							continue;
						for(int j = enteredColumn - 2; j <= enteredColumn; j++) {
														
							if(j < 0 || j == column) {
								continue;
							}
						
							else if(rowColumn[i][j].equals(" * ")) {
								
								inCounter++;
								}
							else {
								
								continue;
							
							}
							}
						
						}
					rowColumn[enteredRow - 1][enteredColumn - 1] = " " + String.valueOf(inCounter) + " ";
					
					}
				
				int finalCounter = 0;
				for(String[] stringArray : rowColumn) {
					
					for(String string : stringArray) {
						System.out.print(string);
						if(string.equals(" - "))
							finalCounter++;
						
					}
					System.out.println("\n");
				}
				if(finalCounter == 0) {
					System.out.println("You succesfully finished the game! Congratulations!");
					break;}
				
					
					
				}
			
			
		}
		
		scanner.close();
	
		
	}

}
