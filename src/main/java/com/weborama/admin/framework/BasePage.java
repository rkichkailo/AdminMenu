package com.weborama.admin.framework;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public void navigate(String url){
        open(url);
    }
}
