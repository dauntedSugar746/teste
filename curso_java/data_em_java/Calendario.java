package curso_java.data_em_java;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Calendario {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date horaCal = new Date(); // Date.from(Instant.parse("2018-19-11T12:25:28Z"));

        Calendar cal = Calendar.getInstance();

        cal.setTime(horaCal);

        cal.add(Calendar.HOUR_OF_DAY, 4);

        horaCal = cal.getTime();

        System.out.println(hora.format(horaCal));

    }

}
