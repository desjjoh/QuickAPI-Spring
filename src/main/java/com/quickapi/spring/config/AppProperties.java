package com.quickapi.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Validated
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    @NotBlank(message = "App name must not be blank")
    private String name;

    @NotBlank(message = "Environment must not be blank")
    @Pattern(
        regexp = "^(dev|staging|production)$",
        message = "Environment must be one of: dev, staging, production"
    )
    private String environment;

    @NotBlank(message = "Base URL must not be blank")
    @Pattern(
        regexp = "^(http|https)://.*$",
        message = "URL must start with http:// or https://"
    )
    private String url;

    @NotNull(message = "Debug flag is required")
    private Boolean debug;

    @Min(value = 1024, message = "Port must be >= 1024")
    @Max(value = 65535, message = "Port must be <= 65535")
    private int port;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }

    public Boolean getDebug() { return debug; }
    public void setDebug(Boolean debug) { this.debug = debug; }
}
