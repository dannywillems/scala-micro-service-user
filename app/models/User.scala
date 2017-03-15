package models

import play.api.libs.json._

object User {
}

class User(
  val userid : Types.userid,
  val username : String,
  val main_email : String,
  val password : String,
  val firstname : String,
  val lastname : String,
  val avatar : String
) {
  // Password is never sent.
  implicit val toJson : JsObject = Json.obj(
    "userid" → this.userid,
    "username" → this.username,
    "main_email" → this.main_email,
    "firstname" → this.firstname,
    "lastname" → this.lastname,
    "avatar" → this.avatar
  )
}
