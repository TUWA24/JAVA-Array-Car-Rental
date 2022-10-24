
import java.util.Scanner;


public class MAIN extends CARS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MAIN nr = new MAIN ();
		nr.details();
		char string_input;
		String name, ch;
		int indicator, id, bday;
		
		loop:
		while(true) {
			System.out.println("Would you like to rent a car? Y/N");
			string_input = sc.next().charAt(0);
		
			if (string_input == 'Y' || string_input == 'y') {
				System.out.print("Please input name: ");
				name = sc.next();
				System.out.print("Please input birthday(MM/DD/YY): ");
				bday = sc.nextInt();
				System.out.print("Please input license ID: ");
				id = sc.nextInt();
				System.out.println();
				
				System.out.println("Please choose car to rent (1 -4) \n");
				nr.details();
				System.out.print("Input choice (1-4): ");
				indicator = sc.nextInt();
				System.out.println("Car rented: " + nr.cars[indicator][0]);
				ch = "   Unavailable ";
				nr.cars[indicator][2] = ch;
				nr.cars[indicator][3] = ("  " + name);
				nr.details();
				System.out.println("Thank you for renting with us." );
				break;
			}
			else if (string_input == 'N' || string_input == 'n') {
				System.out.println("Goodbye");
				break loop;
			}
			else {
				System.out.println("Wrong input");
				continue loop;
			}
		
		}
	}

}