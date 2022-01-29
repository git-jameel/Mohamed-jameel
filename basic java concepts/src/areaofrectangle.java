import java.util.Scanner;
public class areaofrectangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		double length=input.nextDouble();
		System.out.println("Enter the width of rectangle:");
		double width=input.nextDouble();
		double area=length*width;
		System.out.println("The area of rectangle is:"+area);
	}

}
