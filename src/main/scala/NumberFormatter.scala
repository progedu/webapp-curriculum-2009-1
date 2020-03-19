object NumberFormatter {

  def format(number: Int): String = {
    val minus: Boolean = number < 0
    val absoluteNumber: Int = if(minus) -number else number
    val reversed: String = absoluteNumber.toString.reverse
    val indexedSeq: Seq[(Char, Int)] = reversed.zipWithIndex
    println(indexedSeq)
    val nestedSeq: Seq[Seq[Char]] = indexedSeq.map(
      (t) => if (t._2 % 3 == 2 && t._2 != indexedSeq.size - 1) {
        Seq(t._1, ',')
      } else {
        Seq(t._1)
      })
    (if(minus) "-" else "") + nestedSeq.flatten.reverse.mkString
  }

}

