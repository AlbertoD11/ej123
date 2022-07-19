package ejercios1;

public class Main {

    public static void main(String[] args){

        System.out.println("Hola mundo ");

        byte variable1 = 8;
        System.out.println(variable1);
        short variable2 = 12;
        int variable3 = 30;
        long variable4 = 100;



        // 1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;

        // 2. booleano
        boolean variable7 = false;
        boolean variable8 = true;

        // 3. texto
        char variable9 = 'a';


        // aritmeticos:
        int numero1 = 30;
        int numero2 = 28;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = numero1 - numero2;

        /*
        comparación:
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
        === IMPORTANTE: EN JAVA NO EXISTE!!!!
         */
        boolean resultado1 = numero1 > numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero1 < numero2;
        System.out.println(resultado2);

        /*
        Lógicos
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero1 < 30;
        System.out.println(resultado3);

        int edad = 20;
        boolean carnetJoven = edad >= 15 || edad <= 26;
        System.out.println(carnetJoven);

        

    }
}
