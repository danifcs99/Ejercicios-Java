import java.util.Scanner;

public class cajadecambio {
    public static void main(String[] args) {
      Scanner scannercito = new Scanner(System.in);
      
      System.out.println("¿Cual es el precio de la compra?");
       double precio = scannercito.nextDouble();

      System.out.println("¿Con cuanto desea pagar?");
      double pagado = scannercito.nextDouble();


      double cambio = ((pagado - precio) *100) /100;
      System.out.println("Su cambio es " + (String.format("%.2f",cambio)));

      double cont500 = cambio / 500;
      cambio = ((cambio % 500)*100)/100;
      if(cont500 >= 1){
        System.out.println((int)cont500 + " numero de billetes de 500");
      }

      double cont200 = cambio / 200;
      cambio = ((cambio % 200)*100)/100;
      if(cont200 >= 1){
        System.out.println((int)cont200 + " numero de billetes de 200");
      }

      double cont100 = cambio / 100;
      cambio = ((cambio % 100)*100)/100;
      if(cont100 >= 1){
        System.out.println((int)cont100 + " numero de billetes de 100");
      }

      double cont50 = cambio / 50;
      cambio = ((cambio % 50)*100)/100;
      if(cont50 >= 1){
        System.out.println((int)cont50 + " numero de billetes de 50");
      }

      double cont20 = cambio / 20;
      cambio = ((cambio % 20)*100)/100;
      if(cont20 >= 1){
        System.out.println((int)cont20 + " numero de billetes de 20");
      }

      double cont10 = cambio / 10;
      cambio = ((cambio % 10)*100)/100;
      if(cont10 >= 1){
        System.out.println((int)cont10 + " numero de billetes de 10");
      }

      double cont5 = cambio / 5;
      cambio = ((cambio % 5)*100)/100;
      if(cont5 >= 1){
        System.out.println((int)cont5 + " numero de billetes de 5");
      }

      double cont2 = cambio / 2;
      cambio = ((cambio % 2)*100)/100;
      if(cont2 >= 1){
        System.out.println((int)cont2 + " numero de monedas de 2");
      }

      double cont1 = cambio / 1;
      cambio = ((cambio % 1)*100)/100;
      if(cont1 >= 1){
        System.out.println((int)cont1 + " numero de monedas de 1");
      }

      double cont05 = cambio / 0.5;
      cambio = ((cambio % 0.5)*100)/100;
      if(cont05 >= 1){
        System.out.println((int)cont05 + " numero de monedas de 0.50");
      }

      double cont02 = cambio / 0.20;
      cambio = ((cambio % 0.20)*100)/100;
      if(cont02 >= 1){
        System.out.println((int)cont02 + " numero de monedas de 0.20");
      }

      double cont01 = cambio / 0.10;
      cambio = ((cambio % 0.10)*100)/100;
      if(cont01 >= 1){
        System.out.println((int)cont01 + " numero de monedas de 0.10");
      }

      double cont005 = cambio / 0.05;
      cambio = ((cambio % 0.05)*100)/100;
      if(cont005 >= 1){
        System.out.println((int)cont005 + " numero de monedas de 0.05");
      }

      double cont002 = cambio / 0.02;
      cambio = ((cambio % 0.02)*100)/100;
      if(cont002 >= 1){
        System.out.println((int)cont002 + " numero de monedas de 0.02");
      }

      double cont001 = cambio / 0.01;
      cambio = ((cambio % 0.01)*100)/100;
      if(cont001 >= 1){
        System.out.println((int)cont001 + " numero de monedas de 0.01");
      }

    }
}
