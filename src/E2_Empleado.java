import java.util.Scanner;

public class E2_Empleado {
    String nombre;
    String cargo;
    double salario;
    String ingreso;

    public E2_Empleado(String nombre, String cargo, double salario, String ingreso){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.ingreso = ingreso;
    }

    void mostrar_info(){
        System.out.println("Empleado: "+nombre+"   Cargo: "+cargo+
                "\nSalario: "+salario+"   Fecha de ingreso: "+ingreso+"\n");
    }

    public static void main(String[]args){
        Scanner detalles = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado 1: ");
        String nombre1 = detalles.nextLine();
        System.out.println("Ingrese su cargo: ");
        String cargo1 = detalles.nextLine();
        System.out.println("Ingrese su salario: ");
        double salario1 = detalles.nextDouble();
        detalles.nextLine();
        System.out.println("Ingrese su fecha de ingreso (dd/mm/aa): ");
        String fechain1 = detalles.nextLine();
        E2_Empleado empleado1 = new E2_Empleado(nombre1,cargo1,salario1,fechain1);
        System.out.println("Ingrese el nombre del empleado 2: ");
        String nombre2 = detalles.nextLine();
        System.out.println("Ingrese su cargo: ");
        String cargo2 = detalles.nextLine();
        System.out.println("Ingrese su salario: ");
        double salario2 = detalles.nextDouble();
        detalles.nextLine();
        System.out.println("Ingrese su fecha de ingreso (dd/mm/aa): ");
        String fechain2 = detalles.nextLine();
        E2_Empleado empleado2 = new E2_Empleado(nombre2,cargo2,salario2,fechain2);
        System.out.println("Ingrese el nombre del empleado 3: ");
        String nombre3 = detalles.nextLine();
        System.out.println("Ingrese su cargo: ");
        String cargo3 = detalles.nextLine();
        System.out.println("Ingrese su salario: ");
        double salario3 = detalles.nextDouble();
        detalles.nextLine();
        System.out.println("Ingrese su fecha de ingreso (dd/mm/aa): ");
        String fechain3 = detalles.nextLine();
        E2_Empleado empleado3 = new E2_Empleado(nombre3,cargo3,salario3,fechain3);

        empleado1.mostrar_info();
        empleado2.mostrar_info();
        empleado3.mostrar_info();
    }

}
