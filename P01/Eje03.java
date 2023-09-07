/**
 * Para utilizar la clase Scanner
 */
import java.util.Scanner;

/**
 * Clase Eje03
 * Es el main
 * @author Del Campo Valdes Edgar Humberto
 * @version 1.0
 */
public class Eje03{
    public static void main(String args[])
    {

        /**
         * Objeto sc de la clase Scanner para poder leer las entradas
         */
        Scanner sc= new Scanner(System.in);
        
        /**
         * Creando nuevo objeto unGatito de clase Gatito
         */
        Gatito unGatito = new Gatito();
        
        /**
         * Pedimos al usuario ingresar los atributos de unGatito (nombre del gatito, color de ojos y edad)
         */
        System.out.println("Ingrese el nombre del gatito: ");
        unGatito.nombre=sc.nextLine();

        System.out.println("Ingrese el color de ojos del gatito: ");
        unGatito.colorDeOjos=sc.nextLine();

        System.out.println("Ingrese la edad del gatito: ");
        unGatito.edad=sc.nextInt();

        /**
         * Impresion de los atributos de unGatito
         */
        System.out.println("\n\nEl gatito "+unGatito.nombre+" tiene "+unGatito.edad+ " y los ojos de color "+unGatito.colorDeOjos);
        
        /**
         * Impresion de los metodos de unGatito
         */     
        System.out.println("\nAsi maulla");
        unGatito.maullar();
        System.out.println("\nAsi toma leche");
        unGatito.beberLeche();
        System.out.println("\nAsi ronronea");
        unGatito.ronronear();

        /**
         * Impresion de unGatito(figura)
         */
        System.out.println("\n");
        System.out.println("    /\\_/\\");
        System.out.println("   ( o.o )");
        System.out.println("    > ^ <");
                    

    }
}