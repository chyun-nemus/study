/**
  * Created by chyun on 2017. 1. 22..
  */

//10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
//1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

object euler001 extends App {
  solution01
  solution02
  solution2stepbystep

  def solution01: Unit = {
    val lastNum = 1000
    var sum = 0
    for (
      i <- 1 until lastNum
      if (i % 3 == 0) || (i % 5 == 0)
    ) {
      sum += i
    }
    println(sum)
  }

  def solution02: Unit = {
    println(0 until 1000 filter(i => i%3==0 || i%5==0) sum)
  }

  def solution2stepbystep: Unit = {
    val starttime = java.lang.System.currentTimeMillis()
    val range = 0 until 1000
    val indexedSeq = range.filter(i => i%3==0 || i%5==0)
    val answer = indexedSeq.sum
    println(answer)

  }
}
