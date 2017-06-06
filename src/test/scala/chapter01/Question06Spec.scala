package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question06Spec extends FlatSpec with Matchers {

  import StringCompression._

  "string compression" should "return an empty string when input is empty string" in {
    compress("") should be("")
  }

  it should "not compress a string with single character" in {
    compress("a") should be("a")
  }

  it should "compress a string when some character repeats" in {
    compress("aaabbcbaa") should be("a3b2c1b1a2")
  }

  it should "return a string itself when no characters repeats" in {
    compress("abc") should be("abc")
  }

}
