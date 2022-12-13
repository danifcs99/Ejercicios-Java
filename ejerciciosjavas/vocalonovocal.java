import java.util.Scanner;

public class vocalonovocal {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);

        char caracter;
        String caracterIntroducido;

        System.out.println("Introduce el caracter: ");
        caracterIntroducido = scannercito.nextLine();        
        
        while(!caracterIntroducido.equals(" ")){
           caracter = caracterIntroducido.toUpperCase().charAt(0);

            if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' ){
                System.out.println("El caracter introducido es una VOCAL");
            }else{
                System.out.println("El caracter introducido NO es una VOCAL");
            }

            caracterIntroducido = scannercito.nextLine();
        }


    }
}
