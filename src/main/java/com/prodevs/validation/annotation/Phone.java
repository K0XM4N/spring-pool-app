package com.prodevs.validation.annotation;

import com.prodevs.validation.validator.PhoneValidator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created by Krzysztof on 2017-06-18.
 */
@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ METHOD, FIELD, CONSTRUCTOR, PARAMETER, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface Phone {

    String message() default "Format must be: 333-444-555";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
