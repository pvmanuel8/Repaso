public class Coche {
    private String marca, modelo;
    private int velocidad;

    //constructor
    public Coche(){
        this.marca =""; //marca por defecto
        this.modelo =""; //modelo por defecto
        this.velocidad = 0; //velocidad por defecto
    }
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    //metodos
    public void acelerar(int incremento){
        this.velocidad += incremento;
    }


    public void frenar(int decremento){
        this.velocidad -= decremento;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad:" +velocidad);
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("Lamborghini"," Urus");
        c1.mostrarEstado();

        //acelerar
        c1.acelerar(50);
        c1.acelerar(100);

        //mostrar estado
        c1.mostrarEstado();

        //frenar
        c1.frenar(50);
        c1.mostrarEstado();

        //frenar
        c1.frenar(200);
        c1.mostrarEstado();
    }
}
