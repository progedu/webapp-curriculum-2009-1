import org.scalatest._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {
  val nf = NumberFormatter

  "format関数" should "数値を３行ごとにカンマ区切りを入れる" in {
    assert(nf.format(100) == "100")
    assert(nf.format(1000) == "1,000")
    assert(nf.format(-100000) == "-100,000")
  }
}

