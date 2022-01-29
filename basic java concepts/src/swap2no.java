
public class swap2no {
	public static void main(String[] args) {
		float a=00000001f,b=10000000f;
		System.out.println("----Before Swap----");
		System.out.println("a is"+a);
		System.out.println("b is"+b);
		float temporary=a;
		a=b;
		b=temporary;
		System.out.println("----After Swap----");
		System.out.println("a is"+a);
		System.out.println("b is"+b);
}

}