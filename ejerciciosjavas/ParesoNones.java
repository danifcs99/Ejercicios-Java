import java.util.Scanner;

public class ParesoNones {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int contadorjugador1  = 0;
        int contadorjugador2 = 0;
        int numerojugador1;
        int numerojugador2;
        int sumadatos;
        String jugador1;
        String jugador2;
        String repetir;
        
      do {
        
        for(int i = 0; i<5; i++){
        System.out.println("jugador 1 que elige par o impar");
        jugador1 = sc.next();
        System.out.println("jugador 2 que elige par o impar");
        jugador2 = sc.next();

        System.out.println("Ingrese numero del jugador 1");
        numerojugador1 = sc.nextInt();
        System.out.println("Introduce numero jugador 2");
        numerojugador2 = sc.nextInt();


        sumadatos = numerojugador1 + numerojugador2;

        if(jugador1.equalsIgnoreCase("par")  && sumadatos % 2 == 0)
        {
            System.out.println("Ha salido par gana esta ronda juagdor nuemro 1");
            contadorjugador1++;
            
        } else if(jugador1.equalsIgnoreCase("impar") && sumadatos % 2 != 0)
        {
            System.out.println("Ha salido impar gana esta ronda jugador numero 1");
            contadorjugador1++;
            
        }

        if(jugador2.equalsIgnoreCase("par")  && sumadatos % 2 == 0)
        {
            System.out.println("Ha salido par gana esta ronda  jugador numero 2");
            contadorjugador2++;
            
        } else if(jugador2.equalsIgnoreCase("impar") && sumadatos % 2 != 0)
        {
            System.out.println("Ha salido impar gana esta ronda jugador numero 2");
            contadorjugador2++;
            
        }

        if(contadorjugador1 == 3)
          {
            System.out.println("Ha ganado el jugador 1");
            break;
          }else if(contadorjugador2 == 3)
          {
            System.out.println("Ha ganado el jugador 2");
            break;
          }
        }
        System.out.println("Desea volver a jugar: S/N");
        repetir = sc.next();
      }while(repetir.equalsIgnoreCase("s"));

    }
}
