import java.util.Scanner;

public class App {

    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numeroAtlteta, n_atletas, indiceatletaganador;
        float tiempoCarrera;

        System.out.println("Digita el numero de atletas: ");
        n_atletas = sc.nextInt();

        //Crear objeto para cada atleta
        Atleta atletas[] = new Atleta[n_atletas];

        for (int i = 0; i < atletas.length; i++) {
            System.out.println("\nDigite los datos del atleta"+(i+1)+": ");
            System.out.println("Introduzca el numero del atleta: ");
            numeroAtlteta = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca el nombre del atleta: ");
            nombre = sc.nextLine();
            System.out.println("Introduzca el tiempo:");
            tiempoCarrera = sc.nextFloat();

            atletas[i] = new Atleta(numeroAtlteta, nombre, tiempoCarrera);
        }
        indiceatletaganador = indiceGanador(atletas);
        System.out.println("El atleta ganador es: ");
        System.out.println(atletas[indiceatletaganador].mostrarDatosGanador());
    }
}
