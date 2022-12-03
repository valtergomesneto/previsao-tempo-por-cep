package br.com.previsaotempopelocep.dominio;

public class Tempo {
    String resumo;

    String temp_max;

    String temp_min;
    public String getResumo() {return resumo;}

    public String getTemp_max() {return temp_max;}

    public String getTemp_min() {return temp_min;}

    @Override
    public String toString() {
        return "Tempo{" +
                "resumo='" + resumo + '\'' +
                ", temp_max='" + temp_max + '\'' +
                ", temp_min='" + temp_min + '\'' +
                '}';
    }
}
