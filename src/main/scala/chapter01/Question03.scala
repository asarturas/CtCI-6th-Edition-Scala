package chapter01

object UrlifyManually {
  def urlify(str: String): String = {
    def iter(str: String, acc: String = ""): String = {
      if (str.isEmpty) acc
      else {
        val head = str.head
        if (head == ' ') iter(str.tail, acc + "%20")
        else iter(str.tail, acc + head)
      }
    }
    iter(str)
  }
}

object UrlifyWithStdLib {
  def urlify(str: String): String = str.replace(" ", "%20")
}