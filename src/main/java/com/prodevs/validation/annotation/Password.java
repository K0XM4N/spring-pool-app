package com.prodevs.validation.annotation;

import com.prodevs.validation.PasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
/**
 * Created by Krzysztof on 2017-08-01.
 */
@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {

    String message() default "Password must be between 8-20 alpha-numeric characters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
