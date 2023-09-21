package com.dpt.projekt;

public class PhoneBook {
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
    
    void dodajTelefon(int index, String tel1, String tel2, String tel3) {
        if(wpisy[index] != null) {
            wpisy[index].DodajTelefon(tel1, tel2, tel3);
        }
    }
    
    void wypiszWpis(int index) {
        if(wpisy[index] != null) {
            System.out.println("===== Wpis nr. " + index + " =====");
            wpisy[index].WypiszDane();
        }else {
            System.out.println("Brak wpisu, o tym indexie");
        }
    }

    void wypiszWpisy() {
        for(int i = 0; i < wpisy.length; i++) {
            if(wpisy[i] != null && wpisy[i].wpis != false) {
                System.out.println("===== Wpis nr. " + i + " =====");
                wpisy[i].WypiszDane();

            }
        }
    }
}