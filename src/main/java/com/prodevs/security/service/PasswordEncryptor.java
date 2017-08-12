package com.prodevs.security.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * Created by Krzysztof on 2017-08-11.
 */
@Component
public class PasswordEncryptor {

    public static String hashPassword(String givenPassword){
        return DigestUtils.sha256Hex(givenPassword);
    }
}
