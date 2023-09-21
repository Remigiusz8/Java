import java.util.Scanner;

public class zadanie5 {
	public static void main(String[] args) {
		int n1;
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe");
		n1 = s.nextInt();

		int x = 1;
		for (int i = 1; i <= n1; i++) {
			x *= i;
		}
		System.out.println(x);

	}

}
