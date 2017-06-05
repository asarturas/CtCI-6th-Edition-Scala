package chapter01

/**
  * Iterate through the string building up an index of existing characters.
  * Before adding new char to the index - check if it already exists there.
  */

object IsUniqueCustom {
  def isUnique(str: String): Boolean = {
    def isUniqueIter(str: String, existingChars: String = ""): Boolean =
      if (str.isEmpty) true
      else {
        val ch = str.head
        if (existingChars.contains(ch)) false
        else isUniqueIter(str.tail, existingChars + ch)
      }
    isUniqueIter(str)
  }
}

object IsUniqueWithStdLib {
  def isUnique(str: String): Boolean = str.distinct == str
}