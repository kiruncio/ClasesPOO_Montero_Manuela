import java.util.Scanner;

public class If_con_equalsScanner {
    public static void main(String[] args){
        Scanner password = new Scanner(System.in);
        String contrasenia = "kitipro36";
        String contrasenia_2 = " ";

        System.out.println("Bienvenido a Happy Place");
        System.out.println("Ingrese su contraseña de usuario: ");
        contrasenia_2 = password.nextLine();

        if(contrasenia.equals(contrasenia_2)){
            System.out.println("Iniciando sesión...");
        }else{
            System.out.println("Clave incorrecta. Ingreso denegado.");
        }

    }
}
