package lab06;
import java.util.Scanner;
public class Modules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStars();
		SumNumbers();
		printStars();
		int result=multiply();
		System.out.println("multiplication of two numbers is:: "+result);
		printStars();
		int num1;
		int num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num1=sc.nextInt();
		printStars();
		System.out.println("Enter another number");
		num2=sc.nextInt();
		double div=division(num1,num2);
		System.out.println("division of two numbers is:: "+div);
	}
	
	//with no return value and no parameters
	public static void SumNumbers() {
		int num1;
		int num2;
		int sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num1=sc.nextInt();
		printStars();
		System.out.println("Enter another number");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The sum is:: "+sum);
	}

	public static void printStars() {
		for(int i=0;i<100;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//with return value but no parameters
	public static int multiply() {
		int num1;
		int num2;
		int multi;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num1=sc.nextInt();
		printStars();
		System.out.println("Enter another number");
		num2=sc.nextInt();
		multi=num1*num2;
		return multi;
	}
	//with return value and with parameters
	public static double division(int num1, int num2) {
		double div;
		div=num1/num2;
		return div;
	}
}
