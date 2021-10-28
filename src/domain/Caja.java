package domain;

/**
 *
 * @author josez
 */
public class Caja {
   //Atributos
    private double saldo;
    private int extracciones;
    private final int limite;
    
    //Constructor vacio
    public Caja(){
        this.saldo = 0;
        this.extracciones = 0;
        this.limite = 10;
    }
    
    //Metodos por defecto

    /*private double getSaldo() {
        return saldo;
    }*/

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Caja{" + "saldo=" + saldo + '}';
    }
    
    //Metodos propios para el uso
    //Deposito
    public void deposito(double dinero){
        setSaldo(this.saldo += dinero);
    }
    
    //Extraccion
    public void extraccion(double dinero){
        if(this.saldo >= dinero && extracciones <= limite){
            extracciones++;
            setSaldo(this.saldo - dinero);
        }
    }
    
    //Consulta de Saldo
    public String consultaSaldo(){
        return "Saldo disponible:" + this.saldo;
    }
    
    //Consulta de extracciones
    public String consultaExtracciones(){
        return "La cantidad de extracciones realizadas son:" + this.extracciones;
    }
}
