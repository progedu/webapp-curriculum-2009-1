import org.scalatest._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {

  "formatメソッド" should "数値に3桁ごとのカンマ区切りを入れる" in {
    assert(NumberFormatter.format(123123123) === "123,123,123")
    assert(NumberFormatter.format(-123123123) === "-123,123,123")
  }

}

