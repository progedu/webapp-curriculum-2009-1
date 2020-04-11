import org.scalatest._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {

  "format" should "数値を 3 桁ごとにカンマ区切りを入れる" in {
    assert(NumberFormatter.format(111222333) === "111,222,333")
    assert(NumberFormatter.format(111) === "111")
    assert(NumberFormatter.format(11) === "11")
    assert(NumberFormatter.format(1112223334) === "111,222,333,4")
  }
}
