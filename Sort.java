import java.util.Scanner;

public class Sort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me one number: ");
		int number1 = sc.nextInt();
		System.out.println("Give me another one: ");
		int number2 = sc.nextInt();
		System.out.println("The last one please: ");
		int number3 = sc.nextInt();

		if( number1 > number2  && number2 > number3){
			System.out.println( number1 + " >" + number2 + " >" + number3);

		}else if( number1 > number3 && number3 > number2){
			System.out.println( number1 + " >" + number3 + " >" + number2);

		}else if ( number2 > number1 && number1 > number3){
			System.out.println(number2 + " >" + number1 + " >" + number3);

		}else if( number2 > number3 && number3 > number1){
			System.out.println( number2 + " >" + number3 + " >" + number1);

		}else if( number3 > number1 && number1 > number2){
			System.out.println( number3 + " >" + number1 + " >" + number2);

		}else if(c > number2 && number2 > number1){
			System.out.println( number3 + " >" + number2 + " >" + number1);
		}

	}
}