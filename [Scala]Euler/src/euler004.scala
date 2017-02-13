/**
  * Created by chyun on 2017. 2. 12..
  */

//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

object euler004 extends App {
  println(solution01)

  def solution01: Int = {
    var max = 0

    for(i <- (100 to 999)) {
      for(j <- (100 to 999)) {
        val calcNum = i * j
        if(calcNum.toString == calcNum.toString.reverse && calcNum > max) {
          max = calcNum
          println(i + " x  " + j + " = " + max)
        }
      }
    }
    max
  }
}
