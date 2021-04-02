/* Property of Gifted Concepts LLC. */
package com.myorganization.sprocket.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author Tim Richard
 */
@Constraint(validatedBy = EntityElementGeneralInputValidator.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EntityElementGeneralInput {

    boolean allowNull();

    Class<?>[] groups() default {};

    String label();

    int maxLength();

    String message() default "{com.giftedconcepts.validator.invalid.element.text}";

    Class<? extends Payload>[] payload() default {};

    String type();
}
