package calculate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int year;
		System.out.print("Doğum yılınızı girin: ");
		year = inp.nextInt();
		 
		switch (year % 12) 
		{
			case 0:
				System.out.println("Çin zodyağına göre burcunuz: " + "Maymun");
				break;
			case 1:
				System.out.println("Çin zodyağına göre burcunuz: " + "Horoz");
				break;
			case 2:
				System.out.println("Çin zodyağına göre burcunuz: " + "Köpek");
				break;
			case 3:
				System.out.println("Çin zodyağına göre burcunuz: " + "Domuz");
				break;
			case 4:
				System.out.println("Çin zodyağına göre burcunuz: " + "Fare");
				break;
			case 5:
				System.out.println("Çin zodyağına göre burcunuz: " + "Öküz");
				break;
			case 6:
				System.out.println("Çin zodyağına göre burcunuz: " + "Kaplan");
				break;
			case 7:
				System.out.println("Çin zodyağına göre burcunuz: " + "Tavşan");
				break;
			case 8:
				System.out.println("Çin zodyağına göre burcunuz: " + "Ejderha");
				break;
			case 9:
				System.out.println("Çin zodyağına göre burcunuz: " + "Yılan");
				break;
			case 10:
				System.out.println("Çin zodyağına göre burcunuz: " + "At");
				break;
			case 11:
				System.out.println("Çin zodyağına göre burcunuz: " + "Koyun");
				break;
			
		}

	}

}
