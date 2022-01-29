import java.util.Scanner;

public class largestnumber {
	public static void main(String[] args) {
		double n1,n2,n3;
		System.out.println("enter the first number");
		Scanner firstno=new Scanner(System.in);
		n1=firstno.nextDouble();
		System.out.println("enter the second number");
		Scanner secondno=new Scanner(System.in);
		n2=secondno.nextDouble();
		System.out.println("enter the third number");
		Scanner thirdno=new Scanner(System.in);
		n3=thirdno.nextDouble();
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+"is the largest number...");
		else if (n2>=n1 && n2>=n3)
			System.out.println(n2+"is the largest number...");
		else
			System.out.println(n3+"is the largest number...");
		
				
	}
    	

}
