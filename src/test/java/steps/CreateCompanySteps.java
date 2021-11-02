package steps;

import core.BaseConfig;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import lombok.SneakyThrows;
import models.createCompany.request.CreateCompanyRequest;
import models.createCompany.response.CreateCompanyResponse;

import java.util.List;

import static utils.ResponseMapper.mapResponseOnClass;

public class CreateCompanySteps extends BaseConfig {

    @SneakyThrows
    @Step("Создание компании")
    public CreateCompanyResponse createCompany(List<String> users, String emailOwner, String companyName) {
        //Отправка запроса с помощью библиотеки RestAssured
        ValidatableResponse response = RestAssured.given()
                //Тип отправляемых данных JSON
                .spec(requestSpecification)
                .body(CreateCompanyRequest.builder()
                        .companyName(companyName)
                        .companyType("ОАО")
                        .companyUsers(users)
                        .emailOwner(emailOwner)
                        .build())
                //метод запроса - POST, а эндпоинт - http://users.bugred.ru/tasks/rest/doregister
                .post("createcompany")
                //Тогда
                .then()
                //Код ответа 200 тоесть ОК. Бывают 400ые(вина на стороне клиента) и 500ые(упал сервер)
                .spec(responseSpecificationWithMatchesJsonSchema(200, CreateCompanyResponse.class));

        //Конвертация ответа в объект RandomUserGetResponse.class
        return mapResponseOnClass(response, CreateCompanyResponse.class);
    }
}
