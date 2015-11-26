package controllers.ckfinder

import javax.inject.Inject
import play.api.i18n.MessagesApi
import scala.concurrent.Future

class CKFinderController @Inject() (
  val messagesApi: MessagesApi,
  val env: Environment[User, CookieAuthenticator],
  socialProviderRegistry: SocialProviderRegistry)
  extends Silhouette[User, CookieAuthenticator] {

  /** Handles unauthenticated user actions. */
  def index = UserAwareAction.async { implicit request =>
    Future.successful(Ok(views.html.openHome(request.identity)))
  }
}

