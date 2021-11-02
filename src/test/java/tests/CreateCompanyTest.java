package tests;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import models.createCompany.response.CreateCompanyResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import steps.CreateCompanySteps;
import steps.RegisterUserSteps;
import utils.StringUtils;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.fail;

@Log4j2
public class CreateCompanyTest {

    @SneakyThrows
    @Test
    public void createCompany() {
        RegisterUserSteps registerUserSteps = new RegisterUserSteps();
        CreateCompanySteps createCompanySteps = new CreateCompanySteps();
        StringUtils stringUtils = new StringUtils();
        String mainEmail = registerUserSteps.registerUser(stringUtils.generateEmail(),
                stringUtils.generateName("Vanek"));
        log.info("Создан аккаунт с почтой: " + mainEmail);
//        String userEmail = registerUserSteps.registerUser(stringUtils.generateEmail(),
//                stringUtils.generateName("Sanya"));
        String userEmail = "TheLupa@mail.com";
        Thread.sleep(1000);
        CreateCompanyResponse company = createCompanySteps.createCompany(Collections.singletonList(userEmail),
                "01morozov92@mail.ru", "ЗАОбищёки");
        if(company.getMessage() != null){
            fail(company.getMessage());
        }
        Assertions.assertEquals("success", company.getType(),
                "Статус создания компании: " + company.getType() + " не соответсвует ожидаемому");
        System.out.println("Статус создания компании: " + company.getType());
    }
}
