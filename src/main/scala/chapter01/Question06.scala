package chapter01

/**
  * Any string less than 2 characters is not compressed.
  * Build a counts data structure, where every chain of repeated chars is represented with (char, count).
  * If all counts are 1 - return original string, otherwise - convert it to a string.
  */

object StringCompression {

  def compress(str: String): String = {
    if (str.length <= 1) str
    else {
      val counts = countChars(str.tail.toList, (str.head, 1), List.empty)
      if (counts.forall(_._2 == 1)) str
      else charCountsToString(counts)
    }
  }

  type CharCount = (Char, Int)

  private def countChars(str: List[Char], currentCount: CharCount, allCounts: List[CharCount]): List[CharCount] =
    str match {
      case first :: rest =>
        if (first == currentCount._1) countChars(rest, (currentCount._1, currentCount._2 + 1), allCounts)
        else countChars(rest, (first, 1), allCounts :+ currentCount)
      case Nil =>
        allCounts :+ currentCount
    }

  private def charCountsToString(counts: List[CharCount], prefix: String = ""): String = counts match {
    case (char, count) :: tail => charCountsToString(tail, prefix + char + count)
    case Nil => prefix
  }

}