public class main{
    public static void main(String[] args)
    {
        int cont=10;
        int [] numeros= new int[5];
        for (int i=0;i<5;i++)
        {
            cont+=1;
            numeros[i]= cont;
            System.out.println("la casilla "+(i+1)+" tiene el valor "+numeros[i]);
        }
    }
}