/**
  * Created by chyun on 2017. 3. 26..
  */
// 10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
// 이백만(2,000,000) 이하 소수의 합은 얼마입니까?
object euler010 extends App {
  println("result: " + solution01(2000000))

  def solution01(index: Long): Long =
    (2L to index).filter(isPrime(_)).sum

  def isPrime(n: Long): Boolean =
    n >= 2 && (2 to math.sqrt(n).toInt).forall(n%_ != 0)
}
