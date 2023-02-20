package com.weborama.admin.page_object.keyclock;

import com.weborama.admin.framework.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Keycloak extends BasePage {

    public static void loginToGoldenFish(){
        $(By.id("username")).sendKeys("fishautotests@gmail.com");
        $(By.id("password")).sendKeys("12345Qq!");
        $(By.id("kc-login")).click();
    }
}
