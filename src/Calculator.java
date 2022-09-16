import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter 1 for +,2 for -,3 for * and 4 for /");
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		System.out.println("Enter the operation(1,2,3 or 4):");
		int op=sc.nextInt();
		System.out.println("Enter the second number:");
		float b=sc.nextFloat();
		switch(op) {
		case 1:
			float res=a+b;
			System.out.println("Your answer is:" +res);
			break;
		case 2:
			float res2=a-b;
			System.out.println("Your answer is:" +res2);
			break;
		case 3:
			float res3=a*b;
			System.out.println("Your answer is:" +res3);
			break;
		case 4:
			float res4=a/b;
			System.out.println("Your answer is:" +res4);
			break;
		}
		
	}

}
