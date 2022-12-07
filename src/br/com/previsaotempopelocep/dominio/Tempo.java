package br.com.previsaotempopelocep.dominio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Tempo {

    String name;
    String resumo;

    String temp_max;

    String temp_min;

    public String getName() {
        return name;
    }

    public String getResumo() {return resumo;}

    public String getTemp_max() {return temp_max;}

    public String getTemp_min() {return temp_min;}

    @Override
    public String toString() {
        return "Tempo{" +
                "name='" + name + '\'' +
                ", resumo='" + resumo + '\'' +
                ", temp_max='" + temp_max + '\'' +
                ", temp_min='" + temp_min + '\'' +
                '}';
    }

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
