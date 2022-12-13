import java.util.Scanner;

public class financiacion {
    public static void main(String[] args){
      Scanner scanner =new Scanner(System.in);
      
      double total = 0;
      int numeromesualidades;
      double cuota;
    
      System.out.println("Introduce la primera cuota a pagar: ");
      cuota = scanner.nextDouble();

      System.out.println("Introduce el numero de meses de financiacion ");
      numeromesualidades = scanner.nextInt();
      //el contador empieza en 1//
      int contador = 1;
      // el contador tiene que se igual o menos que la mensualidad//
      while(contador <= numeromesualidades)
      {
        System.out.println("cuota " + contador + ":" + cuota + "euros");
        // el total va delante para que la primera cueta no se multiplique por 2//
        total = total + cuota;

        cuota = cuota * 2;

        contador++;
      }

    }
}
