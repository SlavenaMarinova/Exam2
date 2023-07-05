package utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class CommonFunctions {
    public static String getRandomEmail(){
        String prefix = RandomStringUtils.randomAlphabetic(7);
        String sufix = RandomStringUtils.randomAlphabetic(5);
        String domain = RandomStringUtils.randomAlphabetic(3);
        return prefix + "@" + sufix + "." + domain;
    }
    public static String getRandomTelephone(){
        String phoneNumber = RandomStringUtils.randomNumeric(10);
        return phoneNumber;
    }
    public static String getRandomPassword(){
        String inputPassword = RandomStringUtils.randomAlphabetic(8);
        return inputPassword;
        }
}
