package br.com.previsaotempopelocep.test;
import br.com.previsaotempopelocep.dominio.Endereco;
import br.com.previsaotempopelocep.dominio.ServicoCep;
import br.com.previsaotempopelocep.dominio.ServicoTempo;
import br.com.previsaotempopelocep.dominio.Tempo;

import java.util.Scanner;

public class PrevisaoTempoCepTest {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoCep.buscaEndereco(cep);
        String geoCode = endereco.getGeoLocalidade();
        Tempo tempo = ServicoTempo.buscarTempo(geoCode);


        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        System.out.println("GeoCode: " + endereco.getGeoLocalidade());
        System.out.println("Resumo da Previsão do tempo: " + tempo.getResumo());
        System.out.println("Temperatura Máxima hoje em " + endereco.getBairro() + " é de " + tempo.getTemp_max() + "º e a temperatura minima é " + tempo.getTemp_min());
    }
}
