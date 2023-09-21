package com.dpt.projekt;

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    	PhoneBook pb = new PhoneBook();
    	Scanner s = new Scanner(System.in);
    	
    	boolean exit = false;
		System.out.print("cześć");
    	while(!exit) {
    		System.out.println("Wybierz akcje: ");
    		System.out.println("1. Wyswietl wszystkie wartosci");
    		System.out.println("2. Wyswietl wybrany wartosc");
    		System.out.println("3. Popraw wartosc");
    		System.out.println("4. Usun wartosc");
    		System.out.println("5. Dodaj wartosc z telefonem");
    		System.out.println("6. Dodaj wartosc bez telefonu");
    		System.out.println("7. Dodaj telefon do wpisu bez telefonu"); 
    		System.out.println("8. Zapisz ksiazke"); 
    		System.out.println("9. Zakoncz program");
			System.out.println("10. Zapisz do pliku");
    		int wybor = s.nextInt();
    		int index;
    		switch(wybor) {
			case 1:
    			pb.wypiszWpisy();
    			break;
    		case 2:
    			System.out.println("Podaj index wpisu, ktory chcesz wyswietlic");
    			index = s.nextInt();
    			
    			pb.wypiszWpis(index);
    			break;
			case 3:
    			System.out.println("Podaj index wpisu, ktory chcesz zmodyfikowac");
    			index = s.nextInt();
    			System.out.println("Podaj nowa nazwe");
    			String nowa_nazwa = s.next();
    			System.out.println("Podaj nowe miejsce");
    			String nowa_miejsce = s.next();
    			System.out.println("Podaj nowe telefon 1");
    			String nowy_tel1 = s.next();
    			System.out.println("Podaj nowe telefon 2");
    			String nowy_tel2 = s.next();
    			System.out.println("Podaj nowe telefon 3");
    			String nowy_tel3 = s.next();
    			
    			pb.zmodyfikujWpisTel(index, nowa_nazwa, nowa_miejsce, nowy_tel1, nowy_tel2, nowy_tel3);
    			break;
    		case 4:
    			System.out.println("Podaj index wpisu, ktory chcesz usunac");
   			 	index = s.nextInt();
   			 	
   			 	pb.usunWpis(index);
   			 	break;
    		case 5:
    			System.out.println("Podaj nowa nazwe");
    			String nazwa = s.next();
    			System.out.println("Podaj nowe miejsce");
    			String miejsce = s.next();
    			System.out.println("Podaj nowe telefon 1");
    			String tel1 = s.next();
    			System.out.println("Podaj nowe telefon 2");
    			String tel2 = s.next();
    			System.out.println("Podaj nowe telefon 3");
    			String tel3 = s.next();
    			
    			Wpis2 nowy_wpis = new Wpis2(nazwa, miejsce, tel1, tel2, tel3);
    			pb.dodajWpis(nowy_wpis);
    			break;
    		case 6:
    			System.out.println("Podaj nowa nazwe");
    			String nazwa2 = s.next();
    			System.out.println("Podaj nowe miejsce");
    			String miejsce2 = s.next();
    			
    			Wpis2 nowy_wpis2 = new Wpis2(nazwa2, miejsce2);
    			pb.dodajWpis(nowy_wpis2);
    			break;
    		case 7:
    			System.out.println("Podaj index wpisu bez telefonu");
    			index = s.nextInt();
    			
    			System.out.println("Podaj telefon 1");
    			tel1 = s.next();
    			System.out.println("Podaj telefon 2");
    			tel2 = s.next();
    			System.out.println("Podaj telefon 3");
    			tel3 = s.next();
    			
    			pb.dodajTelefon(index, tel1, tel2, tel3);
    			break;
    		case 8:
    			System.out.println("nie zrobione");
    			break;
    		case 9:
    			System.out.println("EXIT");
    			exit = true;
    			break;
			case 10:
				Info info1 = new Info();
				info1.zapiszDoPliku();
				break;
    		default:
    			System.out.println("Blad, wprowadz wartosc ponownie");
    		}
    			
    	}
    }
    
}