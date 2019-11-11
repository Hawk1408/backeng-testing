package httpClient;

import com.sun.xml.internal.bind.v2.TODO;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class Rest {

    public String baseURI;

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    public Rest(String baseURI) {
        this.baseURI = baseURI;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public Response sendGET(String path, Map<String, String> headers, Map<String, String> queryParams){
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).queryParams(queryParams).get(path).andReturn();
    }

    public Response sendGET(String path, Map<String, String> queryParams){
        RestAssured.baseURI = baseURI;
        return RestAssured.given().queryParams(queryParams).get(path).andReturn();
    }

    public Response sendPost(String path, Map<String, String> headers, Map<String, String> queryParams){
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).queryParams(queryParams).post(path).andReturn();
    }

    public Response sendPost(String path, Map<String, String> headers, Map<String, String> queryParams, String body){
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).queryParams(queryParams).body(body).post(path).andReturn();
    }

    public Response sendGET(String path, Map<String, String> headers, String body){
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).body(body).post(path).andReturn();
    }



    // TODO: 11/10/19

    /*
    1. POST with headers, query params
    2. POST with headers, query params and String body
    3. POST with headers and String body
     */
}
