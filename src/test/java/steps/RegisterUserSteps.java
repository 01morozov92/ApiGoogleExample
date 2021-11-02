package steps;

import core.BaseConfig;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import lombok.SneakyThrows;
import models.createUser.request.CreateUserRequest;
import models.createUser.response.CreateUserResponse;
import models.registerUser.request.RegisterUserRequest;
import models.registerUser.response.RegisterUserResponse;

import java.util.Arrays;
import java.util.Collections;

import static utils.ResponseMapper.mapResponseOnClass;

public class RegisterUserSteps extends BaseConfig {

    /**
     * @param email почта клиента
     * @param name имя клиента
     * @return возвращает почтовый адрес клиента
     */
    @SneakyThrows
    @Step("Регистрация в системе")
    public String registerUser(String email, String name) {
        //Если надо передать много заголовков делаем так
        /*
        Header header1 = new Header("Authorization", "578sd90f07d58g68d9fg765d90df76g5df90g97df5690g76df5g970d8");
        Header header2 = new Header("Authorization", "578sd90f07d58g68d9fg765d90df76g5df90g97df5690g76df5g970d8");
        Header header3 = new Header("Authorization", "578sd90f07d58g68d9fg765d90df76g5df90g97df5690g76df5g970d8");
        Headers headers = new Headers(header1, header2, header3);
        ValidatableResponse response = RestAssured.given()
                //Тип отправляемых данных JSON
                .contentType(ContentType.JSON)
                .headers(headers).....
         */

        //Отправка запроса с помощью библиотеки RestAssured
        ValidatableResponse response = RestAssured.given()
                //Тип отправляемых данных JSON
                .spec(requestSpecification)
                .body(RegisterUserRequest.builder()
                        .email(email)
                        .name(name)
                        .build())
                //метод запроса - POST, а эндпоинт - http://users.bugred.ru/tasks/rest/doregister
                .post("doregister")
                //Тогда
                .then()
                //Код ответа 200 тоесть ОК. Бывают 400ые(вина на стороне клиента) и 500ые(упал сервер)
                .spec(responseSpecificationWithMatchesJsonSchema(200, RegisterUserResponse.class));

        //Конвертация ответа в объект RandomUserGetResponse.class
        RegisterUserResponse registerUserResponse = mapResponseOnClass(response, RegisterUserResponse.class);
        return registerUserResponse.getEmail();
    }

    @SneakyThrows
    @Step("Создание пользователя")
    public String createUser(String email, String name) {
        //Отправка запроса с помощью библиотеки RestAssured
        ValidatableResponse response = RestAssured.given()
                //Тип отправляемых данных JSON
                .spec(requestSpecification)
                .body(CreateUserRequest.builder()
                        .companies(Arrays.asList(7, 8))
                        .email(email)
                        .name(name)
                        .tasks(Collections.singletonList(56))
                        .build())
                //метод запроса - POST, а эндпоинт - http://users.bugred.ru/tasks/rest/doregister
                .post("createuser")
                //Тогда
                .then()
                //Код ответа 200 тоесть ОК. Бывают 400ые(вина на стороне клиента) и 500ые(упал сервер)
                .spec(responseSpecificationWithMatchesJsonSchema(200, CreateUserResponse.class));

        //Конвертация ответа в объект RandomUserGetResponse.class
        CreateUserResponse createUserResponse = mapResponseOnClass(response, CreateUserResponse.class);
        return createUserResponse.getEmail();
    }
}
