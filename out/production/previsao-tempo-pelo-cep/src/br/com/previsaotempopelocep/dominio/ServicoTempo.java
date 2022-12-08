package br.com.previsaotempopelocep.dominio;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoTempo {
    static String webService = "https://apiprevmet3.inmet.gov.br/previsao/";
    static int codigoSucesso = 200;

    public static Tempo buscarTempo(String geoCode) throws Exception {

        String urlParaChamada = webService + geoCode;

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta2 = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString2(resposta2);

            String dataAtual = new Tempo().getDateTime();

            JSONObject jsonObject = new JSONObject(jsonEmString);

            //percorre o objeto json ate a tag com o turno e sobrescreve a instancia do jsonobject
<<<<<<< HEAD
            jsonObject = jsonObject.getJSONObject(geoCode).getJSONObject(dataAtual).getJSONObject("manha");
=======
//            jsonObject = jsonObject.getJSONObject(geoCode).getJSONObject(dataAtual).getJSONObject("manha");
            jsonObject = jsonObject.getJSONObject(geoCode).getJSONObject(dataAtual).getJSONObject(Util.turnoDia());
>>>>>>> ee9e9b7b7c3cae612a774e05ce71e335690aa072

            Gson gson = new Gson();
            Tempo tempo = gson.fromJson(String.valueOf(jsonObject), Tempo.class);

            return tempo;

        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
