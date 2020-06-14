import org.scalatest._

class NumberFormatterTest extends FlatSpec {

  import NumberFormatter._

  "format関数" should "数値を3桁ごとにカンマ区切りを入れる" in {
    assert(format(0) === "0")
    assert(format(1) === "1")
    assert(format(-1) === "-1")
    assert(format(100) === "100")
    assert(format(-100) === "-100")
    assert(format(1000) === "1,000")
    assert(format(-1000) === "-1,000")
  }

}
