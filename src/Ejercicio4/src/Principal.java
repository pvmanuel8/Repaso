package Ejercicio4.src;

import java.util.Scanner;

public class Principal {

    public static int indiceCocheBarato(Coche coches[]){
            float precio;
            int indice = 0;

            precio = coches[0].getPrecio();
            for (int i = 1; i < coches.length; i++) {
                if (coches[i].getPrecio() < precio) {
                    precio = coches[i].getPrecio();
                    indice = i;
                }
            }
            return indice;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int n_vehiculos, indiceBarato;

        System.out.println("Cuantos coches hay?");
        n_vehiculos = sc.nextInt();

        //Creamos los objetos para los coches
        Coche coches[] = new Coche[n_vehiculos];

        for(int i = 0; i < coches.length; i++ ){
            sc.nextLine();
            System.out.println("Digita las caracteristicas del Coche "+(i+1)); //sumamos 1 para que em piece en 1
            System.out.println("Introduce marca: ");
            marca = sc.nextLine();
            System.out.println("Introduce el modelo: ");
            modelo = sc.nextLine();
            System.out.println("Introduce el precio: ");
            precio = sc.nextFloat();

            coches[i] = new Coche(marca, modelo, precio);
        }
        sc.nextLine();
        indiceBarato = indiceCocheBarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostarDatos());

    }
}
