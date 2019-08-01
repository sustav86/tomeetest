package com.sustav.entity;

import java.net.MalformedURLException;
import java.net.URL;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckSiteUrlLogic implements ConstraintValidator<CheckSiteUrl, String> {

    private String protocol;
    private String host;
    private int port;
    private final static String EMPTY_STRING = "";

    @Override
    public void initialize(CheckSiteUrl constraintAnnotation) {
        protocol = constraintAnnotation.protocol();
        host = constraintAnnotation.host();
        port = constraintAnnotation.port();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || EMPTY_STRING.equals(s)) {
            return true;
        }

        URL url;
        try {
            url = new URL(s);
        } catch (MalformedURLException e) {
            return false;
        }

        if (protocol != null && !EMPTY_STRING.equals(protocol) && !protocol.equals(url.getProtocol())) {
            addMessageTemplate(constraintValidatorContext,"invalid protocol");
            return false;
        }

        if (host != null && !EMPTY_STRING.equals(host) && !host.equals(url.getHost())) {
            addMessageTemplate(constraintValidatorContext,"invalid host");
            return false;
        }
        if (port != -1 && port != url.getPort()) {
            addMessageTemplate(constraintValidatorContext,"invalid port");
            return false;
        }

        return true;
    }

    private void addMessageTemplate(ConstraintValidatorContext constraintValidatorContext, String message) {
        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext.buildConstraintViolationWithTemplate(message).addConstraintViolation();
    }
}
