package br.com.previsaotempopelocep.dominio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Tempo {


    public String resumo;
    public String temp_max;
    public String temp_min;


    public String getResumo() {return resumo;}

    public String getTemp_max() {return temp_max;}

    public String getTemp_min() {return temp_min;}

    /*@Override
    public String toString() {
<<<<<<< HEAD
        return "Resumo Tempo hoje: " + resumo + "\n" + "Temperatura Maxima hoje: " + temp_max + "\n" +"Temperatura Minima hoje: " + temp_min;
    }*/

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //return "resumo: " + resumo + "\n" + "temp_max: " + temp_max + "\n" +"temp_min: " + temp_min;


}
