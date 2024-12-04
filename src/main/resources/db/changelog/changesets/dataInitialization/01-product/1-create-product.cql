-- liquibase formatted cql
--changeset manjul.tamang:1

--preconditions onFail:CONTINUE onError:HALT
CREATE TABLE IF NOT EXISTS product (
                         id UUID PRIMARY KEY,
                         name TEXT,
                         category TEXT,
                         description TEXT,
                         image TEXT
);