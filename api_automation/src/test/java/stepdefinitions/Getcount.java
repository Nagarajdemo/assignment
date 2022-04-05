package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.UserPosts;
import org.junit.Assert;
import org.skyscreamer.jsonassert.JSONAssert;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static java.lang.Boolean.TRUE;

public class Getcount {
    private Response rs;
    private List<UserPosts> userPostsList=new ArrayList<>();
    private int countValue;
    private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts";

    @Given("make a get call to jsonplaceholder")
    public void requestGetCall() {
          rs= RestAssured
                  .with().get(BASE_URL);

        System.out.println("Given");
    }

    @When("store the response either to pojo or jsonresponse")
    public void storeTheResponse() {
//        rs.prettyPrint();
        userPostsList= Arrays.asList(rs.as( UserPosts[].class));
        countValue=userPostsList.size()-1;
        System.out.println("When "+userPostsList.size());

    }

    @Then("validate the number of posts returned {int}")
    public void validate_the_response(int count) {
        Assert.assertEquals(userPostsList.get(countValue).getId(),count);
        System.out.println("Then "+count);

    }
}
