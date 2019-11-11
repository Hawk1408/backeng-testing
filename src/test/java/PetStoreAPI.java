import httpClient.Rest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PetStoreAPI {

    private Rest rest = new Rest("https://petstore.swagger.io");

    @Test
    public void getStoreInventory(){
        Response response = rest.sendGET("/v2/store/inventory");
        assert response.getStatusCode() == 200;
    }
    @Test
    public void getStoreOrder(){
        Response response = rest.sendGET("/v2/store/order/1");
        assert response.getStatusCode() == 200;
    }
    @Test
    public void deleteStoreOrder(){
        Response response = rest.sendDElETE("v2/store/order");
        assert response.getStatusCode() == 200;
    }
    @Test
    public void postStoreOrder(){
        Map<String,String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        Response response = rest.sendPOST("v2/store/order",headers,"{\"id\":0,\"petId\":0,\"quantity\":0,\"shipDate\":\"2019-11-11T02:09:58.111Z\",\"status\":\"placed\",\"complete\":true}");
        assert  response.getStatusCode() == 200;
    }

}
