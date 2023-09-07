import java.util.Scanner;

public class dimensiones{
    public static void main(String args[])
    {
        int[][] matriz=new int [2][3];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<2;i++) //renglon(se recorre el arreglo de manera vertical)
        {
            for(int k=0;k<3;k++)//columna(se recorre el arreglo de manera horizontal)
            {
                //Acciones a repetir con el arreglo bidimensional
                System.out.println("Ingrese un valor en la poscion ["+i+","+k+"]= ");
                matriz[i][k]=sc.nextInt();
            }
        }

        for(int i=0;i<2;i++) //renglon(se recorre el arreglo de manera vertical)
        {
            for(int k=0;k<3;k++)//columna(se recorre el arreglo de manera horizontal)
            {
                //Acciones a repetir con el arreglo bidimensional
                System.out.println("El valor en la poscion ["+i+","+k+"] es = "+matriz[i][k]);
            }
        }

        System.out.println("\n\n");

        for(int i=1;i>=0;i--) //renglon(se recorre el arreglo de manera vertical)
        {
            for(int k=2;k>=0;k--)//columna(se recorre el arreglo de manera horizontal)
            {
                //Acciones a repetir con el arreglo bidimensional
                System.out.println("El valor en la poscion ["+i+","+k+"] es = "+matriz[i][k]);
            }
        }
    }
}