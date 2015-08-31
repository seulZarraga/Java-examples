import java.util.Scanner;

public class Switch{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String months;
		System.out.println(" Type the number of a month: ");
		int number = scanner.nextInt();

		switch (number) {
			case 1: months = "The month that you selected was January";
				break;
			case 2: months = "The month that you selected was February";
				break;
			case 3: months = "The month that you selected was March";
				break;
			case 4: months = "The month that you selected was April";
				break;
			case 5: months = "The month that you selected was May";
				break;
			case 6: months = "The month that you selected was June";
				break;
			case 7: months = "The month that you selected was July";
				break;
			case 8: months = "The month that you selected was August";
				break;
			case 9: months = "The month that you selected was September";
				break;
			case 10: months = "The month that you selected was October";
				break;
			case 11: months = "The month that you selected was November";
				break;
			case 12: months = "The month that you selected was December";
				break;
			
			default: months = "Don't be stupid, there is no month with that number!";
				break;

		}
		System.out.println(months);

	}

}