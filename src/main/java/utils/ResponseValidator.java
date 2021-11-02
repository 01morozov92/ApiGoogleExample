package utils;

import com.github.victools.jsonschema.generator.*;
import lombok.SneakyThrows;
import models.createCompany.response.CreateCompanyResponse;

public class ResponseValidator {

    @SneakyThrows
    public static String prepareJsonSchema(Class<?> clazz) {
        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2019_09, OptionPreset.PLAIN_JSON);
        SchemaGeneratorConfig config = configBuilder.build();
        SchemaGenerator generator = new SchemaGenerator(config);
        return generator.generateSchema(clazz).toString();
    }
}
