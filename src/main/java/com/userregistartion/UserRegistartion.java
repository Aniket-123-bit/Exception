package com.userregistartion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistartion {
    //Email
    public boolean validateEmail(String email ) {
        String pattern="^[a-zA-Z0-9]([-._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]" +
                "{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3}){0,1}$";

        Pattern emailPattern = Pattern.compile(pattern);
        Matcher matcher = emailPattern.matcher(email);
        if (matcher.matches())
            return true;
        return false;
    }
}
