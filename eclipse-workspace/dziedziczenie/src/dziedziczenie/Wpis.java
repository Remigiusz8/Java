package dziedziczenie;
import java.util.Scanner;
public class Wpis{
    static int iloscWpisow = 0;
	
	String nazwa;
    String miejsce;
    String tel1;
    String tel2;
    String tel3;
    boolean wpis;

    Wpis(){
        nazwa = "";
        miejsce = "";
        wpis = false;
    } 
    Wpis(String p1, String p2){
        nazwa = p1;
        miejsce = p2;
        wpis = true;
    }
    
    void WypiszDane() {
        System.out.println(nazwa);
        System.out.println(miejsce);
    }
    
    void ModyfikujDane(String p1, String p2) {
        nazwa = p1;
        miejsce = p2;
    }

}