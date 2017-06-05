package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question02Spec extends FlatSpec with Matchers {

  import CheckPermutation._

  "check permutation" should "return true when both strings are empty" in {
    checkPermutation("", "") should be(true)
  }

  it should "return true when strings are identical" in {
    checkPermutation("abc", "abc") should be(true)
  }

  it should "return true when one string is other strings permutation" in {
    checkPermutation("asdf", "fdas") should be(true)
    checkPermutation("fdas", "asdf") should be(true)
  }

  it should "return false when string are of different length" in {
    checkPermutation("abc", "abcd") should be(false)
    checkPermutation("abcd", "abc") should be(false)
  }
}
