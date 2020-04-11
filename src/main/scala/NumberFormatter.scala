object NumberFormatter {

  def format(number: Int): String = {
    val string: String = number.toString
    val indexedSeq: Seq[(Char, Int)] = string.zipWithIndex
    val nestedSeq: Seq[Seq[Char]] = indexedSeq.map(
      t =>
        if (t._2 % 3 == 2 && t._2 != string.length - 1) {
          Seq(t._1, ',')
        } else {
          Seq(t._1)
      }
    )
    nestedSeq.flatten.mkString
  }

}
