package controllers.demo

import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.language.postfixOps
import play.api.mvc.{Action, Controller}

class DemoController @Inject() extends Controller {

  /** Handles unauthenticated user actions. */
  def index = Action { implicit request =>
    Future.successful(Ok(views.html.index(request.identity)))
  }
}

