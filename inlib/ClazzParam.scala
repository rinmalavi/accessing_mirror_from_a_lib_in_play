package inlib

import scala.reflect.runtime.universe._

trait ClazzAbs

trait Repo[ClazzAbs]

trait ClazzParam

class ClazzParamImpl extends ClazzParam {}

object Name {

  val mirror = runtimeMirror(getClass.getClassLoader)

  def apply[t: TypeTag]: String = {
    typeOf[t] match {
      case TypeRef(_, sym, args) if args.isEmpty =>
        mirror.runtimeClass(sym.asClass).getCanonicalName

      case TypeRef(_, sym, args) =>
        val symClass = mirror.runtimeClass(sym.asClass)
        val typeArgs = args.map(t => mirror.runtimeClass(t).getCanonicalName)
        symClass.getCanonicalName + typeArgs.mkString("[", ",", "]")

      case _ =>
        "Not a TypeRef"
    }
  }
}