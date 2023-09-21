package zapis;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Info info1 = new Info();
        try {
        	info1.zapiszDoPliku();
        }
        catch  (Exception ignored) {
        }
    }
}