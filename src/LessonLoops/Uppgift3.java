package LessonLoops;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		while (true) {
			System.out.print("write a number: ");
			String usersLine = myScanner.nextLine();
			if(usersLine.equals("esc")) {
				break;
			}
			int usersNumber = Integer.parseInt(usersLine);
			
			if (usersNumber > 5) {
				if (usersNumber > 8 && usersNumber < 10 || usersNumber > 33) {
					System.out.println("good");

				} else {
					System.out.println("the number was not larger than 8, smaller than 10 or larger than 33");
				}
			} else {
				System.out.println("The number was not larger than five.");
			}
		}
		
		System.out.println("Closing the program!");
	}
}
