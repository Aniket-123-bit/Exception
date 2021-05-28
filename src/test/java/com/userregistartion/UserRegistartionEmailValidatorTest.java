package com.userregistartion;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;

public class UserRegistartionEmailValidatorTest<UserRegistration> {

    public class UserRegistrationEmailValidatorTest {
        public String email;
        public UserRegistration userRegistration;
        public boolean finalResult;
        public Assertions Assert;

        public UserRegistrationEmailValidatorTest(String email, boolean finalResult) {
            this.email = email;
            this.finalResult = finalResult;
        }
        public static Collection<Object[]> emailData(){
            return  Arrays.asList ( new Object[][]{
                    { "anny@yahoo.com" ,true},
                    {"anny-100@yahoo.com",true},
                    {"anny.100@yahoo.com",true},
                    {"anny111@abc.com",true},
                    {"abc-100@abc.net",true},
                    {"abc.100@abc.com.au",true},
                    {"abc@1.com",true},
                    {"abc@gmail.com.com",true},
                    {"abc.100@1.com",true},
                    {"abc.abc@gmail.co.in",true},
                    {"abc100@gmail.com",true},
                    {"abc.100@abc.com.au",true},
                    {"abc@.com.my",false},
                    {"abc123@gmail.a",false},
                    {"abc",false},
                    {".abc@abc.com",false},
                    {"abc()*@gmail.com",false},
                    {"abc@%.com",false},
                    {"abc..2002@gmail.com",false},
                    {"abc.@g.com",false},
                    {"abc@abc@gmail.com",false},
                    {"abc@a.com.21a",false},
                    {"abc@g.cim.au.au",false},
                    {"abc@g.cim.au.au",false}

            });
        }
        @Test
        public void givenEmail_WhenValidOrInvalid_ReturnTrueOrFalse() {
            boolean result = userRegistration.equals(this.email);
            Assert.assertEquals(this.finalResult,result);
        }
    }

}
