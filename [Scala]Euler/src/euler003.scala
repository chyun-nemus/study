/**
  * Created by chyun on 2017. 2. 6..
  */

//어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
//예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
//600851475143의 소인수 중에서 가장 큰 수를 구하세요.

object euler003 extends App {
  solution01

  def solution01: Unit = {
    var limit = 600851475143L
    var i = 2L
    while ( i != limit) {
      if ( limit % i == 0 ) {
        limit = limit / i
        println(i)
        i = 2L
      } else {
        i = i + 1
      }
    }
    println(i)
  }

}