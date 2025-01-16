package Ejercicio2;
public class Tablero {
    //atributos
    private int x;
    private int y;

    //Constructor

    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int incremento){
        y += incremento;    //si el usuario se quiere mover arriba se
                            //suma la posicion mas incremento
    }

    public void moverAbajo(int incremento){
        y -= incremento;
    }

    public void moverDerecha(int incremento){
        x += incremento;
    }

    public void moverIzquierda(int incremento){
        x -= incremento;
    }

    //Obtener cordenada actual
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
