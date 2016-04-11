package shaffer.j;

import java.util.Scanner;

public class Anagram {

	public static int count = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to anagram.");

		getInput();
	}

	public static void getInput() {
		String userWord = "";
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter word to anagram (-1 to exit):");
			userWord = input.nextLine();

			if (userWord.equals("-1") == true) {
				System.out.println("Good bye.");
				System.exit(0);
			} else {
				anagramIt("", userWord);
			}
		}
	}

	public static void anagramIt(String beginningString, String endingString) {
		if (endingString.length() <= 1) {
			count++;
			System.out.println(count + " " + beginningString + endingString);
		} else {
			for (int i = 0; i < endingString.length(); i++) {
				String newString = endingString.substring(0, i) + endingString.substring(i + 1);

				anagramIt(beginningString + endingString.charAt(i), newString);
			}
		}
	}
}
