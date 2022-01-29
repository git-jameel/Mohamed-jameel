import java.util.Scanner;

public class oddoreven {
	public static void main(String[] args) {
		int num;
		System.out.println("enter an integer number:");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
			System.out.println("the entered number is even");
		else
			System.out.println("the entered number is odd");
		
	}

}
