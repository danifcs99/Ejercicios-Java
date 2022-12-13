import java.util.Scanner;
public class meternumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayor = 0;
        int numero = 0;

        for(int i=1; i<10; i++){
            System.out.println("Inserte 10 numeros");
            numero = sc.nextInt();
            
        }
        if( numero > mayor){
            mayor = numero;
        }
        System.out.println("El numero mayor es " + mayor);
    }
}
