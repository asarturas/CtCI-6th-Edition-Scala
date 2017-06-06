package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question05Spec extends FlatSpec with Matchers {

  import OneAway._

  "one away" should "be false for strings, which are very different in length (2 or more)" in {
    oneAway("one", "o") should be (false)
    oneAway("o", "one") should be (false)
  }

  it should "be true for strings, which size is the same, and difference is only one char" in {
    oneAway("one", "ome") should be(true)
    oneAway("ome", "one") should be(true)
  }

  it should "be false for strings, which are same by size and differ by more than one character" in {
    oneAway("om nom nom", "om non non") should be(false)
  }

  it should "be false for already identical strings" in {
    oneAway("one", "one") should be(false)
  }

  it should "be true for strings, where one is missing just one character from another" in {
    oneAway("one", "oe") should be (true)
    oneAway("oe", "one") should be (true)
  }
}
