package chapter01

/**
  * If stings length differs by more than one - it's not one away.
  * Iterate through both strings checking for matches.
  * If no match - skip on both for strings of same length, skip longer one for strings of different length.
  */

object OneAway {
  def oneAway(one: String, other: String): Boolean = {
    if (math.abs(one.length - other.length) > 1) false
    else oneChangeAway(one, other)
  }

  private def oneChangeAway(one: String, other: String, tolerance: Int = 1): Boolean = {
    if (tolerance < 0) false
    else if (one.isEmpty) tolerance == 0
    else if (one.head == other.head) // matches
      oneChangeAway(one.tail, other.tail, tolerance)
    else if (one.length == other.length) // char is different
      oneChangeAway(one.tail, other.tail, tolerance - 1)
    else { // char is missing
      val (shorter, longer) = if (one.length < other.length) (one, other) else (other, one)
      oneChangeAway(shorter, longer.tail, tolerance - 1)
    }
  }
}