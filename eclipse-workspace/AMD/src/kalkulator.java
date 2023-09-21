import java.util.Scanner;
public class kalkulator {
	public static void main (String args[]) {
	int d;
	int a;
	int b;
	Scanner odczyt = new Scanner(System.in);
	System.out.println("Wpisz wartosci, 0 - dodawanie, 1 - odejmowanie, 2 - mno¿enie, 3 - dzielenie");
	d= odczyt.nextInt();
	System.out.println("Wpisz liczbe 1");
	a= odczyt.nextInt();
	System.out.println("Wpisz liczbe 2");
	b= odczyt.nextInt();
	switch(d) {
	case 0: System.out.println(a+=b);
	break;
	case 1: System.out.println(a-=b);
	break;
	case 2: System.out.println(a*b);
	break;
	case 3: System.out.println(a/b);
	break;
	default: System.out.println("Wprowadzona liczba jest spoza zakresu");
	
	}
}
}