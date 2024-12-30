package com.intsol;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
        title = "IntSol Customer Services", 
        version = "1.0.0", 
        description = "Simple POC to Demonstrate how Micronaut Works", 
        license = @License(name = "MIT", url = "https://license.intsol.in"), 
        contact = @Contact(url = "https://github.com/iomegak12/", 
        name = "Ramkumar J Dhamodharan", 
        email = "jd.ramkumar@gmail.com")))
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}