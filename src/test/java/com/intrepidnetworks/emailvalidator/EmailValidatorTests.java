package com.intrepidnetworks.emailvalidator;

import com.intrepidnetworks.emailvalidator.validator.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailValidatorTests {

    @Test
    public void validateEmails() {
        String email1 = "someemail@example.com";
        String email2 = "email@test";
        String email3 = "notanemail";

        assertEquals(EmailValidator.isEmailValid(email1), true);
        assertEquals(EmailValidator.isEmailValid(email2), true);
        assertEquals(EmailValidator.isEmailValid(email3), false);
    }
}
