package br.com.previsaotempopelocep.test;
import br.com.previsaotempopelocep.dominio.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class PrevisaoTempoCepTest {
    public static void main(String[] args) throws Exception {
        System.out.println("##############################################");
        System.out.println("#                                            #");
        System.out.println("#       PREVISÃO DO TEMPO POR CEP            #");
        System.out.println("#                                            #");
        System.out.println("##############################################");

        System.out.print("\nInforme seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoCep.buscaEndereco(cep);
        String geoCode = endereco.getGeoLocalidade();

        Tempo tempo = ServicoTempo.buscarTempo(geoCode);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        //System.out.println("GeoCode: " + endereco.getGeoLocalidade());
        System.out.println("O tempo hoje em " + endereco.getBairro() +
                " no periodo "+ Util.turnoDia() + " é de " + tempo.getResumo() +
                "\nTemperatura Maxima hoje:" + tempo.getTemp_max() + "ºC" +
                "\nTemperatura Minima hoje:" + tempo.getTemp_min() + "ºC");

//        System.out.println(tempo);

    }
}
