import org.specs2.Specification

class CallTest extends Specification {
  def is = s2"""
    ${cont.Main.resolveC === "insrc.Clazz"}
    ${cont.Main.resolveRepo === "inlib.Repo[insrc.Clazza]"}
    ${cont.Main.resolveClazzWithParam === "insrc.Clazzp[inlib.ClazzParamImpl]"}
  """

}
