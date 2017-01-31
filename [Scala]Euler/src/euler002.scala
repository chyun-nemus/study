/**
  * Created by chyun on 2017. 1. 27..
  */

//피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

object euler002 extends App {
  solution01

  def solution01: Unit = {
    val limit = 40000000
    var value1 = 1
    var value2 = 2
    var sum = 0
    var i = fibo(value1, value2)

    while(i < limit) {
      if (i % 2 == 0) sum += i
      value1 = value2
      value2 = i
      i = fibo(value1, value2)
    }
    print(sum)
  }

  def fibo (value1: Int, value2: Int): Int = value1 + value2

}