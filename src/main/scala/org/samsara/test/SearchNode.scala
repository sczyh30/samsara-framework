package org.samsara.test


import scala.actors.Actor
import scala.collection.immutable.HashMap

/**
 * SearchNode - Actor Model Test
 * @author sczyh30
 *         WARNING:next version we should use akka.Actor.actor instead
 */
trait SearchNode extends Actor {
  type ScoredDocument = (Double, String)
  val index: HashMap[String, Seq[ScoredDocument]] = null

  override def act = Actor.loop {
    react {
      case SearchQuery(query, maxResults) =>
        reply(index.getOrElse(query, Seq().take(maxResults)))
    }

  }
}
