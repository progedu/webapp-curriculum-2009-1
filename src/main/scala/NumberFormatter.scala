object NumberFormatter {

  def format(number: Int): String = {

    def f(string: String): String = {
      val reversed: String = string.reverse
      val indexedSeq: Seq[(Char, Int)] = reversed.zipWithIndex
      val nestedSeq: Seq[Seq[Char]] = indexedSeq.map { case (c, i) =>
        if (i % 3 == 2 && i != string.length - 1) Seq(c, ',')
        else Seq(c)
      }
      nestedSeq.flatten.reverse.mkString
    }

    if (number < 0) "-" + f(number.toString.tail) else f(number.toString)
  }
}

