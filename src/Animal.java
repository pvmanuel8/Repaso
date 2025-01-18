/* Crea una clase Animal con los siguientes atributos:

nombre (String)
tipo (String, por ejemplo, "perro", "gato", "ave").
edad (int)
Y métodos:

Constructor para inicializar los atributos.
Método hacerSonido() que imprime un mensaje diferente dependiendo del tipo de animal.
Tarea:

Crea una lista de diferentes animales y llama al método hacerSonido para cada uno.*/
public class Animal {
    private String nombre;
    private String tipo;
    private int edad;

    //Constructores
    public Animal(){
        this.nombre = "";
        this.tipo = "";
        this.edad = 0;
    }

    public Animal(String nombre, String tipo, int edad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = 0;
    }

    //Metodo
    public void hacerSonido(){
        switch (tipo.toLowerCase()) {
            case "perro":
                System.out.println("¡Guau Guau!");
                break;
            case "pajaro":
                System.out.println("¡ Pio Pio");
                break;
            case "gato":
                System.out.println("¡Miauuuuu!");
                break;
            case "oveja":
                System.out.println("¡Beeeeeee!");
            default:
                System.out.println("Este animal no tiene sonido definido");
                break;
        }
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public int getEdad(){
        return edad;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    //metodo main 
    public static void main(String[] args) {
        Animal perro = new Animal("Tobby", "perro", 2);
        Animal gato = new Animal("Mimisiku", "gato", 10);
        Animal pajaro = new Animal("Riku", "pajaro", 25);

        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();
    }
}
