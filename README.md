# scala-micro-service-user

Micro service for basic user management, written in Scala and using PostgreSQL.

## Configuration.

- `db.default.url`: the database URL with the following syntax
  `jdbc:postgresql://HOST:PORT/database`. For example,
  `jdbc:postgresql://localhost:3000/my_project`.
- `db.default.username`: the username for the database. For example: `$USER`
  (for the current session user).
- `db.default.password`: the password of the user. For example: `my_project`.

## Database

A Makefile is provided to create a cluster, a database and the
required tables. You can also drop, delete, start, stop the database and use
`psql` to see tables. The Makefile is well documented about the available targets.
The configuration for the database like the user, the password, the database name, etc are given in `Makefile.conf`.

Use the following commands to initialize and create the database:
```Shell
make db-init
make db-create
make db-schema
```

#### Run the service

If you use the default provided configuration, you can use the following command:
```Shell
sbt ~Dconfig.file=my_project_test.conf ~run
```

## Use Docker.

### With a PostgreSQL container.

### Built-in PostgreSQL
