
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/geekstay/Github/Personal/scala-micro-service-user/conf/routes
// @DATE:Sun Mar 12 12:37:33 CET 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
