package com.prodevs.validation.annotation;

import com.prodevs.validation.validator.DropdownValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Krzysztof on 2017-08-11.
 */
@Documented
@Constraint(validatedBy = DropdownValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Dropdown {

    String message() default "Choose option from dropdown";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
