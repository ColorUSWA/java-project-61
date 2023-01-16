package hexlet.code;

import java.util.Scanner;

public class Cli {
	public static void welcomeTheGamePlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("May I have your name?");
		String namePlayer = scanner.next();
		System.out.println("Hello, " + namePlayer + "!");
	}
}
