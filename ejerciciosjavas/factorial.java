import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);
        int resultado = 1;
        int i;
        System.out.println("Introduzca el numero: ");
        int numero = scannercito.nextInt();
        System.out.println("Introduzca el final: ");
        int fin = scannercito.nextInt();
        

        for(i = 0; i < fin; i++){
            resultado = numero * i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}
