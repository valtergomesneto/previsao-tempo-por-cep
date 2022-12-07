package br.com.previsaotempopelocep.dominio;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }

    public static String converteJsonEmString2(BufferedReader buffereReader) throws IOException {
        String resposta2, jsonEmString2 = "";
        while ((resposta2 = buffereReader.readLine()) != null) {
            jsonEmString2 += resposta2;
        }
        return jsonEmString2;
    }
}
