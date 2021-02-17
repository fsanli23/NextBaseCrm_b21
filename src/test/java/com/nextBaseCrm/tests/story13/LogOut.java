package com.nextBaseCrm.tests.story13;

import com.nextBaseCrm.pages.Logoutpage;
import com.nextBaseCrm.pages.Messege;
import com.nextBaseCrm.utilities.LoginToWebsite;
import org.junit.Test;

public class LogOut {

    @Test
    public void Logout() {


        // LoginToWebsite loginPage = new LoginToWebsite();
        LoginToWebsite.loginNextBaseHD41();
        Logoutpage logout = new Logoutpage();
        logout.Logoubutton.click();
        logout.Logoutclick.click();
        //
}}
