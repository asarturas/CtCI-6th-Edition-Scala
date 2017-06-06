package chapter01

/**
  * Coordinates transform like this:
  * NewY = (size-1) - OldX
  * NewX = OldY
  */

object RotateMatrix {
  type Matrix[T] = Array[Array[T]]

  def rotate(matrix: Matrix[Int]): Matrix[Int] = {
    if (matrix.length <= 1) matrix
    else {
      (for {
        y <- 0 until matrix.length
        x <- matrix.length - 1 to 0 by -1
      } yield matrix(x)(y)).toArray.grouped(matrix.length).toArray
    }
  }
}
