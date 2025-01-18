/*Crea una clase CuentaBancaria con los siguientes atributos:

numeroCuenta (String)
saldo (double)
Y métodos:

Constructor para inicializar el número de cuenta y saldo.
Método ingresar(double cantidad) que añade dinero a la cuenta.
Método retirar(double cantidad) que retira dinero (sin permitir saldo negativo).
Método consultarSaldo() que imprime el saldo actual.
Tarea:

Crea una cuenta bancaria, realiza ingresos y retiros, y consulta el saldo en cada paso. */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    //Constructor
    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Getters y Setters
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("No se permiten saldos negativos");
            
        }
    }

    //Metodos
    public void ingresar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han ingresado " +saldo+ " euros");
        }else{
            System.out.println("La cantidad a ingresar debe de ser superior a 0 euros");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Se ha retirado "+cantidad);
        }else if (cantidad > saldo) {
            System.out.println("Dinero insuficiente");
        }else{
            System.out.println("La cantidad a retirar debe ser superior a 0 euros");
        }
    }

    public void consultarSaldo(){
        System.out.println("El saldo actual de la cuenta "+numeroCuenta+ " es: "+saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("12156548", 50);

        //Consultar saldo inicialç
        cuenta1.consultarSaldo();

        //ingresar dinero
        cuenta1.ingresar(3500);

        //retirar dinero
        cuenta1.retirar(69);

        //consultar dinero
        cuenta1.consultarSaldo();

        //retirar mas del dispponible
        cuenta1.retirar(8000);

        //consultar
        cuenta1.consultarSaldo();
    }
}
