import java.util.concurrent.TimeUnit;

public class reloj {
    public static void main(String[] args) throws InterruptedException
    {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        String borrar = "\b\b\b\b\b\b\b\b";

        while(horas <= 23)
        {
            while(minutos <= 59)
            {
                while(segundos <= 59)
                {
                    System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

                    TimeUnit.SECONDS.sleep(1);

                    System.out.print(borrar);

                    segundos++;
                }
                segundos = 0;
                minutos++;
            }
            minutos = 0;
            horas++;
        }
        horas = 0;
    }
}
