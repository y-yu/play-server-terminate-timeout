package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(
  cc: ControllerComponents
) extends AbstractController(cc) {
  def index(sleepSeconds: Option[Int]): Action[AnyContent] = Action {
    sleepSeconds foreach { seconds =>
      Thread.sleep(seconds * 1000)
    }
    Ok("OK\n")
  }
}
