import java.util.Scanner;

public class PiedraPapelTijeras2{
    public static void main(String[]args){
		
        Scanner sc = new Scanner(System.in);

        int piedra = 1;
        int tijeras = 2;
        int papel = 3;
        int aleatorio = (int) (Math.random()*3+1);
        
            
       do {
        System.out.println("Elije entre 1(piedra), 2(tijeras) y 3(papel): ");
        int eleccion = sc.nextInt();
        if(eleccion == piedra && aleatorio == piedra|| eleccion == papel && aleatorio == papel|| eleccion == tijeras && aleatorio == tijeras){
            System.out.println("Empate");
        }else{
            if(eleccion == papel && aleatorio == tijeras || eleccion == piedra && aleatorio == papel || eleccion == tijeras && aleatorio == piedra){
                System.out.println("Has perdido");
            }
            else if(eleccion == piedra && aleatorio == tijeras || eleccion == tijeras && aleatorio == papel || eleccion == papel && aleatorio == piedra){
                System.out.println("Has ganado");
            }
	        }
    
        } while ();
System.out.println("La eleccion de la maquina ha sido: "+ aleatorio);
  }
}