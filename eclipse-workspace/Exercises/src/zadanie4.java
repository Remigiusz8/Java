import java.util.Scanner;

public class zadanie4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz pierwsz¹ cyfrê");
		int x, y;
		int wynik = 1;
		x = s.nextInt();
		System.out.println("Wprowadz drug¹ cyfrê");
		y = s.nextInt();

		if (x < y) {
			for (int i = x; i <= y; i++)
				wynik *= i;
			System.out.print(wynik);
		} else {
			for (int i = x; i >= y; i--)
				wynik *= i;
			System.out.print(wynik);
		}
	}

}
