package br.com.previsaotempopelocep.dominio;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

    public static String turnoDia() {
        Format patternHour = new SimpleDateFormat("HH");
        int timeNow = Integer.parseInt(patternHour.format(new Date()));
        String turno = "";
        if(timeNow >= 4 && timeNow < 12){
            turno = "manha";
        } else if (timeNow >= 12 && timeNow < 18) {
            turno = "tarde";
        } else if (timeNow >= 18 && timeNow < 23 || timeNow >= 0 && timeNow < 4) {
            turno = "noite";
        }
        return turno;
    }


}
