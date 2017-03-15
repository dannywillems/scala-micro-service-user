package controllers

import play.api.mvc._

import play.api.libs.json.Json

import play.api.Logger

import play.api.db.Database

import database.{UserDb}

import javax.inject.Inject

class UserController @Inject () (db : Database)
    extends Controller
{
  def create =
    Action { request ⇒
      val json = request.body.asJson.get
      val userid = UserDb.create(
        db,
        (json \ "main_email").as[String],
        (json \ "password").as[String],
        (json \ "firstname").as[String],
        (json \ "lastname").as[String],
        (json \ "avatar").as[String]
      )
      Ok(userid.toString)
    }

  /** Check if the given email and password match. */
  def check =
    Action { request ⇒
      Ok("Check")
    }

  def exists =
    Action { request ⇒
      Ok("Exist")
    }

  def update =
    Action { request ⇒
      Ok("Updated")
    }

  def update_password =
    Action {
      Ok("Password updated")
    }

  def user =
    Action { request ⇒
      Ok("Get user information based on ID")
    }
}
