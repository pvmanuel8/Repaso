package Ejercicio4.src;

public class Coche{
    private String marca;
    private String modelo;
    private float precio;

    //Constructor
    public Coche(String marca, String modelo, float precio){
        this.marca =marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    /**
     * Getter and setters
     * @return
     */
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public float getPrecio() {
            return precio;
        }
    
        public void setPrecio(float precio) {
            this.precio = precio;
    }

    public String mostarDatos(){
        return "Marca :" +marca+ "\nModelo: "+ modelo + "\nPrecio: "+precio+"\n";
    }
}

