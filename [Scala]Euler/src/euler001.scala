/**
  * Created by chyun on 2017. 1. 22..
  */
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
