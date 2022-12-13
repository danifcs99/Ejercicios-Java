import java.util.Scanner;

public class numeroparimpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
  
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero es par");
                break;
                
            }else{
                System.out.println("El numero es impar");
                break;
                
            } 
        }
        if(numero==0){
            System.out.println("El cero no vale :)");
        }
    }
}
