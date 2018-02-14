import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;

public class testCrypto {

    @Test
    public void testCryptoPrice() throws UnirestException {
        String URL = "https://api.hitbtc.com/api/2/public/ticker/";
        String coinName = "DOGEBTC";
        HttpResponse<String> response = Unirest.get(URL+coinName)
                .header("accept", "application/json")
                .asString();
        System.out.println(response.getBody());

        Assert.assertEquals(200, response.getStatus());

    }

}
