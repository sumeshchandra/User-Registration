package com.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testFirstName() {
        boolean result = userRegistration.checkFirstName("Sumesh");
        Assert.assertTrue(result);
    }

    @Test
    public void testLastName() {
        boolean result = userRegistration.checkLastName("Jena");
        Assert.assertTrue(result);
    }

    @Test
    public void testEmailId() {
        boolean result = userRegistration.checkEmail("abc.sd@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void testPhoneNumber() {
        boolean result = userRegistration.checkPhoneNumber("91 7998944265");
        Assert.assertTrue(result);
    }

    @Test
    public void testPassword() {
        boolean result = userRegistration.checkPassword("Sdsds$1234");
        Assert.assertTrue(result);
    }


}

