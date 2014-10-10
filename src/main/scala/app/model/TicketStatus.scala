package app.model

sealed class TicketStatus {}

object TicketStatus {

  object Open extends TicketStatus

  object Fixed extends TicketStatus

}
