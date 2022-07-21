package ejercios1;

import java.util.Scanner;

public class Funciones {


    public static void main(String[] args) {

           double numero1;
           double iva = 21;
           double Total;


        Scanner precio = new Scanner(System.in);
        System.out.print("introduce precio ");
        numero1= precio.nextInt();
        Total =  (iva * numero1/100 + numero1);

        //Resultado
        System.out.println("\nPrecio final calculado: " + Total);
        System.out.println("\n\t\tFIN DE PROGRAMA");
        precio.close();
    }


}
