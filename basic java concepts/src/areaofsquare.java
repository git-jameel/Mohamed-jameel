import java.util.Scanner;
public class areaofsquare {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the side of square");
		double side=input.nextDouble();
		double area=side*side;
		System.out.println("The area of square is:"+area);
	}

}
