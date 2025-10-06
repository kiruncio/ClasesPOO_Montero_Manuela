public class Persona {
    String cedula;
    String nombre;
    int edad;
    String correo;

    //metodo constructor: para asignar valores y ejecutar
    //en los paréntesis están los parámetros
    public Persona(String cedula, String nombre, int edad, String correo){
        this.cedula = cedula; //this sirve para que java reconozca cuál es el atributo cuando
        this.nombre = nombre; //el parámetro y el atributo tienen el mismo nombre
        this.edad = edad;
        this.correo = correo;
    }
    //metodo propio -> metodo
    void impresion(){
        System.out.println("Bienvenid@ "+nombre+", tiene "+edad+
                " años con número de cédula "+cedula+" y correo electrónico "+correo);
    }

    //creación del objeto
    public static void main(String[] args){
        Persona objeto1 = new Persona("17105355210","Cristobal",28,"crisyumi@gmail.com");
        objeto1.impresion(); //se llama el método
        Persona objeto2 = new Persona("1714183982","Daniela",15,"chuydani@gmail.com");
        objeto2.impresion();

    }
}