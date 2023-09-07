import java.util.Scanner;

public class caracter{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char[] letras=new char[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Ingrese una letra: ");
            letras[i]=sc.next().charAt(0);
        }
        for(int k=0;k<3;k++)
        {
            System.out.println("\nEl "+(k+1)+" caracter es: "+letras[k]);
        }
    }
}