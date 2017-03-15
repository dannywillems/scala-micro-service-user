package database

import models.{Types, User}

import java.sql.{ResultSet, SQLException}

import play.api.db._

object UserDb {
  def create(
    db : Database,
    main_email : String,
    password : String,
    firstname : String,
    lastname : String,
    avatar : String
  ) : Types.userid = {
    val connection = db.getConnection()
    try {
      UserQuery.create(
        connection,
        main_email,
        password,
        firstname,
        lastname,
        avatar
        )
    }
    finally {
      connection.close()
    }
  }
}
