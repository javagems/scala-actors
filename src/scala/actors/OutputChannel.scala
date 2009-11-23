/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2005-2006, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: OutputChannel.scala 10121 2007-02-27 13:18:00Z phaller $

package scala.actors

/**
 * The <code>OutputChannel</code> trait provides a common interface
 * for all channels to which values can be sent.
 *
 * @version 0.9.4
 * @author Philipp Haller
 */
trait OutputChannel[Msg] {
  def !(msg: Msg): Unit
  def forward(msg: Msg): Unit
}
