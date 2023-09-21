import java.util.Scanner;

public class zadanie3 {
	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe pierwsz¹");
		n1 = s.nextInt();
		System.out.println("Wprowadz liczbe drug¹");
		n2 = s.nextInt();

		if (n1 < n2) {
			int i = n1;
			while (i <= n2) {
				System.out.print(i + ", ");
				i++;
			}
		} else {
			int i = n1;
			while (i >= n2) {
				System.out.print(i + ", ");
				i--;
			}
		}
		System.out.println("");
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++)
				System.out.print(i + ", ");
		} else {
			for (int i = n1; i >= n2; i--)
				System.out.print(i + ", ");
		}

		System.out.println("");
		if (n1 < n2) {
			int i = n1;
			do {
				System.out.print(i + ", ");
				i++;
			} while (i <= n2);

		} else {
			int i = n1;
			do {
				System.out.print(i + ", ");
				i--;

			} while (i >= n2);
		}
	}
}
