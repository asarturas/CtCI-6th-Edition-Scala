package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question03Spec extends FlatSpec with Matchers {

  import UrlifyManually._

  "urlify" should "keep string unchanged when it doesn't contain a space" in {
    urlify("") should be("")
    urlify("asdf") should be("asdf")
  }

  it should "replace a space at the end" in {
    urlify("asdf ") should be("asdf%20")
  }

  it should "replace few spaces in beginning, middle and the end of the string" in {
    urlify(" asd f ") should be("%20asd%20f%20")
  }

  it should "replace few consecutive spaces" in {
    urlify("as  df") should be("as%20%20df")
  }

  "std lib implementation" should "pass all the cases" in {
    import UrlifyWithStdLib._
    urlify("") should be("")
    urlify("asdf") should be("asdf")
    urlify("asdf ") should be("asdf%20")
    urlify(" asd f ") should be("%20asd%20f%20")
    urlify("as  df") should be("as%20%20df")
  }

}
