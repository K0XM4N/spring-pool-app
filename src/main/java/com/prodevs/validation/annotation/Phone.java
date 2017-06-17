package com.prodevs.validation.annotation;

import com.prodevs.validation.PhoneValidator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

import javax.validation.Constraint;

/**
 * Created by Krzysztof on 2017-06-18.
 */
@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ METHOD, FIELD, CONSTRUCTOR, PARAMETER, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface Phone {
}
