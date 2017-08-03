package com.prodevs.validation.annotation;

import com.prodevs.validation.validator.ReTypedPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Krzysztof on 2017-08-03.
 */
@Documented
@Target({ElementType.FIELD})
@Constraint(validatedBy = ReTypedPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReTypedPassword {

    String message() default "Passwords are not the same!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
