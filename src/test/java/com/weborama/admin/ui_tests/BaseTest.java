package com.weborama.admin.ui_tests;

import static com.weborama.admin.navigation.AdminPageNavigation.navigateToAdminPage;
import static com.weborama.admin.navigation.GoldenFishNavigation.navigateToKeycloakPage;
import static com.weborama.admin.page_object.keyclock.Keycloak.loginToGoldenFish;

public class BaseTest {

    public static void openAdminInterface(){
        navigateToKeycloakPage();
        loginToGoldenFish();
        navigateToAdminPage();
    }
}
