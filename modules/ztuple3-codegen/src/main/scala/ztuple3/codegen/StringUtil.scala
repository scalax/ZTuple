package ztuple3.codegen

import scala.io.Source

object StringUtil {

  def trimLines(i: String): String =
    Source.fromString(i).getLines().map(p => (p.trim, p)).filter(!_._1.isEmpty).map(_._2).mkString(System.lineSeparator)

  def indexFromNumberImpl(i: Int): List[Int] = if (i < 3) {
    List(i)
  } else {
    i % 3 match {
      case 0 => 0 :: indexFromNumberImpl(i / 3)
      case 1 => 1 :: indexFromNumberImpl(i / 3)
      case 2 => 2 :: indexFromNumberImpl(i / 3)
    }
  }

  def indexFromNumber(i: Int): String = indexFromNumberImpl(i) match {
    case head1 :: head2 :: tail2 => (head2 :: tail2).reverse.map(s => s"_${s}").mkString(".") + s"._${head1}_th"
    case head :: tail            => s"_${head}_th"
  }

}
