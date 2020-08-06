package com.myorganization.sprocket.config;

import com.myorganization.sprocket.SprocketOrdersApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {SprocketOrdersApplication.class})
public class SprocketOrdersTestConfig {
}
