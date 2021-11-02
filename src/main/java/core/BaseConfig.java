package core;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static utils.ResponseValidator.prepareJsonSchema;

public class BaseConfig {

    private final static String url = ApplicationProperties.getInstance().getUrl();

    private final Filter logFilter = new CustomLogFilter();

    public RequestSpecification requestSpecification = new RequestSpecBuilder()
            .addFilter(logFilter)
            .setBaseUri(url)
            .setContentType(ContentType.JSON)
            .build();

    public ResponseSpecification responseSpecificationWithMatchesJsonSchema(Integer statusCode, Class<?> clazz) {
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .expectBody(matchesJsonSchema(prepareJsonSchema(clazz)))
                .build();
    }
}
