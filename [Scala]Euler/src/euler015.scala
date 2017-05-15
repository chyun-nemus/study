/**
  * Created by chyun on 2017. 5. 14..
  */
//  2 × 2 격자의 왼쪽 위 모서리에서 출발하여 오른쪽 아래 모서리까지 도달하는 길은 모두 6가지가 있습니다 (거슬러 가지는 않기로 합니다).
//  그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?
import Array._

object euler015 extends App {
  println(solution001(2, 2))
  println(solution001(20, 20))

  def solution001(x: Int, y: Int): Long = {
    var myMatrix = ofDim[Long](x + 1, y + 1)
    // build a matrix
    for (i <- 0 to x;
         j <- 0 to y) {
      var value = 1L
      if (i > 0 && j > 0) {
        value = myMatrix(i - 1)(j) + myMatrix(i)(j - 1)
      }
      myMatrix(i)(j) = value
    }
    return myMatrix(x)(y)
  }
}
