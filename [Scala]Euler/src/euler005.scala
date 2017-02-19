/**
  * Created by chyun on 2017. 2. 19..
  */

//1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
object euler005 extends App {
  println(solution01)
  println(solution02)

  def solution01: Int = {
    val index = (0 to 20)
    var flag = true
    var find = 0

    for (mValue <- (1 to Int.MaxValue) if (flag)) {
      flag = true

      for (index <- (1 to 20) if (flag)) {
        flag = mValue % index == 0
      }

      if (flag) {
        find = mValue
        flag = false
      } else {
        flag = true
      }
    }

    find
  }

  def solution02: Int = {
    var value1 = 1
    for (value2 <- (2 to 20)) {
      value1 = lcm(value1, value2)
    }
    value1
  }


  def gcd(value1: Int, value2: Int): Int = {
    if (value1 % value2 == 0) value2
    else if (value1 < value2) gcd(value2, value1)
    else gcd(value2, value1 % value2)
  }

  def lcm(value1: Int, value2: Int): Int = {
    val mgcd = gcd(value1, value2)
    value1 * (value2 / mgcd)
  }
}
