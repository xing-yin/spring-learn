package com.alan.yx.springInAction.Chapter_09.thymeleaf.src.main.java.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = {"com.alan.yx.springInAction.Chapter_09.thymeleaf.src.main.java.spittr"},
        excludeFilters = {@Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("spittr\\.web"));
        }
    }
}
