package com.bdatacap.concurrency.async.article4

// https://github.com/dsosnoski/concur4
// https://www.ibm.com/developerworks/cn/java/j-jvmc4/index.html?mhsrc=ibmsearch_a&mhq=Scala%20%E5%BC%82%E6%AD%A5

import scala.concurrent._
import scala.concurrent.duration._
import scala.async.Async._
import scala.concurrent.ExecutionContext.Implicits.global

object AsyncHappy extends App {

  import ExecutionContext.Implicits.global

  // task definitions
  def task1(input: Int) = TimedEvent.delayedSuccess(1, input + 1)

  def task2(input: Int) = TimedEvent.delayedSuccess(2, input + 2)

  def task3(input: Int) = TimedEvent.delayedSuccess(3, input + 3)

  def task4(input: Int) = TimedEvent.delayedSuccess(1, input + 4)

  /** Run tasks with block waits. */
  def runBlocking() = {
    val v1 = Await.result(task1(1), Duration.Inf)
    val future2 = task2(v1)
    val future3 = task3(v1)
    val v2 = Await.result(future2, Duration.Inf)
    val v3 = Await.result(future3, Duration.Inf)
    val v4 = Await.result(task4(v2 + v3), Duration.Inf)
    val result = Promise[Int]
    result.success(v4)
    result.future
  }

  /** Run tasks with callbacks. */
  def runOnSuccess() = {
    val result = Promise[Int]
    task1(1).onSuccess {
      case v1 => {
        val a = task2(v1)
        val b = task3(v1)
        a.onSuccess {
          case v2 =>
            b.onSuccess {
              case v3 => task4(v2 + v3).onSuccess {
                case x => result.success(x)
              }
            }
        }
      }
    }
    result.future
  }

  /** Run tasks with flatMap. */
  def runFlatMap() = {
    task1(1) flatMap { v1 =>
      val a = task2(v1)
      val b = task3(v1)
      a flatMap { v2 =>
        b flatMap { v3 => task4(v2 + v3) }
      }
    }
  }

  def timeComplete(f: () => Future[Int], name: String) {
    println("Starting " + name)
    val start = System.currentTimeMillis
    val result = Await.result(f(), Duration.Inf)
    val time = System.currentTimeMillis - start
    println(name + " returned " + result + " in " + time + " ms.")
  }

  // start
  timeComplete(runBlocking, "runBlocking")
  timeComplete(runOnSuccess, "runOnSuccess")
  timeComplete(runFlatMap, "runFlatMap")

  // force everything to terminate
  System.exit(0)
}