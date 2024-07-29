package com.gamestore.gamestore.config.flyway;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class BaseFlywayConfiguration {

    @Bean
    public FlywayMigrationInitializer flywayInitializer(DataSource dataSource) {
        return new FlywayMigrationInitializer(
                Flyway.configure()
                        .dataSource(dataSource)
                        .baselineOnMigrate(Boolean.TRUE)
                        .load(), null);
    }
}
