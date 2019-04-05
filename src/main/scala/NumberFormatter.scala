object NumberFormatter {

  def format(number: Int): String = {
    val reversed: String = number.toString.reverse
    val indexedSeq: Seq[(Char, Int)] = reversed.zipWithIndex
    val nestedSeq: Seq[Seq[Char]] = indexedSeq.map(
      (t) => if (number < 0 && t._2 == indexedSeq.length - 2) {
        Seq(t._1)
      } else if (!(t._2 == indexedSeq.length - 1) && t._2 % 3 == 2) {
        Seq(t._1, ',')
      } else {
        Seq(t._1)
      })
    nestedSeq.flatten.reverse.mkString
  }

}

