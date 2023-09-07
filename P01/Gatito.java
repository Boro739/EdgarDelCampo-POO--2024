/**
 * Clase Gatito
 * Describe las caracteristicas de objetos de tipo Gatito
 * @author Del Campo Valdes Edgar Humberto
 * @version 1.0
 */

public class Gatito{

    /**
     * variable que almacena el color de ojos del gatito
     */

    String colorDeOjos;
    
    /**
     * variable que almacena el nombre del gatito
     */
    String nombre;

    /**
     * variable que almacena la edad del gatito
     */
    int edad;

    /**
     * Metodo que imprime en pantalla el maullido del gatito
     */
    public void maullar()
    {
        System.out.println("Miauuu!!!");
    }

    /**
     * Metodo que imprime en pantalla el sonido de cuando bebe leche
     */
    public void beberLeche()
    {
        System.out.println("Glu, glu, glu, gluuuu");
    }

    /**
     * Metodo que imprime en pantalla el ronroneo del gatito
     */
    public void ronronear()
    {
        System.out.println("Prrrrr, prrrr, prrr");
    }

}