package com.sustav.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = {CheckSiteUrlLogic.class})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckSiteUrl {
    String message() default "Wrong site URL";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    int port() default -1;
    String host() default "";
    String protocol() default "";
}
