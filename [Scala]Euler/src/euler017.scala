/**
  * Created by chyun on 2017. 5. 29..
  */
//1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고,
//각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다.
//
//1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?
//
//참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다.
//예를 들어 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
//115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.
object euler017 extends App {
  val one2nineteen: List[String] = List("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
  val deca: List[String] = List("", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
  val etc: List[String] = List("hundred", "thousand", "and")

  println(solution01(1000))

  def solution01(index: Int): Long = {
    val count = List(0 to index: _ *).view.map(convert(_)).map(_.length).sum
    return count
  }

  def convert(num: Int): String = {
    if (num < 20) return one2nineteen(num)
    else if (num < 100) return deca(num / 10) + one2nineteen(num % 10)
    else if (num == 1000) return one2nineteen(1) + etc(1)
    else one2nineteen(num / 100) + etc.head + (if (num % 100 > 0) etc.last + convert(num % 100) else 0)
  }
}
