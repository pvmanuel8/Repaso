package Ejercicio3;

import java.util.Scanner;

/*Crea una instancia de Persona,
    imprime sus datos, haz que cumpla años y vuelve a mostrar los datos. */
public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    //Constructor
    public Persona(){
        this.nombre =""; //String vacio
        this.edad = 0;
        this.altura =0;
    }

    public Persona(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //Metodos
    public void cumplirAños(){
        this.edad++;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //solicitamos los datos
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese la altura: ");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre, edad, altura);
        p1.mostrarDatos();
        p1.cumplirAños();
        p1.mostrarDatos();

        sc.close();
    }
}
