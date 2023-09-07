public class programa_3{
    public static void main(String args[]){
        int [] arrg= {1,2,3,4,5,6,7,8,9,10};
        int suma=0,acum=0;
        for(int i =0;i<10;i++){
            if (arrg[i]==7){
                break;}
            else{
            suma=+arrg[i];
            System.out.println("La suma acumulada es :"+suma);
            }
        }
        
    }
}