package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import core.BaseConfig;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import lombok.SneakyThrows;
import models.randomUserResponse.RandomUserGetResponse;
import org.json.JSONObject;

public class ExampleSteps extends BaseConfig {

    @SneakyThrows
    @Step("")
    public String getSomeThing() {
        //Отправка запроса с помощью библиотеки RestAssured
        ValidatableResponse response = RestAssured.given()
                //Тип отправляемых данных JSON
                .contentType(ContentType.JSON)
                //метод запроса - GET, а эндпоинт - https://randomuser.me/api/
                .get("https://randomuser.me/api/")
                //Тогда
                .then()
                //Код ответа 200 тоесть ОК. Бывают 400ые(вина на стороне клиента) и 500ые(упал сервер)
                .statusCode(200);

        //Конвертация ответа в объект RandomUserGetResponse.class
        JSONObject jsonObject = new JSONObject(response.extract().asString());
        ObjectMapper objectMapper = new ObjectMapper();
        RandomUserGetResponse randomUserGetResponse = objectMapper.convertValue(jsonObject.toMap(), RandomUserGetResponse.class);

        //Печатаем Имя и Фамилию в консоль получая их из объекта/ответа
        System.out.println(
                "First Name: " + randomUserGetResponse.getResults().get(0).getName().getFirst() + " " +
                "Last Name: " + randomUserGetResponse.getResults().get(0).getName().getLast()
        );

        //Возвращаем имя в качестве String
        return randomUserGetResponse.getResults().get(0).getName().getFirst();
    }
}
