package models

import javax.inject.{Inject, Singleton}
import play.api.Configuration

@Singleton
class Configuration @Inject() (configuration : Configuration) () {
}
