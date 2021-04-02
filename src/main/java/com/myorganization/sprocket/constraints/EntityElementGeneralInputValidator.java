/* Property of Gifted Concepts LLC. */
package com.myorganization.sprocket.constraints;

import org.owasp.esapi.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Tim Richard
 */
@Component
public class EntityElementGeneralInputValidator
        implements ConstraintValidator<EntityElementGeneralInput, String> {

    private boolean allowNulls;

    private String label;

    private int maxLength;

    private String type;

    private final Validator validator;

    @Autowired
    public EntityElementGeneralInputValidator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void initialize(
            final EntityElementGeneralInput constraintAnnotation) {
        allowNulls = constraintAnnotation.allowNull();
        label = constraintAnnotation.label();
        maxLength = constraintAnnotation.maxLength();
        type = constraintAnnotation.type();
    }

    @Override
    public boolean isValid(final String inputString,
                           final ConstraintValidatorContext context) {

        final boolean isValid = validator.isValidInput(label, inputString, type,
                maxLength, allowNulls);

        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(
                    label + " has failed validation using the following text: "
                            + inputString)
                    .addConstraintViolation();
        }

        return isValid;
    }

}
