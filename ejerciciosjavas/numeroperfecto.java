import java.util.Scanner;

public class numeroperfecto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sumadivisores = 0;

        System.out.println("Introduce el numero");
       int numero = sc.nextInt();

        for(int divisor = 1; divisor < numero; divisor++ ){
            if(numero % divisor == 0){
                sumadivisores += divisor;
            }
        }
        if(sumadivisores == numero){
            System.out.print("El numero " + numero + " es perfecto");
        }else{
            System.out.print("El numero " + numero + " no es perfecto");
        }

    }
}
