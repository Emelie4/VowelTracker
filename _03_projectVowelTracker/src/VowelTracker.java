import java.util.Scanner;
public class VowelTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A project to count the number of vowels in a user types line
		 * More functionality coming
		 * 
		 * have it turn all letters to lowercase before starting or account for lower case 
		 * have it count the different vowels
		 * have it print that out 
		 * have it print out the vowel that get used to most
		 * have it print out the usage of the other letters
		 * 
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Have you ever wondered which vowel gets used the most? Maybe you already know but want to see for yourself.\n"
				+ "Introducing vowel tracker. Simply type your line and then the program will idenity the precise numbers of a,e,i,o,and u's.\n"
				+ "Alright get typing");
		
		String userVowel = scn.nextLine();
		int count = 0;
		int countA = 0; 
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		for(int v = 0; v < userVowel.length(); v++) {
			if(userVowel.toLowerCase().charAt(v)=='a') {
				countA++;
			}
			else if(userVowel.toLowerCase().charAt(v)=='e') {
				countE++;
			}
			else if(userVowel.toLowerCase().charAt(v)=='i') {
				countI++;
			}
			else if(userVowel.toLowerCase().charAt(v)=='o') {
				countO++;
			}
			if(userVowel.toLowerCase().charAt(v)=='u') {
				countU++;
			}
		}//end of userVal for loop
		
		System.out.println("The number of a's is " +countA + "\n"
				+ "The number of e's is "+ countE+ "\n"
						+ "The number of i's is " + countI + "\n"
						+ "The number of o's is "+ countO + "\n"
								+ "The number of u's is " + countU);
	
	}//end of main

}//end of class
