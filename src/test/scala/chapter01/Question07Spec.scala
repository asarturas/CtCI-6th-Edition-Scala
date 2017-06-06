package chapter01

import org.scalatest.{FlatSpec, Matchers}

class Question07Spec extends FlatSpec with Matchers {

  import RotateMatrix._

  "rotate matrix" should "return empty matrix when passed empty matrix" in {
    val matrix = Array(Array.empty[Int])
    rotate(matrix) should be(matrix)
  }

  it should "return same matrix when matrix size is 1" in {
    val matrix = Array(Array(1))
    rotate(matrix) should be(matrix)
  }

  it should "return turned matrix when passed matrix of size 2" in {
    rotate(
      Array(
        Array(1, 2),
        Array(3, 4)
      )
    ) should be(
      Array(
        Array(3, 1),
        Array(4, 2)
      )
    )
  }

  it should "return turned matrix when passed matrix of size 3" in {
    rotate(
      Array(
        Array(1, 2, 3),
        Array(4, 5, 6),
        Array(7, 8, 9)
      )
    ) should be(
      Array(
        Array(7, 4, 1),
        Array(8, 5, 2),
        Array(9, 6, 3)
      )
    )
  }

  it should "return turned matrix when passed matrix of size 4" in {
    rotate(
      Array(
        Array(1, 2, 3, 4),
        Array(5, 6, 7, 8),
        Array(9, 10, 11, 12),
        Array(13, 14, 15, 16)
      )
    ) should be(
      Array(
        Array(13, 9, 5, 1),
        Array(14, 10, 6, 2),
        Array(15, 11, 7, 3),
        Array(16, 12, 8, 4)
      )
    )
  }

}
