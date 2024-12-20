 import java.util.Scanner;
public class Greatthree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		System.out.println("enter the sec number");
		System.out.println("enter the third number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("number oone is greater"+num1);
		}else if(num2>num3) {
			System.out.println("number two is greater"+num2);
			
		}
		else if(num3>num1) {
			System.out.println("number  3 is greater"+num3);
			
			
		}
		else {
			System.out.println("check your options");
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
