import java.util.Scanner;

public class cuantosposynega {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
  
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero es positivo");
                break;
                
            }else{
                System.out.println("El numero es negativo");
                break;
                
            } 
        }if(numero == 0){
            System.out.println("el cero no vale");
        }
        
    }
} 
