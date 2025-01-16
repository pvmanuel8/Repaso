package Ejercicio2;
import java.util.Scanner;

public class Peon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tablero t1; //Inicializamos el objeto
        int x, y, opcion, incremento = 0;

        System.out.println("Digita la cordenada inicial de X: ");
        x = sc.nextInt();

        System.out.println("Digita la cordenada inicial de Y: ");
        y = sc.nextInt();

        //Posicion inicial del objeto
        
        t1 = new Tablero(x, y);

        do {
            System.out.println("Menu: ");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia DERECHA");
            System.out.println("4. Mover hacia IZQUIERDA");
            System.out.println("5. Salir");
            System.out.println("Digite la opcion del menu: ");
            opcion = sc.nextInt();

            if (opcion != 5) {
                System.out.println("Digite la cantidad de espacios a moverse: ");
                incremento = sc.nextInt();
            }

            switch (opcion) {
                case 1: t1.moverArriba(incremento);break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento);break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5 : break;
                default:
                    System.out.println("ERROR, se equivoca de parametro");
                    break;
            }
              // Mostrar la posición actual del objeto t1
            System.out.println("Posicion Actual:" +t1.getX()+", "+t1.getY());
        } while (opcion != 5);
        sc.close();
    }
}
