import java.util.Scanner;

public class E1_Jugador {
    String nombre;
    String posicion;
    int edad;
    int ncamiseta;
    //metodo constructor
    public E1_Jugador(String nombre, String posicion, int edad, int ncamiseta){
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.ncamiseta = ncamiseta;
    }
    //metodo propio
    void saludar(){
        System.out.println("Jugador "+nombre+" de la posición "+posicion+
                "\nEdad: "+edad+"   N° de camiseta:"+ncamiseta);
    }

    public static void main(String[]args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre1 = datos.nextLine();
        System.out.println("Ingrese su edad:");
        int edad1 = datos.nextInt();
        System.out.println("Ingrese el n° de su camiseta:");
        int camiseta1 = datos.nextInt();
        datos.nextLine();
        E1_Jugador jugador1 = new E1_Jugador(nombre1, "delantero",edad1, camiseta1);
        System.out.println("Ingrese su nombre:");
        String nombre2 = datos.nextLine();
        System.out.println("Ingrese su edad:");
        int edad2 = datos.nextInt();
        System.out.println("Ingrese el n° de su camiseta:");
        int camiseta2 = datos.nextInt();
        datos.nextLine();
        E1_Jugador jugador2 = new E1_Jugador(nombre2, "defensa",edad2, camiseta2);
        System.out.println("Ingrese su nombre:");
        String nombre3 = datos.nextLine();
        System.out.println("Ingrese su edad:");
        int edad3 = datos.nextInt();
        System.out.println("Ingrese el n° de su camiseta:");
        int camiseta3 = datos.nextInt();
        E1_Jugador jugador3 = new E1_Jugador(nombre3, "medio campo",edad3, camiseta3);

        jugador1.saludar();
        jugador2.saludar();
        jugador3.saludar();
    }
}
