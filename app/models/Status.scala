package models

import play.api.libs.json.Json

/**
 * Created by tattsun on 15/11/17.
 */
case class Status(statusId: String,
                  userId: String,
                  text: String) {
}
object Status {
  implicit def jsonWrites = Json.writes[Status]
  implicit def jsonReads = Json.reads[Status]
}
