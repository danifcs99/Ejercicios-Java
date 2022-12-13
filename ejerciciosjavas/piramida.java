import java.util.Scanner;

public class piramida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");

        int numfilas = sc.nextInt();
        sc.close();

        System.out.println();
        for(int altura = 1; altura<=numfilas; altura++){
            for(int blancos = 1; blancos<=numfilas - altura; blancos++){
                System.out.print(" ");
            }
            for(int asteriscos = 1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
