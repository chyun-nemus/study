/**
  * Created by chyun on 2017. 4. 9..
  */
//1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
//예를 들어 7번째 삼각수는 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28이 됩니다.
//500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?
object euler012 extends App {
  print(solution001(500))

  def solution001(index: Int): Int = {
    var num = 0
    var natual = 0
    var count = 0
    while (count < index) {
      num += 1
      natual = (0 to num).sum
      count = (1 to math.sqrt(natual).toInt).filter(natual % _ == 0).flatMap(n => List(n, natual / n).distinct).length
    }
    return natual
  }
}
