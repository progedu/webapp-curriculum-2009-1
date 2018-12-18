import org.scalatest._

class NumberFormatterSpec extends FlatSpec with DiagrammedAssertions {

  "format関数" should "整数を取得し、数値を 3 桁ごとにカンマ区切りを入れる事ができる" in {
    assert(NumberFormatter.format(1000) === "1,000")
    assert(NumberFormatter.format(1000000) == "1,000,000")
    assert(NumberFormatter.format(100) == 100)   // エラー: ,100 と表示された
  }

}

