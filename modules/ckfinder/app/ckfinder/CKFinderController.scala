package ckfinder

import javax.inject.Inject

import play.api.mvc.{Action, Controller}

import scala.concurrent.Future
import scala.language.postfixOps

class CKFinderController @Inject() extends Controller {

  /** Handles unauthenticated user actions. */
  def index = Action { implicit request =>
    Future.successful(Ok(views.html.index(request.identity)))
  }
}

