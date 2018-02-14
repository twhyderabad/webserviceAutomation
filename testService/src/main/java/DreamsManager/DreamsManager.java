package DreamsManager;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class DreamsManager {
String url = "https://dreamstw.herokuapp.com/dreams";

    public HttpResponse<String> getAllDreams() throws UnirestException {
        HttpResponse<String> allDreams = Unirest.get(url)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .asString();

        return allDreams;
    }

    public HttpResponse<String> createDream(String dream) throws UnirestException {
        HttpResponse<String> dreamResponse = Unirest.post(url)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body("{\"content\": \""+dream+"\"}")
                .asString();
        return dreamResponse;
    }

    public HttpResponse<String> deleteDream(String dreamId) throws UnirestException {

        HttpResponse<String> dreamResponse = Unirest.delete(url+"/"+dreamId)
                .header("Accept", "application/json")
                .header("Authorization", "Basic eHRyZW1lOnRlc3Rpbmc=")
                .asString();

        return dreamResponse;

    }
}
