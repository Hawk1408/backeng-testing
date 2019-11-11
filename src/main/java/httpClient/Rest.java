package httpClient;

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

    public Response sendGET(String path) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().get(path).andReturn();
    }

    public Response sendGET(String path, Map<String, String> headers, Map<String, String> queryParams) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).queryParams(queryParams).get(path).andReturn();
    }

    public Response sendGET(String path, Map<String, String> queryParams) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().queryParams(queryParams).get(path).andReturn();
    }

    public Response sendPOST(String path, Map<String, String> headers, Map<String, String> queryParams) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).queryParams(queryParams).post(path).andReturn();
    }

    public Response sendPOST(String path) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().post(path).andReturn();
    }

    public Response sendPOST(String path, String body) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().body(body).post(path).andReturn();
    }

    public Response sendPOST(String path, String body, Map<String, String> queryParams) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().body(body).queryParams(queryParams).post(path).andReturn();
    }

    public Response sendPOST(String path, Map<String, String> headers, String body) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).body(body).post(path).andReturn();
    }

    public Response sendDElETE(String path) {
        RestAssured.baseURI = baseURI;
        return RestAssured.given().delete(path).andReturn();
    }

    public  Response sendDELETE(String path, Map<String, String> headers){
        RestAssured.baseURI = baseURI;
        return RestAssured.given().headers(headers).delete(path).andReturn();
    }

    public Response sendDELETE(String path, String body, Map<String, String> headers){
        RestAssured.baseURI=baseURI;
        return RestAssured.given().body(body).headers(headers).delete(path).andReturn();
    }


}
