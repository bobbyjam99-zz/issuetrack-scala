package repo

import model.TicketStatus.Fixed
import model.{Bug, Issue, Ticket}

object TicketRepo {
  private var map: Map[TicketId, Ticket] = Map(
    1L -> Issue(1L, "画面を作る"),
    2L -> Bug(2L, "ジョジョのセリフが違う", "ピザ食べたいジョ"),
    3L -> Issue(3L, "データベースを作る", Fixed),
    4L -> Bug(4L, "画像が違う", "ぬこ画像はよ!!", Fixed)
  )

  def findAll(): Seq[Ticket] = {
    map.values.toSeq.sortBy(_.id)
  }

  def findById(id: TicketId): Option[Ticket] = {
    map.get(id)
  }
}
