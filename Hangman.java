import java.io.*;
import java.util.Scanner;


public class Hangman {

	private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water","data","football","movie","india","engineering","microsoft","mobile" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "-");
	private static int count = 0;
  private static String ar[]= new String[25];
  private static int iop = 0;
  private static int jop = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while (count < 7 && asterisk.contains("-")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);

			String guess = sc.next();
      ar[iop]=guess;
      iop+=1;
      hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '-') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "-";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
      word_enterd();
		} else {
			asterisk = newasterisk;
      word_enterd();

		}
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again : guess left= 6");
      System.out.println("   +");
			System.out.println("   |       ");
			System.out.println("   |       ");
			System.out.println("   |       ");
			System.out.println("   |      ");
      System.out.println("   |          ");
      System.out.println("   +=============     ");
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again : guess left= 5");
      System.out.println("   +-------+");
			System.out.println("   |       |");
			System.out.println("   |        ");
			System.out.println("   |       ");
			System.out.println("   |      ");
      System.out.println("   |          ");
      System.out.println("   +=============     ");
		}
		if (count == 3) {
		System.out.println("Wrong guess, try again : guess left= 4");
    System.out.println("   +-------+");
    System.out.println("   |       |");
    System.out.println("   |       o ");
    System.out.println("   |       ");
    System.out.println("   |       ");
    System.out.println("   |          ");
    System.out.println("   +=============     ");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again : guess left= 3");
      System.out.println("   +-------+");
			System.out.println("   |       |");
			System.out.println("   |       o ");
			System.out.println("   |       |");
			System.out.println("   |       ");
      System.out.println("   |          ");
      System.out.println("   +=============     ");
		}
		if (count == 5) {
		System.out.println("Wrong guess, try again : guess left= 2");
    System.out.println("   +-------+");
    System.out.println("   |       |");
    System.out.println("   |       o ");
    System.out.println("   |      /|\\ ");
    System.out.println("   |        ");
    System.out.println("   |          ");
    System.out.println("   +=============     ");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again : guess left= 1");
      System.out.println("   +-------+");
			System.out.println("   |       |");
			System.out.println("   |       o ");
			System.out.println("   |      /|\\ ");
			System.out.println("   |      / ");
      System.out.println("   |          ");
      System.out.println("   +=============     ");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   +-------+");
			System.out.println("   |       |");
			System.out.println("   |       o ");
			System.out.println("   |      /|\\ ");
			System.out.println("   |      / \\ ");
      System.out.println("   |          ");
      System.out.println("   +=============     ");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
  public static void word_enterd() {
    System.out.println("Your Guesses are : ");
    jop=0;
    while(jop!=iop){
      System.out.print((jop+1)+" : "+ar[jop]+"\t \n");
      jop+=1;
    }
    System.out.print("\n");
  }
}

