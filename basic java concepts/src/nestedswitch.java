
public class nestedswitch {
	public static void main(String[] args) {
		int tech=2;
		int course=1;
		switch(tech) {
		case 1:{
			System.out.println("python");
			break;
		
		}
		case 2:{
			switch(course){
			case 1:{
				System.out.println("java begenning level");
				break;
			}
			case 2:{
				System.out.println("java advance level");
				break;
				
			}
			}
		}
		}
	}

}
