import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner clave = new Scanner(System.in);
        Scanner opciones = new Scanner(System.in);
        String contrasenia = "kitipro36";
        String contrasenia_2 = " ";

        System.out.println("Bienvenid@ a compras Don Gato");

        while (contrasenia.equals(contrasenia_2)==false) {
            System.out.println("Ingrese su contraseña de usuario: ");
            contrasenia_2 = clave.nextLine();

            if (contrasenia.equals(contrasenia_2)) {
                System.out.println("Iniciando sesión...");
                int opcion = 0;

                System.out.println("1. Comprar\n2. Ver detalles de productos\n3. Ver carrito\n4. Añadir queja\n5. Salir");
                System.out.println("Ingrese una opción: ");
                opcion = opciones.nextInt();

                switch (opcion){
                    case 1: System.out.println("Preparando lista de productos..."); break;
                    case 2: System.out.println("Preparando buscador por producto..."); break;
                    case 3: System.out.println("Preparando carrito..."); break;
                    case 4: System.out.println("Abriendo foro..."); break;
                    case 5: System.out.println("Saliendo..."); break;
                    default: System.out.println("Opción inválida");
                }
                break;
            }else{
                System.out.println("Clave incorrecta. Ingreso denegado.");
            }
        }
    }
}
