import java.util.Scanner;

public class zadanie2 {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Wpisz liczbê od 1 do 7 a wyskoczy dzieñ tygodnia");
		a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println("Poniedzia³ek");
			break;
		case 2:
			System.out.println("Wtorek");
			break;
		case 3:
			System.out.println("Sroda");
			break;
		case 4:
			System.out.println("Czwartek");
			break;
		case 5:
			System.out.println("Pi¹tek");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Niedziela");
			break;
		default:
			System.out.println("Podana liczba jest spoza zakresu");
		}
	}

}
