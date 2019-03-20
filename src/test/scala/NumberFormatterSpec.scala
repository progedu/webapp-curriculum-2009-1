import org.scalatest._
import NumberFormatter._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {

  "format関数" should "数値を 3 桁ごとにカンマ区切りを入れることができる" in {
    assert(format(1) === "1")
    assert(format(12) === "12")
    assert(format(123) === "123")
    assert(format(1234) === "1,234")
    assert(format(0) === "0")
    assert(format(-1) === "-1")
    assert(format(-12) === "-12")
    assert(format(-123) === "-123")
    assert(format(-1234) === "-1,234")

  }

}

