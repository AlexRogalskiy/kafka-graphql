package com.scigility.graphql.sample.fields;

import com.merapar.graphql.GraphQlAutoConfiguration;
import com.scigility.graphql.sample.dataFetchers.RoleDataFetcher;
import com.scigility.graphql.sample.dataFetchers.UserDataFetcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GraphQlAutoConfiguration.class)
public class UserFieldsTestConfiguration {

    @Bean
    public UserDataFetcher userDataFetcher() {
        return new UserDataFetcher();
    }

    @Bean
    public UserFields userFields() {
        return new UserFields();
    }

    @Bean
    public RoleDataFetcher roleDataFetcher() {
        return new RoleDataFetcher();
    }

    @Bean
    public RoleFields roleFields() {
        return new RoleFields();
    }
}
