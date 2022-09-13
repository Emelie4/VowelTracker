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
		for(int v = 0; v < userVowel.length(); v++) {
			if(userVowel.toLowerCase().charAt(v)=='a' || userVowel.toLowerCase().charAt(v)=='e' || userVowel.toLowerCase().charAt(v)=='i' || userVowel.toLowerCase().charAt(v)=='o' || userVowel.toLowerCase().charAt(v)=='u') {
				count++;
				
		
			}//end of if statement 
		}//end of userVal for loop
		
		System.out.println(count);
	
	}//end of main

}//end of class
