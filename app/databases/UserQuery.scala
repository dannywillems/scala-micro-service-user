package database

import models.{Types, User}

import java.sql.{Connection, PreparedStatement, ResultSet, SQLException, Statement}

object UserQuery {
  def create(
    connection : Connection,
    main_email : String,
    password : String,
    firstname : String,
    lastname : String,
    avatar : String
  ) : Types.userid = {
    val statement : PreparedStatement =
      connection.prepareStatement(
        "INSERT INTO users.user (" +
          "main_email, " +
          "password, " +
          "firstname, " +
          "lastname, " +
          "avatar) " +
          "VALUES(?, ?, ?, ?, ?)",
        Statement.RETURN_GENERATED_KEYS
      )

    statement.setString(0, main_email)
    statement.setString(1, password)
    statement.setString(2, firstname)
    statement.setString(3, lastname)
    statement.setString(4, avatar)

    val generatedKeys : ResultSet = statement.getGeneratedKeys()
    if (generatedKeys.next()) {
      generatedKeys.getLong(1)
    }
    else {
      throw new SQLException("Adding ad failed. No ID obtained.")
    }
  }
}
