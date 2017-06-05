package chapter01

/**
  * Assume empty string is palindrome permutation.
  * Assume we can ignore spaces.
  * String is palindrome permutation when it contains all chars twice.
  * Odd length string should have one of chars only once.
  */

object PalindromePermutation {
  def palindromePermutation(str: String): Boolean = {
    val filteredStr = str.filterNot(_ == ' ')
    val counts = charCounts(filteredStr)
    if (even(filteredStr.length)) {
      counts.forall(even)
    } else {
      counts.count(odd) == 1 && counts.filterNot(odd).forall(even)
    }
  }

  private def charCounts(str: String, acc: Map[Char, Int] = Map.empty): Iterable[Int] =
    if (str.isEmpty) acc.values
    else {
      val ch = str.head
      val chCount = if (acc.contains(ch)) acc(ch) + 1 else 1
      charCounts(str.tail, acc + (ch -> chCount))
    }

  private def even(n: Int): Boolean = n % 2 == 0
  private def odd(n: Int): Boolean = n % 2 == 1
}
