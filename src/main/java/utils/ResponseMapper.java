package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.ValidatableResponse;
import lombok.SneakyThrows;
import org.json.JSONObject;

public class ResponseMapper {

    @SneakyThrows
    public static <T> T mapResponseOnClass(ValidatableResponse validatableResponse, Class<T> clazz){
        JSONObject jsonObject = new JSONObject(validatableResponse.extract().asString());
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(jsonObject.toMap(), clazz);
    }
}
