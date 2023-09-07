/**
 * Para utilizar la clase Scanner
 */
import java.util.Scanner;

/**
 * Clase Eje01
 * Pide diferentes datos al usuario y los imprime en pantalla con un formato
 * @author Del Campo Valdes Edgar Humberto
 * @version 1.0
 */
public class Eje01{
    public static void main(String args[])
    {

        /**
         * Objeto sc de la clase Scanner para poder leer las entradas
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Variable int que almacena la edad
         */
        int edad;

        /**
         * Variables float que almacena la estatura y numero de segundos vividos
         */
        float estatura, num_seg;

        /**
         * Variable de tipo string que almacena nombre completo
         */
        String nom_comp;

        /**
         * Variable char que almacena una letra
         */
        char letra_fav;

        /**
         * Se pide al usuario sus datos (edad, estaura, nombre comleto, letra favorita y numero de segundos vividos hasta el momento)
         */
        System.out.println("Ingrese su edad: ");
        edad=sc.nextInt();

        System.out.println("Ingrese su estatura(en metros: )");
        estatura=sc.nextFloat();

        sc.nextLine();
        System.out.println("Ingrese su nombre completo: ");
        nom_comp=sc.nextLine();

        System.out.println("Ingrese su letra favorita: ");
        letra_fav=sc.next().charAt(0);

        System.out.println("Ingrese el numero de segundos que ha vivido hasta el momento: ");
        num_seg=sc.nextFloat();
        
        /**
         * Imprime los datos con el formato requerido 
         */
        System.out.println("\nHola " + nom_comp + "\nMides " + estatura + " metros y tu letra favorita es " + letra_fav + "\nHasta el momento has vivido " + num_seg + " segundos");
    }
}