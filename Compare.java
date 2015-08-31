import java.util.Scanner;

public class Compare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int number1 = sc.nextInt();

		System.out.println("Type a number: ");
		int number2 = sc.nextInt();

		System.out.println("Your numbers are " + a +  " and " + b + "\n\n\n");

		if(number1 == number2){
			System.out.println(" You typed the same number twice!");
		}else if( number1 < number2 ){
			System.out.println("Your first number is shorter: " + number1 + " < " + number2);

		}else{
			System.out.println(" your second number is shorter: " + number2 + " < " + number1 + "\n\n\n");
		}

	}
}