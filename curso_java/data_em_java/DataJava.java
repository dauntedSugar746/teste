package curso_java.data_em_java;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class DataJava {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data = new Date();
        Date dataMil = new Date(System.currentTimeMillis());
        Date dataMilM = new Date(0L);
        Date ios = Date.from(Instant.parse("2020-11-19T12:02:40Z"));

        Date ano1 = data1.parse("19/11/2020");
        Date ano2 = data2.parse("19/11/2020 10:34:40");

        System.out.println(data2.format(ios));
        System.out.println(data2.format(dataMilM));
        System.out.println(hora.format(dataMil));
        System.out.println(hora.format(data));
        System.out.println(data1.format(ano1));
        System.out.println(data2.format(ano2));


    }

}
