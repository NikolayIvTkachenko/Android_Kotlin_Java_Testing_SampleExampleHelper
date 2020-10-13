package com.rsh_engineering.tkachenkoni.appusetestingsample;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
class PasswordUtil {

    public static boolean isStrongPassword(String value){
        if (value.length() < 7) return false;
        if (!value.matches(".*[A-Z].*")) return false;
        if (!value.matches(".*[0-9].*")) return false;

        return true;
    }

}
