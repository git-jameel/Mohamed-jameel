import java.util.Scanner;

public class vowel {
	
	public static void main(String[] args) {
		Scanner alpha = new Scanner(System.in);
		System.out.println("Enter a alphabet:");
		char ch =alpha.next().charAt(0);
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
		    System.out.println(ch  + "is a vowel");
		else
		    System.out.println(ch   + "is not a vowel or called as consonant");
		
	}

}
