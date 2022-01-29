import java.util.Scanner;
public class areaoftriangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the breath of triangle:");
		double breath=input.nextDouble();
		System.out.println("Enter the height of triangle:");
		double height=input.nextDouble();
		double area=(breath*height)/2;
		System.out.println("The area of triangle is:"+area);
	}

}
