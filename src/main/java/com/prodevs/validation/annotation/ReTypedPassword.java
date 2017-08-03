package com.prodevs.validation.annotation;

import com.prodevs.validation.validator.ReTypedPasswordValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * Created by Krzysztof on 2017-08-03.
 */
@Documented
@Target({ElementType.FIELD})
@Constraint(validatedBy = ReTypedPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReTypedPassword {
}
