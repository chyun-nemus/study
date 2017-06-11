/**
  * Created by chyun on 2017. 6. 11..
  */
//다음은 달력에 관한 몇 가지 일반적인 정보입니다 (필요한 경우 좀 더 연구를 해 보셔도 좋습니다).
// * 1901년 1월 1일은 월요일이다.
// * 4월, 6월, 9월, 11월은 30일까지 있고, 1월, 3월, 5월, 7월, 8월, 10월, 12월은 31일까지 있다.
// * 2월은 28일이지만, 윤년에는 29일까지 있다.
// * 윤년은 연도를 4로 나누어 떨어지는 해를 말한다. 하지만 400으로 나누어 떨어지지 않는 매 100년째는 윤년이 아니며, 400으로 나누어 떨어지면 윤년이다
//
//20세기 (1901년 1월 1일 ~ 2000년 12월 31일) 에서, 매월 1일이 일요일인 경우는 총 몇 번입니까?
object euler019 extends App {
  val startYear = 1901
  val start_day = 1
  val month = List(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

  println(solution001(2000))

  def solution001(endYear: Int): Int = {
    var count = 0
    var days = 0
    if (start_day == 0) count += 1
    for (i <- (startYear to endYear)) {
      for (j <- (0 until month.size)) {
        days += (if (i == startYear && j == 0) month(j) + start_day else if (j == 1 && check_leap(i)) month(j) + 1 else month(j))
        if (days % 7 == 0) {
          count += 1
        }
      }
    }
    return count
  }

  def check_leap(year_day: Int): Boolean = {
    return if (year_day % 4 == 0 && (year_day % 100 != 0 || year_day % 400 == 0)) true else false
  }
}
