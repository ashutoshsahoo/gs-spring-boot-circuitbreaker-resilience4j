package com.ashu.practice;


import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.method.HandlerMethod;

@SpringBootApplication
public class SpringBootCircuitBreakerResilience4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCircuitBreakerResilience4jApplication.class, args);
    }


//    @Bean
    public OperationCustomizer customGlobalHeaders() {
        return (Operation operation, HandlerMethod handlerMethod) -> {
            // Add a header to each request in swagger-ui
            Parameter missingParam3 = new Parameter()
                    .in(ParameterIn.HEADER.toString())
                    .schema(new StringSchema())
                    .name("header3")
                    .required(true)
                    .description("Example Header")
                    .example("header3");
            operation.addParametersItem(missingParam3);
            return operation;
        };
    }

}
