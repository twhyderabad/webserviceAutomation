import DreamsManager.DreamsManager;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class DreamsTester {

    @Test
    public void veryGetAllDreams() throws UnirestException {
        DreamsManager dreamsManager = new DreamsManager();
        HttpResponse<String> dreamsResponse =
        dreamsManager.getAllDreams();
        Assert.assertEquals(200, dreamsResponse.getStatus());

    }


    @Test
    public void verifyCreateDream() throws UnirestException {

        DreamsManager dreamsManager = new DreamsManager();
        HttpResponse<String> dreamResponse = dreamsManager.createDream("Go for Lunch!!!");

        Assert.assertEquals(201, dreamResponse.getStatus());

    }


    @Test
    public void verifyDeleteDream() throws UnirestException {
        DreamsManager dreamsManager = new DreamsManager();
        HttpResponse<String> dreamResponse = dreamsManager.deleteDream("42");

        Assert.assertEquals(204, dreamResponse.getStatus());

    }
}
