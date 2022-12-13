import java.util.*;

public class adivinarnumero {
    public static void main(String[]args){
    Scanner scannercito = new Scanner(System.in);

    int numeroaleatorio;
    int numeromaximointentos = 10;
    int intentos = 0;
    int numerointroducido = 0;
    numeroaleatorio = (int)(Math.random() * 100);
    

    System.out.println("Intente adivinar el numero(1-100). Tiene hasta 10 intentos ");


    while(intentos < numeromaximointentos && numeroaleatorio != numerointroducido){
      numerointroducido = scannercito.nextInt();

      if(numerointroducido == numeroaleatorio)
      {
          System.out.println("Has acertado :)");
          break;
      }
      else if(numerointroducido > numeroaleatorio)
      {
        intentos++;
          System.out.println("El numero introducido es mayor que el numero aleatorio");
      }
      else
      {
        intentos++;
          System.out.println(" El numero introducido es menor que el numero aleatorio");
      }

    }
      if(intentos == numeromaximointentos)
    {
        System.out.println("se te acabaron los intentos");
    }
  }
}
