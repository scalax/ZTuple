package ztuple3

object Runner {

  val item01 = Item("item01")
  val item02 = Item("item02")
  val item03 = Item("item03")
  val item04 = Item("item04")
  val item05 = Item("item05")
  val item06 = Item("item06")
  val item07 = Item("item07")
  val item08 = Item("item08")
  val item09 = Item("item09")
  val item10 = Item("item10")
  val item11 = Item("item11")
  val item12 = Item("item12")
  val item13 = Item("item13")
  val item14 = Item("item14")
  val item15 = Item("item15")
  val item16 = Item("item16")
  val item17 = Item("item17")
  val item18 = Item("item18")
  val item19 = Item("item19")
  val item20 = Item("item20")
  val item21 = Item("item21")
  val item22 = Item("item22")
  val item23 = Item("item23")
  val item24 = Item("item24")
  val item25 = Item("item25")
  val item26 = Item("item26")
  val item27 = Item("item27")
  val item28 = Item("item28")
  val item29 = Item("item29")
  val item30 = Item("item30")

  val number1 = Number1PSimple0.method1(item01).method1(item02).method1(item03).method1(item04).method1(item05).method1(item06)
  val number2 = number1.method1(item07).method1(item08).method1(item09).method1(item10).method1(item11).method1(item12)
  val number3 = number2.method1(item13).method1(item14).method1(item15).method1(item16).method1(item17).method1(item18)
  val number4 = number3.method1(item19).method1(item20).method1(item21).method1(item22).method1(item23).method1(item24)
  val number5 = number4.method1(item25).method1(item26).method1(item27).method1(item28).method1(item29).method1(item30)

  def main(arr: Array[String]): Unit = {
    assert(number1(_1_th) == item01)
    assert(number1(_2_th) == item02)
    assert(number1(_1._0_th) == item03)
    assert(number1(_1._1_th) == item04)
    assert(number1(_1._2_th) == item05)
    assert(number1(_2._0_th) == item06)
    assert(number2(_2._1_th) == item07)
    assert(number2(_2._2_th) == item08)
    assert(number2(_1._0._0_th) == item09)
    assert(number2(_1._0._1_th) == item10)
    assert(number2(_1._0._2_th) == item11)
    assert(number2(_1._1._0_th) == item12)
    assert(number3(_1._1._1_th) == item13)
    assert(number3(_1._1._2_th) == item14)
    assert(number3(_1._2._0_th) == item15)
    assert(number3(_1._2._1_th) == item16)
    assert(number3(_1._2._2_th) == item17)
    assert(number3(_2._0._0_th) == item18)
    assert(number4(_2._0._1_th) == item19)
    assert(number4(_2._0._2_th) == item20)
    assert(number4(_2._1._0_th) == item21)
    assert(number4(_2._1._1_th) == item22)
    assert(number4(_2._1._2_th) == item23)
    assert(number4(_2._2._0_th) == item24)
    assert(number5(_2._2._1_th) == item25)
    assert(number5(_2._2._2_th) == item26)
    assert(number5(_1._0._0._0_th) == item27)
    assert(number5(_1._0._0._1_th) == item28)
    assert(number5(_1._0._0._2_th) == item29)
    assert(number5(_1._0._1._0_th) == item30)
  }

}
