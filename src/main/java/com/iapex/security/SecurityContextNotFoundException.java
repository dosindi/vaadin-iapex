package com.iapex.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by iapex on 2017. 5. 11..
 */
public class SecurityContextNotFoundException extends AuthenticationException {

    public SecurityContextNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public SecurityContextNotFoundException(String msg) {
        super(msg);
    }
}
