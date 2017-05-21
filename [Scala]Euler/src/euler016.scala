/**
  * Created by chyun on 2017. 5. 21..
  */
//2^15 = 32768 의 각 자리수를 더하면 3 + 2 + 7 + 6 + 8 = 26 입니다.
//2^1000의 각 자리수를 모두 더하면 얼마입니까?
object euler016 extends App {

  println(solution01(1000))

  def solution01(value: Int): Int = {
    val num = BigInt(2).pow(value).toString().map(_.asDigit)
    return num.sum
  }
}
