import org.specs2.Specification
import play.api.http.Status._
import play.api.test.FakeRequest

class RoutesSpec extends Specification {

  def is = s2"""
    test resolve class route            $route
    test resolve class with type param  $routep
    test resolve class repository       $router
  """

  def route = {
    cont.Main.index()(FakeRequest()).map(_.header.status) must equalTo(OK).await
  }

  def routep = {
    cont.Main.p()(FakeRequest()).map(_.header.status) must equalTo(OK).await
  }

  def router = {
    cont.Main.r()(FakeRequest()).map(_.header.status) must equalTo(OK).await
  }
}
