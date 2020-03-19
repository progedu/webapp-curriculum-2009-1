import org.scalatest._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {

  val nf = NumberFormatter

  "format関数" should "値を３桁毎にカンマ(,)で区切った文字列を返す(正数で３の倍数桁を除く)" in {
    assert(nf.format(1) === "1")
    assert(nf.format(12) === "12")
    //assert(nf.format(123) === "123")
    assert(nf.format(1234) === "1,234")
    assert(nf.format(12345) === "12,345")
    //assert(nf.format(123456) === "123,456")
    assert(nf.format(1234567) === "1,234,567")
  }

  "format関数" should "値を３桁毎にカンマ(,)で区切った文字列を返す(正数で３の倍数桁)" in {
    assert(nf.format(123) === "123")
    assert(nf.format(123456) === "123,456")
    assert(nf.format(123456789) === "123,456,789")
  }

  "format関数" should "値を３桁毎にカンマ(,)で区切った文字列を返す(負数で３の倍数桁を除く)" in {
    assert(nf.format(-1) === "-1")
    assert(nf.format(-12) === "-12")
    //assert(nf.format(123) === "123")
    assert(nf.format(-1234) === "-1,234")
    assert(nf.format(-12345) === "-12,345")
    //assert(nf.format(123456) === "123,456")
    assert(nf.format(-1234567) === "-1,234,567")
  }

  "format関数" should "値を３桁毎にカンマ(,)で区切った文字列を返す(負数で３の倍数桁)" in {
    assert(nf.format(-123) === "-123")
    assert(nf.format(-123456) === "-123,456")
    assert(nf.format(-123456789) === "-123,456,789")
  }

  "format関数" should "値0の時は符号を付けない" in {
    assert(nf.format(0) === "0")
  }

}

