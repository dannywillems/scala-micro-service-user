package controllers

import play.api.mvc._

import play.api.libs.json.Json

import play.api.{Configuration, Logger}

import play.api.db.Database

class UserController extends Controller
{
  def create =
    Action { request ⇒
      Ok("Created")
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

  def user =
    Action { request ⇒
      Ok("Get user information based on ID")
    }
}
