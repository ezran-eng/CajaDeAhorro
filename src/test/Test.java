package test;
import domain.*;
import java.util.Scanner; //El programa usa la clase Scanner


public class Test {
    
    //Creo objeto caja
    static Caja caja = new Caja();
    static Scanner entrada = new Scanner(System.in);
    //Main
    public static void main(String[] args) {
        
        //Llamada al menu
        menu();
    }
    
    //Elaboracion del menu
    public static void menu(){
        int opc;
        do {
            opc = opcion();
            switch(opc){
                case 1: //Deposito
                    depositar();
                    break;
                
                case 2: //Extraccion
                    extraccion();
                    break;
                
                case 3: //Consulta de Saldo
                    consultarSaldo();
                    break;
                
                case 0: //Salir
                    System.out.println("PROGRAMA CERRADO CON EXITO");
                    break;
                
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opc != 0);
        
    }
    
    private static int opcion(){
        int opc;
        System.out.println("\\" +
"		       -----------------menu--------------------------\\\n" +
"		       | 1 - Depositar                               |\\\n" +
"                       | 2 - Extraer                                 |\\\n" +
"                       | 3 - Consulta de Saldo                       |\\\n" +
"                       | 0 - salir                                   |\\\n" +
"		       -----------------------------------------------\\");
        System.out.print("Ingrese opcion:");
        opc = entrada.nextInt();
        return opc;
    }
    
    public static void depositar(){
        double dinero;
        System.out.print("Ingrese cantidad de dinero a depositar: ");
        dinero = entrada.nextDouble();
        caja.deposito(dinero);
    }
    
    public static void extraccion(){
        double dinero;
        System.out.print("Ingrese cantidad de dinero a extraer:");
        dinero = entrada.nextDouble();
        caja.extraccion(dinero);
    }
    
    public static void consultarSaldo(){
        System.out.println(caja.consultaSaldo());
    }
}
