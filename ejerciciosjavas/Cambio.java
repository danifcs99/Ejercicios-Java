import java.util.Scanner;

public class Cambio{
    public static void main(String[] args){
      Scanner lector = new Scanner(System.in);
      float pre, pag, cambio, faltante;

      System.out.println("Ingrese el precio a pagar");
      pre=lector.nextFloat();
      System.out.println("¿Cuanto ha pagado?");
      pag=lector.nextFloat();


      cambio=pag-pre;
      faltante=pre-pag;

      if(cambio<0){
        System.out.println("falta dinero en el pago. El dinero faltante es "+faltante);
      }
      else if(cambio==0){
        System.out.println("se ha pago exacto, no se secesita cambio");
      }
      else if(cambio>0){
        System.out.println("El cambio a dar es "+cambio);
      }
  }
}