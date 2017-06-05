package chapter01

/**
  * Empty strings are permutations.
  * Strings of different length are not permutations.
  * When sorted strings match - then they are permutations.
  */

object CheckPermutation {
  def checkPermutation(one: String, other: String): Boolean =
    if (one.isEmpty && other.isEmpty) true
    else if (one.length != other.length) false
    else one.sorted == other.sorted
}