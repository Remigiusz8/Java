package dziedziczenie;
public class Wpis2 extends Wpis{

	Wpis2(String p1, String p2, String p3, String p4, String p5){
		super(p1, p2);
        tel1 = p3;
        tel2 = p4;
        tel3 = p5;
    }
	
    void WypiszDane() {
    	super.WypiszDane();
    	if(tel1 != null || tel2 != null || tel3 != null) {
            System.out.println(tel1);
            System.out.println(tel2);
            System.out.println(tel3);
    	}
    }
    
    void ModyfikujDane(String p1, String p2, String p3, String p4, String p5) {
    	super.ModyfikujDane(p1, p2);
    	tel1 = p3;
    	tel2 = p4;
    	tel3 = p5;
    }
}
