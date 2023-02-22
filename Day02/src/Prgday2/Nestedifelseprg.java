package Prgday2;

public class Nestedifelseprg {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if (a<b) {
			if ((a<b)&&(a<c))
				System.out.println("a is lesser");
			else
				System.out.println("b and is lesser");
			
		}
		else {
			System.out.println("b and c is lesser than a");
		}

	}

}
