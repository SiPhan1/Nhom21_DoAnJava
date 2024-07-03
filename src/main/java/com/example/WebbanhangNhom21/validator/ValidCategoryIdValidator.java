package com.example.WebbanhangNhom21.validator;

import com.example.WebbanhangNhom21.model.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext constraintValidatorContext) {
        return category!=null && category.getId()!=null;
    }
}
