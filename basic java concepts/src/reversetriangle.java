
public class reversetriangle {
	public static void main(String[] args) {
		
	int term=50;
	
	for(int i=1;i<=term;i++)
	{
		for(int j=term;j>=i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

