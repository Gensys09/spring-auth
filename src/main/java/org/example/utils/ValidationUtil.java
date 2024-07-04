package org.example.utils;

import org.example.model.UserInfoDto;

public class ValidationUtil {

    public static void validateUserAttributes(UserInfoDto userInfoDto) {

        if (userInfoDto.getUsername().length() < 5) {
            throw new IllegalArgumentException("Username must be at least 5 characters long");
        }

        if (userInfoDto.getPassword().length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

//        if (userInfoDto.getEmail() == null || !userInfoDto.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
//            throw new IllegalArgumentException("Email is not valid");
//        }
//
//        if (userInfoDto.getPhoneNumber() == null || userInfoDto.getPhoneNumber().length() != 10) {
//            throw new IllegalArgumentException("Phone number is not valid");
//        }
    }

}

