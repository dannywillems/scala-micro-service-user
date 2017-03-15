# scala-micro-service-user

Micro service for basic user management through a REST API, written in Scala and
using PostgreSQL.
Users are identified by email.

## Implementation choices.

- The REST API doesn't give you access to the password. The password is never
  returned. It implies that nobody can have access the passwords, even if your
  API is opened.

## REST API

- `POST /create`: create a user and return the generated ID.
- `GET /check`: check if the given email and password match.
- `GET /exists`: return true if the given email exists.
- `PUT /update`: update the given user information.
- `PUT /update_password`: update the password for the given user.
- `GET /user`: update the user with the given email.

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

## TODO

- [ ] User email as an unique identifier is maybe too restrictive. By the way, the
  current implementation doesn't care about the validity of the email because
  it's simply a string. We can imagine rename `email` to `identifier` or
  something more general.
- [ ] Add (optional) security things like JWT in the header or something to
  identify the user of the API.
  Security must be optional in the case of the developer doesn't want to have
  security (for example during an hackathon).
