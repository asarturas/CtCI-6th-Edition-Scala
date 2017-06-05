package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question04Spec extends FlatSpec with Matchers {

  import PalindromePermutation._

  "palindrome permutation" should "return true for an empty string" in {
    palindromePermutation("") should be(true)
  }

  it should "return true for a single char" in {
    palindromePermutation("a") should be(true)
  }

  it should "return false for a short not palindrome" in {
    palindromePermutation("as") should be(false)
    palindromePermutation("asd") should be(false)
    palindromePermutation("qwertyuioplkjhgfdsa") should be(false)
    palindromePermutation("asassdsddfdffgfggiz") should be(false)
  }

  it should "return true for a two char palindrome permutation" in {
    palindromePermutation("aa") should be(true)
  }

  it should "return true for a long palindrome permutation with even characters" in {
    palindromePermutation("asasdfdffgfgwerwer") should be(true)
  }

  it should "return true for a long palindrome permutation with odd characters" in {
    palindromePermutation("asasdfdffgfgwerrrwe") should be(true)
  }

  it should "not take spaces into account" in {
    palindromePermutation("asas dfd ffg fgwer wer") should be(true)
    palindromePermutation("asas dfdffg fgwe rwe") should be(true)
  }
}
