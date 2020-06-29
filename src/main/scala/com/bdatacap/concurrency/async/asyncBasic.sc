// src/main/scala/progscala2/concurrency/async/async.sc
import scala.async.Async.{async, await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

// do return after 2 second
val valueSync = {
  Thread.sleep(2000)
  1
}

// return immediately
val valueAsync = Future {
  Thread.sleep(2000)
  1
}