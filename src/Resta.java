import java.util.Scanner;


public class Resta {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int n1, n2, r;

        System.out.println("numero 1: ");
        n1=teclado.nextInt();

        System.out.println("numero 2: ");
        n2=teclado.nextInt();

        r=n1-n2;

        System.out.println("la resta de estos numeros es: "+r);

    }
}