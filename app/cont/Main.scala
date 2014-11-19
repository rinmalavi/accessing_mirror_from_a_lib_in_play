package cont

import inlib._
import insrc._

import play.api.mvc.{ Action, Controller }

object Main extends Controller {

  def index = Action{
    Ok(resolveC)
  }

  def p = Action{
    Ok(resolveClazzWithParam)
  }

  def r = Action{
    Ok(resolveRepo)
  }

  def resolveClazzWithParam: String = {
    Name[Clazzp[ClazzParamImpl]]
  }

  def resolveRepo: String = {
    Name[Repo[Clazza]]
  }

  def resolveC: String = {
    Name[Clazz]
  }
}
