import java.util.Scanner;

public class CambiarLetraPorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta cadena de numeros");
        String numero = sc.nextLine();
        String letra = numero.toUpperCase().replace("e", "3");

        System.out.println(letra);


    }
}
