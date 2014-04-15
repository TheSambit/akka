/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */
package akka.stream

import akka.actor.ActorSystem
import org.testng.annotations.AfterClass
import akka.testkit.AkkaSpec

trait WithActorSystem {
  def system: ActorSystem

  @AfterClass
  def shutdownActorSystem(): Unit = system.shutdown()
}