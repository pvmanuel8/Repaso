public class Atleta {
    private int numeroAtlteta;
    private String nombre;
    private float tiempoCarrera;

    //Constructor
    public Atleta(int numeroAtlteta, String nombre, float tiempoCarrera) {
        this.numeroAtlteta = numeroAtlteta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera(){
        return tiempoCarrera;

    }

    public String mostrarDatosGanador(){
        return "Numero de Atleta: " +numeroAtlteta+ "\nNombre de Atleta: "+nombre+ "\nTiempo: "+tiempoCarrera;
    }
}
