import java.util.Scanner;

public class Ciclos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type anumber of a month: ");
		int number  = sc.nextInt();

		if( number == 1) {
				System.out.println("The month that you selected was January");
		} else if( number == 2 ) {
				System.out.println("The month that you selected was February");
		} 
		else if( number == 3 ) {
				System.out.println("The month that you selected was March");
		} 
		else if( number == 4 ) {
				System.out.println("The month that you selected was April");
		} 
		else if( number == 4 ) {
				System.out.println("The month that you selected was May");
		} 
		else if( number == 6 ) {
				System.out.println("The month that you selected was June");
		} 
		else if( number == 7 ) {
				System.out.println("The month that you selected was July");
		} 
		else if( number == 8 ) {
				System.out.println("The month that you selected was August");
		} 
		else if( number == 9 ) {
				System.out.println("The month that you selected was September");
		} 
		else if( number == 10 ) {
				System.out.println("The month that you selected was October");
		} 
		else if( number == 11 ) {
				System.out.println("The month that you selected was November");
		} 
		else if( number == 12 ) {
				System.out.println("The month that you selected was December");
				} 

		else{
			System.out.println("Don't be stupid, there is no month with that number!");
		}	
	}
}