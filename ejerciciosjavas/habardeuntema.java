import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class habardeuntema {
    public static void main(String[] args) {
        Scanner scannercito = new Scanner(System.in);

        String respuesta;

        System.out.println("¿te has enterado?");
        respuesta = scannercito.nextLine();

        if(respuesta.toUpperCase().equals("SI")){
            System.out.println("Empiezo hablar, me he enterado");
        }else if(respuesta.toUpperCase().equals("NO")){
            System.out.println("No me he enterado de nada");

            while(!respuesta.toUpperCase().equals("SI")){
                System.out.println("Oye,te has enterado");

                respuesta = scannercito.nextLine();

                if(respuesta.toUpperCase().equals("NO")){
                    System.out.println("Me quedo callado");
                }
            }
        }
        System.out.println("Estoy informado");

    }
}
