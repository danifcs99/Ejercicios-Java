import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas y columnas");
        numero = sc.nextInt();

        for(int indicefila = 0; indicefila < numero; indicefila++){
            for(int indicecolumna = 0; indicecolumna < numero; indicecolumna++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
}
