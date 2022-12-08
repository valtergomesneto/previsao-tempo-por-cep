package br.com.previsaotempopelocep.test;
import br.com.previsaotempopelocep.dominio.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class PrevisaoTempoCepTest {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoCep.buscaEndereco(cep);
        String geoCode = endereco.getGeoLocalidade();

        Tempo tempo = ServicoTempo.buscarTempo(geoCode);
//        System.out.println(tempo);
        System.out.println(geoCode);


        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        System.out.println("GeoCode: " + endereco.getGeoLocalidade());
//        System.out.println(tempo.getResumo() + " " + tempo.getTemp_max() + " " + tempo.getTemp_min() + " " + tempo.getName());

        System.out.println(tempo);


    }
}
