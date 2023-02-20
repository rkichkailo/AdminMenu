package com.weborama.admin.ui_tests;

import com.weborama.admin.framework.driver.DriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    @BeforeAll
    public static void setup(){
        DriverManager.initDriver("local", "firefox");
        openAdminInterface();
    }

    @Test
    public void testAdminPage(){
        System.out.println("admin");
    }
}
