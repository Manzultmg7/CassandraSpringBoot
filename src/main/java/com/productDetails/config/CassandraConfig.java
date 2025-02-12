package com.productDetails.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {


    @Value("${spring.cassandra.keyspace-name}")
    private String keyspaceName;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }
    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    protected String getContactPoints() {
        return "127.0.0.1";
    }

    @Override
    protected int getPort() {
        return 9042;
    }
    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.productDetails"};
    }
}
