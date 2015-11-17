package models

import java.util.concurrent.atomic.AtomicInteger

/**
 * Created by tattsun on 15/11/17.
 */
object HTableRepository {
  val uniqId: AtomicInteger = new AtomicInteger(0)
  val threadId: ThreadLocal[Int] = new ThreadLocal[Int] {
    override def initialValue() = {
      uniqId.getAndIncrement()
    }
  }
}
