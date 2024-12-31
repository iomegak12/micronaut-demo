package com.intsol;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import jakarta.inject.Singleton;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import io.micronaut.context.annotation.Value;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;

@OpenAPIDefinition(info = @Info(title = "IntSol Customer Services", version = "1.0.0", description = "Simple POC to Demonstrate how Micronaut Works", license = @License(name = "MIT", url = "https://license.intsol.in"), contact = @Contact(url = "https://github.com/iomegak12/", name = "Ramkumar J Dhamodharan", email = "jd.ramkumar@gmail.com")))
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Singleton
    static class OnStartupEventListener implements ApplicationEventListener<StartupEvent> {

        @Value("${datasources.default.url}")
        private String datasourcesDefaultUrl;

        @Override
        public void onApplicationEvent(StartupEvent event) {
            log.warn("Database URL is : " + datasourcesDefaultUrl);
        }

        public String getdatasourcesDefaultUrl() {
            return datasourcesDefaultUrl;
        }

        public void setdatasourcesDefaultUrl(String datasourcesDefaultUrl) {
            this.datasourcesDefaultUrl = datasourcesDefaultUrl;
        }
    }
}