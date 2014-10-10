package app.repo

import app.model.TicketStatus.Fixed
import app.model.{Bug, Issue, Ticket}
import repo.TicketId

object TicketRepo {
  private var map: Map[TicketId, Ticket] = Map(
    1L -> Issue(1L, "画面を作る"),
    2L -> Bug(2L, "ジョジョのセリフが違う", "ピザ食べたいジョ"),
    3L -> Issue(3L, "データベースを作る", Fixed),
    4L -> Bug(4L, "画像が違う", "ぬこ画像はよ!!", Fixed)
  )
}
