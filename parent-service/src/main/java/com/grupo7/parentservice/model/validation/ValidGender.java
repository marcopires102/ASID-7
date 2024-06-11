package com.grupo7.parentservice.model.validation;

import jakarta.validation.*;

import java.lang.annotation.*;

import com.grupo7.parentservice.model.entity.enums.GenderEnum;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = ValidGenderValidator.class)
public @interface ValidGender {
    GenderEnum[] anyOf();

    String message() default "Invalid Gender";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
