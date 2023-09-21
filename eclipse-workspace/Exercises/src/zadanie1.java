import java.util.Scanner;

public class zadanie1 {
	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbê");
		x = s.nextInt();

		if (x > 10 || x < -10) {
			System.out.println("Liczba nie spe³nia wymogów");
		} else {
			System.out.println("Liczba mieœci siê w przedziale <-10;10>");
		}
	}
}
