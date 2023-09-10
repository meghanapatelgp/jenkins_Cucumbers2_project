package com.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.*;

public class ErgastAPITestSteps {
    private RequestSpecification request;
    private Response response;

    @Given("the API base URL is {string}")
    public void setBaseURL(String baseURL) {
        RestAssured.baseURI = baseURL;
        request = RestAssured.given();
    }

    @When("a GET request is sent")
    public void sendGETRequest() {
        response = request.get();
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        assertEquals("Status code does not match", expectedStatusCode, actualStatusCode);
    }

    @Then("the response body should not be empty")
    public void verifyResponseBodyNotEmpty() {
        String responseBody = response.getBody().asString();
        assertNotNull("Response body is empty", responseBody);
    }
}
