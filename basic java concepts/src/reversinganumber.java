import java.util.Scanner;
public class reversinganumber {
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Input a your number and press enter:");
		 num=input.nextInt();
		while(num!=0)
		{
		    reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reverse of input number is:"+reversenum);
	}

}
