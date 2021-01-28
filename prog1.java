import java.util.Scanner;
class hello {
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);

		System.out.println("Program to print Sum of two number\n");
		
		System.out.println("Enter 'a' value : ");
		int a = kb.nextInt();

		System.out.println("Enter 'b' value : ");
		int b = kb.nextInt();

		int s = a+b;

		System.out.println("Sum of "+a+" and "+b+" is "+s);
	}
}
