import java.util.Scanner;

public class Eje01{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        //Declarar el objeto e inicializarlo con el 
        // objeto de entrada estandar predefinido 
        
        int edad;
        //entrada de entero

        float estatura, num_seg;
        //entrada de float

        String nom_comp;
        //entrada de cadena

        char letra_fav;
        //entrada de caracter

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
        
        System.out.println("Hola " + nom_comp + "\nMides " + estatura + " metros y tu letra favorita es " + letra_fav + "\nHasta el momento has vivido " + num_seg + " segundos");
    }
}