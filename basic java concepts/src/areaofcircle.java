import java.util.Scanner;
public class areaofcircle {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double radius=input.nextDouble();
		double area=Math.PI*2*(radius*radius);
		System.out.println("the area of circle is:"+area);
	}
	

}






