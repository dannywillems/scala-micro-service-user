/*
 All tables about ads are given in the schema ads.

 In this schema, three tables are defined:
 - ads. It contains all information about ads like the advertiser, the initial
   number of token for budget, the initial price, etc. The targeted profile is
   registered as jsonb. See
   https://www.postgresql.org/docs/9.4/static/datatype-json.html for the reason
   for using jsonb instead of json. The JSON fields is the same than the user
   profile except than targeted ages are given as a list of couple and field
   about main function is a list.

 - availability. Contains information about the availability of an ad. The field
   available has the value [true] if the ad is still available, else [false].
   [remainingTokenBudget] (resp. [remainingTokenTime]) contains the number of
   remaining token for the budget (resp. time).
   Singular is used for table names.

 - advertiser. Contains information about the advertiser. TODO
*/


CREATE EXTENSION citext; --DEFAULT

CREATE SCHEMA IF NOT EXISTS users;

CREATE TABLE IF NOT EXISTS users.user (
  userid                 bigserial            primary key,
  main_email             citext               NOT NULL,
  password               text                 NOT NULL,
  firstname              text,
  lastname               text,
  avatar                 text
);
