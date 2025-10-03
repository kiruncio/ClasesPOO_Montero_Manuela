import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Scanner multi = new Scanner(System.in);
        int num = 0;

        System.out.println("***Calculadora de tablas de multiplicar***");
        System.out.println("Ingrese un número entero: ");
        num = multi.nextInt();

        System.out.println("Resultado");
        for (int i=1; i<num+1; i++){
            int resultado = num*i;
            System.out.println("Número "+num+"x"+i+" = "+resultado);
        }

    }
}
