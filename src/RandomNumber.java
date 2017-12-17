
import java.util.Random;
import java.util.Scanner;

/*
 * Este programa te pregunta por un numero random y tienes que adivinarlo
 * el programa te dira si el numero es mayor o menor al introducido hasta encontrar el numero
 * que la maquina encontro
 */
/**
 *
 * @author YORSH
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();

        int data;
        int low;
        int high;
        int result;
        boolean adivinar = true;

        System.out.println("Este programa hara que adivines un numero \n"
                + "tendras que darle un limite, y te dira si el numero es mayor o menor que");

        System.out.println("minimo valor a adivinar ");

        Scanner teclado = new Scanner(System.in);
        low = teclado.nextInt();

        System.out.println("maximo valor a adivinar ");
        high = teclado.nextInt();
        result = r.nextInt(high - low) + low;
        System.out.println("el numero random es " + result);
        // teclado.close();

        while (adivinar) {
            System.out.println("Introduce un numero");
            data = teclado.nextInt();

            if (result == data) {
                adivinar = false;
            } else if (data < low) {
                System.out.println("el numero no debe ser menor que el minimo de " + low);
            } else if (data > high) {
                System.out.println("el numero no deberia ser mayor que el maximo de " + high);

            } else if (data > result) {
                System.out.println("el numero " + data + " es menor");
            } else if (data < result) {
                System.out.println("el numero " + data + " es mayor");
            }
        }
        System.out.println("correcto!!! adivinaste el numero");
    }
}
