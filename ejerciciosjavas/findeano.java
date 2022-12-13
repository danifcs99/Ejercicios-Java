import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class findeano 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;

        System.out.println("Introduzca el dia");
        dia = sc.nextInt();

        System.out.println("Introduzca el Mes");
        mes = sc.nextInt();

        System.out.println("Introduzca el año");
        anyo = sc.nextInt();

        Calendar calendarioinicial = Calendar.getInstance();

        calendarioinicial.set(Calendar.YEAR, anyo);
        calendarioinicial.set(Calendar.MONTH, mes -1);
        calendarioinicial.set(Calendar.DAY_OF_MONTH, dia);

        Calendar calendarifinal = Calendar.getInstance();

        calendarioinicial.set(Calendar.YEAR, anyo );
        calendarioinicial.set(Calendar.MONTH, Calendar.DECEMBER);
        calendarioinicial.set(Calendar.DAY_OF_MONTH, 31);

        Date fechaInicio = calendarioinicial.getTime();
        Date fechaFin = calendarifinal.getTime();

        long diferenciaDias = Math.abs(fechaFin.getTime() - fechaInicio.getTime());

        long dias  = TimeUnit.DAYS.convert(diferenciaDias, TimeUnit.MILLISECONDS);

        System.out.println("Numero de días para que acaben el año es de: " + dias);
    }
}
