import java.util.Scanner;

public class Stringequals {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        String a = "";
        String b = " ";

        System.out.println("Ingrese una cadena de texto: ");
        a = palabras.nextLine();
        System.out.println("Ingrese otra cadena de texto: ");
        b = palabras.nextLine();
        System.out.println(a.equals(b));
    }
}