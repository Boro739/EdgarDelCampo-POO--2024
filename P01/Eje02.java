/**
 * Para utilizar la clase Scanner
 */
import java.util.Scanner;

/**
 * Clase Eje02
 * Es el main
 * Pide 2 numero y efectua diferentes operaciones, se usa la clase Math.
 * @author Del Campo Valdes Edgar Humberto
 * @version 1.0
 * 
 */
public class Eje02{
    public static void main(String args[])
    {
        /**
         * Objeto sc de la clase Scanner para poder leer las entradas
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Variables de tipo float para leer los calores ingresados
         */
        float num_1,num_2;

        /**
         * Variables de tipo float para alamcenar las operaciones
         */
        float suma,resta,mult,div,res;
        
        /**
         * Variables de tipo double para almacenar las operaciones y para poder usarlas con la clase Math
         */
        double raiz,rend_1,rend_2,potencia;
        
        /**
         * Se pide al usuario que ingrese el primer valor
         */
        System.out.println("Ingrese el primer valor: ");
        num_1=sc.nextFloat();
        
        /**
         * Se pide al usuario que ingrese el segundo valor
         */
        System.out.println("Ingrese el segundo valor: ");
        num_2=sc.nextFloat();

        /**
         * SE hacen las operaciones necesarias 
         */
        suma=num_1+num_2;
        resta=num_1-num_2;
        mult=num_1*num_2;
        div=num_1/num_2;
        res=num_1%num_2;
        
        /**
         * variable raiz en donde Java hace la conversion implicita de num_1, pasa de float a double
         * Se usa la clase Math.sqrt para sacar la raiz del primer numero
         */
        raiz=Math.sqrt(num_1); 
        
        /**
         * En rend_1 se hace una conversion explicita de float a double
         * Se usa Math.ceil para redondear hacia arriba
         */
        rend_1=Math.ceil((double)num_1); 
        
        /**
         * En rend_2 Java hace una conversion implicita, se pasa num_2 de float a double
         * Se usa Math.ceil para redondear hacia arriba
         */
        rend_2=Math.ceil(num_2);

        /**
         * variable potencia almacena la potendia de rend_1 a rend_2 (los numeros ya redondeados)
         * Se usa Math.pow para elevar el numero
         */
        potencia=Math.pow(rend_1,rend_2);

        /**
         * Se imprimen en pantalla los resultados de las operaciones
         */
        System.out.println("\nLa suma de "+ num_1+" y "+ num_2 + " es: "+ suma); 
        System.out.println("La resta de "+ num_1+ " y "+num_2+" es: " + resta);
        System.out.println("La multiplicacion de "+ num_1+ " y "+num_2+" es: "+mult);
        System.out.println("La division de "+num_1+" entre "+num_2+" es: "+div);
        System.out.println("El residuo de la division de es: "+num_1+" entre "+num_2+" es: "+res);
        System.out.println("La raiz cuadrada de "+num_1+" es: "+raiz);
        System.out.println("El redondeo de  "+ num_1+" y "+ num_2 + " es: "+rend_1+ " y "+rend_2); 
        System.out.println("El resultado de elevar el primer número redondeado ("+rend_1+ ") al segundo número redondeado ("+rend_2+") es: "+potencia);



    }
}
 