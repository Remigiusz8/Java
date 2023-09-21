package zapis;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Info {
    String Imie, Nazwisko, Miejscowosc;
    int telefon;

    public Info() 
    {
        System.out.print("Wprowadz imie: ");
        Scanner sc = new Scanner (System.in);
        Imie = sc.nextLine();

        System.out.print("Wprowadz nazwisko: ");
        Scanner sc1 = new Scanner (System.in);
        Nazwisko = sc1.nextLine();

        System.out.print("Wprowadz miejscowosc: ");
        Scanner sc2 = new Scanner (System.in);
        Miejscowosc = sc2.nextLine();

        System.out.print("Wprowadz numer telefonu: ");
        Scanner sc3 = new Scanner (System.in);
        telefon = sc3.nextInt();

        System.out.println(this.Imie + " " + this.Nazwisko + " " + this.Miejscowosc + " " + this.telefon);
    }
    void zapiszDoPliku() throws Exception {
        File file = new File ("sufit.txt");
        file.createNewFile();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter (file));
            bw.write(Imie);
            bw.newLine();
            bw.write(Nazwisko);
            bw.newLine();
            bw.write(Miejscowosc);
            bw.newLine();
            bw.write(String.valueOf(telefon));
            bw.newLine();
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}