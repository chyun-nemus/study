/**
  * Created by chyun on 2017-03-04.
  */

//소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
//이 때 10,001번째의 소수를 구하세요.
object euler007 extends App {
  println(solutaion01(10001))

  def solutaion01(index: Int): Int = {
    var count = 0
    for (value <- (1 to Int.MaxValue)) {
      var flag = true
      for (target <- (2 to (math.sqrt(value).toInt)) if (flag)) {
        if (value != target && value % target == 0) {
          flag = false
        }
      }
      if (flag) {
        count += 1
        //println(count +": " + value)
      }
      if (count == index) {
        return value
      }
    }
    return -1
  }


}
