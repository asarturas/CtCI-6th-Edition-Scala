package chapter01

object CheckPermutation {
  def checkPermutation(one: String, other: String): Boolean =
    if (one.isEmpty && other.isEmpty) true
    else if (one.length != other.length) false
    else one.sorted == other.sorted
}