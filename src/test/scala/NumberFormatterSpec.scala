import org.scalatest._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {
  import NumberFormatter._

  "format関数" should "数値を3桁ごとにカンマ区切りを入れる" in {
    assert(format(0) == "0")
    assert(format(123) == "123")
    assert(format(123456) == "123,456")
    assert(format(-123) == "-123")
    assert(format(-123456) == "-123,456")
  }
}

