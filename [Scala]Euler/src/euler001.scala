/**
  * Created by chyun on 2017. 1. 22..
  */
object euler001 extends App{
  val lastNum = 100
  var sum = 0
  for (
    i <-1 to lastNum
    if (i % 3 == 0) || (i % 5 == 0)
  ) {
    sum += i
    print(i+" ")
  }
  println("\nResult: "+sum)
}
