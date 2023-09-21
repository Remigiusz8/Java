package dziedziczenie;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PhoneBook {
	
	Scanner s;
	String plikSystemowy;
	
	Wpis2[] wpisy = new Wpis2[30]; // dlugosc ksiazki telefonicznej
    
    void dodajWpis(Wpis2 w) {
        for(int i = 0; i < wpisy.length; i++) {
            if(wpisy[i] == null || wpisy[i].wpis == false) {
                wpisy[i] = w;
                break;
            }
        }
    }
    
    void usunWpis(int index) {
        if(wpisy[index] != null) {
            wpisy[index] = null;
        }
    }
    
    void zmodyfikujWpisTel(int index, String nazwa, String miejsce, String tel1, String tel2, String tel3) {
        if(wpisy[index] != null) {
            wpisy[index].ModyfikujDane(nazwa, miejsce, tel1, tel2, tel3);
        }
    }
    
    void wypiszWpis(int index) {
        if(wpisy[index] != null) {
            System.out.println("===== Wpis nr. " + (index+1) + " =====");
            wpisy[index].WypiszDane();
        }else {
            System.out.println("Brak wpisu, o tym indexie");
        }
    }

    void wypiszWpisy() {
        for(int i = 0; i < wpisy.length; i++) {
            if(wpisy[i] != null && wpisy[i].wpis != false) {
                System.out.println("===== Wpis nr. " + (i+1) + " =====");
                wpisy[i].WypiszDane();

            }
        }
    }
    
    int zapis() {    	 
    	File file = new File (plikSystemowy);
         if (file.exists()) {
        	 System.out.println("Plik istnieje");
         } else {
        	 System.out.println("Plik nie istnieje. Tworzê nowy...");
         }
         PrintWriter pw;
         try {
        	 pw = new PrintWriter(file);
         for (int i= 0; i<30;i++) {
        	 if (wpisy[i] != null && wpisy[i].wpis != false) {
        		 pw.println(wpisy[i].nazwa);
        		 pw.println(wpisy[i].miejsce);
        		 pw.println(wpisy[i].tel1);
        		 pw.println(wpisy[i].tel2);
        		 pw.println(wpisy[i].tel3);
        	 }
         }
         pw.close();
         }
         catch (IOException e) {
             return -1;
         }
         	 return 0;
    }
    
    int odczyt() {
    	System.out.println("Odczytaæ plik 1.systemowy czy 2.wybrany?");
    	s = new Scanner(System.in);
    	byte wybor = s.nextByte();
    	
    	if (wybor == 1) {
    		plikSystemowy = "sufit.txt";
    	} else if (wybor == 2) {
    		System.out.println("Wprowadz nazwe swojego pliku");
    		plikSystemowy = s.next();
    	} else {
    		plikSystemowy = "sufit.txt";
    	}
    	File file = new File(plikSystemowy);
    	if (!file.exists()) {
    		return -1;
    	} 
    	System.out.println("plik znaleziono -> " + plikSystemowy);
    	try {
    		System.out.println("Liczba wpisow -> " + (Files.lines(Paths.get(plikSystemowy)).count() / 5));
    		s = new Scanner (file);
    		while (s.hasNextLine()) {
        		Wpis2 nowy_wpis = new Wpis2(s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine());
    			dodajWpis(nowy_wpis);
    			Wpis.iloscWpisow++;
        	}
    	} catch (Exception ignored) {	
    		return -1;
    	} 
    	s.close();
    	return 0;
    }
}
