package controllers.ckfinder

import javax.inject.Inject
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.{Action, Controller}
import play.twirl.api.Html
import scala.concurrent.Future
import scala.language.postfixOps

class CKFinderController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  /** Handles unauthenticated user actions. */
  def index = Action.async { implicit request =>
    Future.successful(Ok(views.html.index()))
  }
}

