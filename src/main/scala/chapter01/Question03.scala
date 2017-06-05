package chapter01

/**
  * Iterate through string building the other one (adding "%20" instead of space).
  */

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