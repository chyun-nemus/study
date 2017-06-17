/**
  * Created by chyun on 2017. 6. 17..
  */
// n! 이라는 표기법은 n × (n − 1) × ... × 3 × 2 × 1을 뜻합니다.
//
// 예를 들자면 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 이 되는데,
// 여기서 10!의 각 자리수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27 입니다.
//
// 100! 의 자리수를 모두 더하면 얼마입니까?
object euler020 extends App {

  println(solution01(100))

  def solution01(index: Int) : Int = {
    return fact(index).toString().view.map(_.asDigit).sum
  }

  def fact(n: BigInt): BigInt = if (n < 2) 1 else n * fact(n - 1)
}
