/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2005-2006, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: Service.scala 9110 2006-11-01 16:03:28Z mihaylov $

package scala.actors.remote

trait Service {
  val kernel = new NetKernel(this)
  val serializer: Serializer
  def node: Node
  def send(node: Node, data: Array[Byte]): Unit
}
