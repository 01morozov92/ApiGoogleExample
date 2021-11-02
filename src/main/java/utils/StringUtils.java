package utils;

import java.math.BigInteger;
import java.security.SecureRandom;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class StringUtils {
    private final SecureRandom random = new SecureRandom();

    public String generateEmail(){
        return randomAlphanumeric(5) + "@gmail.com";
    }

    public String generateName(String name){
        return name + randomAlphanumeric(5);
    }
}
