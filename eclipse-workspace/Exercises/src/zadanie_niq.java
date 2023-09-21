import java.util.Scanner;

public class zadanie_niq {
	public static void main(String[] args) {
		int n1, n2;
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz pierwsz¹ cyfrê");
		n1 = s.nextInt();
		System.out.println("Wprowadz drug¹ cyfrê");
		n2 = s.nextInt();

		if (n1 > n2) {
			int i = n1;
			while (i >= n2) {
				System.out.print(i);
				i--;
			}
		} else {
			int i = n1;
			while (i <= n2) {
				System.out.print(i);
				i++;
			}
		}

	}

}
