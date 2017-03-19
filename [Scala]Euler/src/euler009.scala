/**
  * Created by chyun on 2017. 3. 19..
  */
//세 자연수 a, b, c 가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
//예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2이므로 3, 4, 5는 피타고라스 수입니다.
//a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
object euler009 extends App {
  println(solution01(1000))

  def solution01(value: Int): Int = {
    val vactor = (for (
      a <- (1 to value - 3);
      b <- (a until value);
      c = (value - a - b);
      if (a * a + b * b == c * c)
    ) yield a * b * c)
    if (vactor.size > 0) vactor(0)
    else error("can't find")
  }

  def error(message: String): Nothing = {
    throw new RuntimeException(message)
  }
}