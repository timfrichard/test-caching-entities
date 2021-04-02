package com.myorganization.sprocket.config;

import org.owasp.esapi.Encoder;
import org.owasp.esapi.Validator;
import org.owasp.esapi.reference.DefaultEncoder;
import org.owasp.esapi.reference.DefaultValidator;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ValidatorFactory;

@Configuration
public class ValidatorConfig {

    /**
     * OWASP ESAPI encoder.
     *
     * @return Encoder
     */
    @Bean
    public Encoder esapiEncoder() {

        return DefaultEncoder.getInstance();
    }

    /**
     * OWASP ESAPI Validator
     *
     * @returnValidator
     */
    @Bean
    public Validator esapiValidator() {

        return DefaultValidator.getInstance();

    }

    /**
     * @return MessageSource
     */
    @Bean
    public MessageSource messageSource() {
        final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");

        return messageSource;
    }

    @Bean
    public ValidatorFactory validator() {

        final LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource());

        return validator;
    }
}
