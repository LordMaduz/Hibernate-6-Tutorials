package com.hibernate.naming.strategy;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomSuffixPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    @Override
    public Identifier toPhysicalTableName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return getIdentifier(identifier, "_Table");
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment context) {
        return getIdentifier(identifier, "_column");
    }

    private Identifier getIdentifier(final Identifier identifier, final String suffix) {
        if (identifier == null) {
            return null;
        }

        final String newName = identifier.getText() + suffix;
        return Identifier.toIdentifier(newName);
    }
}