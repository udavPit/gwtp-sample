package com.example.gwt.basic.shared;

public class FieldVerifier {

    public static boolean isValidName(String name) {
        return name != null && name.length() > 3;
    }
}
