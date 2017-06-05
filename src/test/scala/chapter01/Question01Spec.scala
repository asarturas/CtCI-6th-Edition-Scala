package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question01Spec extends FlatSpec with Matchers {

  import IsUniqueCustom._

  it should "empty string should be unique" in {
    isUnique("") should be(true)
  }

  it should "be unique in case of single character in a string" in {
    isUnique("a") should be(true)
  }

  it should "be unique for simple 'abc' case" in {
    isUnique("abc") should be(true)
  }

  it should "not be unique when first letter is repeated twice" in {
    isUnique("aabc") should be (false)
  }

  it should "not be unique when last letter is repeated twice" in {
    isUnique("abcc") should be(false)
  }

  it should "not be unique when some middle letter is repeated (not consecutive)" in {
    isUnique("abcbd") should be(false)
  }

  "solution using std lib" should "pass all the tests custom case is passing" in {
    import IsUniqueWithStdLib._
    isUnique("abc") should be(true)
    isUnique("aabc") should be (false)
    isUnique("abcc") should be (false)
    isUnique("abcbd") should be(false)
  }
}
