import java.util.Scanner;

public class meternumeroNegativo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int numeros=0;
        int negativo=0;

        for(int i = 1; i<10; i++){
            System.out.println("Introduce 10 numeros: ");
            numeros = sc.nextInt();

            if(numeros < 0){
                negativo++;
            }
        }
        System.out.println("Hay: " + negativo + " numeros negartivos ");



    }
}
