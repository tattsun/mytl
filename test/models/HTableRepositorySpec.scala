package models

import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test._
import play.api.test.Helpers._
import play.test.WithApplication


/**
 * Created by tattsun on 15/11/17.
 */
@RunWith(classOf[JUnitRunner])
class HTableRepositorySpec extends Specification {
  "HTableRepository" should {
    "test" in {
      "a" must equalTo("a")
    }
  }
}
