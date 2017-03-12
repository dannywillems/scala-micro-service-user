
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/geekstay/Github/Personal/scala-micro-service-user/conf/routes
// @DATE:Sun Mar 12 12:37:33 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  UserController_0: controllers.UserController,
  // @LINE:17
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UserController_0: controllers.UserController,
    // @LINE:17
    Assets_1: controllers.Assets
  ) = this(errorHandler, UserController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.user"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exists""", """controllers.UserController.exists"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """check""", """controllers.UserController.check"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.UserController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UserController_create0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_UserController_create0_invoker = createInvoker(
    UserController_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """ An example controller showing a sample home page""",
      this.prefix + """create"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_user1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_user1_invoker = createInvoker(
    UserController_0.user,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "user",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_exists2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exists")))
  )
  private[this] lazy val controllers_UserController_exists2_invoker = createInvoker(
    UserController_0.exists,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "exists",
      Nil,
      "GET",
      """""",
      this.prefix + """exists"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_check3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("check")))
  )
  private[this] lazy val controllers_UserController_check3_invoker = createInvoker(
    UserController_0.check,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "check",
      Nil,
      "POST",
      """""",
      this.prefix + """check"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_UserController_update4_invoker = createInvoker(
    UserController_0.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Nil,
      "PUT",
      """""",
      this.prefix + """update"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_UserController_create0_route(params) =>
      call { 
        controllers_UserController_create0_invoker.call(UserController_0.create)
      }
  
    // @LINE:8
    case controllers_UserController_user1_route(params) =>
      call { 
        controllers_UserController_user1_invoker.call(UserController_0.user)
      }
  
    // @LINE:10
    case controllers_UserController_exists2_route(params) =>
      call { 
        controllers_UserController_exists2_invoker.call(UserController_0.exists)
      }
  
    // @LINE:12
    case controllers_UserController_check3_route(params) =>
      call { 
        controllers_UserController_check3_invoker.call(UserController_0.check)
      }
  
    // @LINE:14
    case controllers_UserController_update4_route(params) =>
      call { 
        controllers_UserController_update4_invoker.call(UserController_0.update)
      }
  
    // @LINE:17
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
