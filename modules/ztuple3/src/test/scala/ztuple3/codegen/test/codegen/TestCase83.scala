package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText83 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 83")(
            test("ztuple3 with 83 should fetch the index 1") {
                assert(NumberDefined.number83(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 83 should fetch the index 2") {
                assert(NumberDefined.number83(_2_th))(equalTo(NumberDefined.item2))
            }
             , 
            test("ztuple3 with 83 should fetch the index 3") {
                assert(NumberDefined.number83(_1._0_th))(equalTo(NumberDefined.item3))
            }
             , 
            test("ztuple3 with 83 should fetch the index 4") {
                assert(NumberDefined.number83(_1._1_th))(equalTo(NumberDefined.item4))
            }
             , 
            test("ztuple3 with 83 should fetch the index 5") {
                assert(NumberDefined.number83(_1._2_th))(equalTo(NumberDefined.item5))
            }
             , 
            test("ztuple3 with 83 should fetch the index 6") {
                assert(NumberDefined.number83(_2._0_th))(equalTo(NumberDefined.item6))
            }
             , 
            test("ztuple3 with 83 should fetch the index 7") {
                assert(NumberDefined.number83(_2._1_th))(equalTo(NumberDefined.item7))
            }
             , 
            test("ztuple3 with 83 should fetch the index 8") {
                assert(NumberDefined.number83(_2._2_th))(equalTo(NumberDefined.item8))
            }
             , 
            test("ztuple3 with 83 should fetch the index 9") {
                assert(NumberDefined.number83(_1._0._0_th))(equalTo(NumberDefined.item9))
            }
             , 
            test("ztuple3 with 83 should fetch the index 10") {
                assert(NumberDefined.number83(_1._0._1_th))(equalTo(NumberDefined.item10))
            }
             , 
            test("ztuple3 with 83 should fetch the index 11") {
                assert(NumberDefined.number83(_1._0._2_th))(equalTo(NumberDefined.item11))
            }
             , 
            test("ztuple3 with 83 should fetch the index 12") {
                assert(NumberDefined.number83(_1._1._0_th))(equalTo(NumberDefined.item12))
            }
             , 
            test("ztuple3 with 83 should fetch the index 13") {
                assert(NumberDefined.number83(_1._1._1_th))(equalTo(NumberDefined.item13))
            }
             , 
            test("ztuple3 with 83 should fetch the index 14") {
                assert(NumberDefined.number83(_1._1._2_th))(equalTo(NumberDefined.item14))
            }
             , 
            test("ztuple3 with 83 should fetch the index 15") {
                assert(NumberDefined.number83(_1._2._0_th))(equalTo(NumberDefined.item15))
            }
             , 
            test("ztuple3 with 83 should fetch the index 16") {
                assert(NumberDefined.number83(_1._2._1_th))(equalTo(NumberDefined.item16))
            }
             , 
            test("ztuple3 with 83 should fetch the index 17") {
                assert(NumberDefined.number83(_1._2._2_th))(equalTo(NumberDefined.item17))
            }
             , 
            test("ztuple3 with 83 should fetch the index 18") {
                assert(NumberDefined.number83(_2._0._0_th))(equalTo(NumberDefined.item18))
            }
             , 
            test("ztuple3 with 83 should fetch the index 19") {
                assert(NumberDefined.number83(_2._0._1_th))(equalTo(NumberDefined.item19))
            }
             , 
            test("ztuple3 with 83 should fetch the index 20") {
                assert(NumberDefined.number83(_2._0._2_th))(equalTo(NumberDefined.item20))
            }
             , 
            test("ztuple3 with 83 should fetch the index 21") {
                assert(NumberDefined.number83(_2._1._0_th))(equalTo(NumberDefined.item21))
            }
             , 
            test("ztuple3 with 83 should fetch the index 22") {
                assert(NumberDefined.number83(_2._1._1_th))(equalTo(NumberDefined.item22))
            }
             , 
            test("ztuple3 with 83 should fetch the index 23") {
                assert(NumberDefined.number83(_2._1._2_th))(equalTo(NumberDefined.item23))
            }
             , 
            test("ztuple3 with 83 should fetch the index 24") {
                assert(NumberDefined.number83(_2._2._0_th))(equalTo(NumberDefined.item24))
            }
             , 
            test("ztuple3 with 83 should fetch the index 25") {
                assert(NumberDefined.number83(_2._2._1_th))(equalTo(NumberDefined.item25))
            }
             , 
            test("ztuple3 with 83 should fetch the index 26") {
                assert(NumberDefined.number83(_2._2._2_th))(equalTo(NumberDefined.item26))
            }
             , 
            test("ztuple3 with 83 should fetch the index 27") {
                assert(NumberDefined.number83(_1._0._0._0_th))(equalTo(NumberDefined.item27))
            }
             , 
            test("ztuple3 with 83 should fetch the index 28") {
                assert(NumberDefined.number83(_1._0._0._1_th))(equalTo(NumberDefined.item28))
            }
             , 
            test("ztuple3 with 83 should fetch the index 29") {
                assert(NumberDefined.number83(_1._0._0._2_th))(equalTo(NumberDefined.item29))
            }
             , 
            test("ztuple3 with 83 should fetch the index 30") {
                assert(NumberDefined.number83(_1._0._1._0_th))(equalTo(NumberDefined.item30))
            }
             , 
            test("ztuple3 with 83 should fetch the index 31") {
                assert(NumberDefined.number83(_1._0._1._1_th))(equalTo(NumberDefined.item31))
            }
             , 
            test("ztuple3 with 83 should fetch the index 32") {
                assert(NumberDefined.number83(_1._0._1._2_th))(equalTo(NumberDefined.item32))
            }
             , 
            test("ztuple3 with 83 should fetch the index 33") {
                assert(NumberDefined.number83(_1._0._2._0_th))(equalTo(NumberDefined.item33))
            }
             , 
            test("ztuple3 with 83 should fetch the index 34") {
                assert(NumberDefined.number83(_1._0._2._1_th))(equalTo(NumberDefined.item34))
            }
             , 
            test("ztuple3 with 83 should fetch the index 35") {
                assert(NumberDefined.number83(_1._0._2._2_th))(equalTo(NumberDefined.item35))
            }
             , 
            test("ztuple3 with 83 should fetch the index 36") {
                assert(NumberDefined.number83(_1._1._0._0_th))(equalTo(NumberDefined.item36))
            }
             , 
            test("ztuple3 with 83 should fetch the index 37") {
                assert(NumberDefined.number83(_1._1._0._1_th))(equalTo(NumberDefined.item37))
            }
             , 
            test("ztuple3 with 83 should fetch the index 38") {
                assert(NumberDefined.number83(_1._1._0._2_th))(equalTo(NumberDefined.item38))
            }
             , 
            test("ztuple3 with 83 should fetch the index 39") {
                assert(NumberDefined.number83(_1._1._1._0_th))(equalTo(NumberDefined.item39))
            }
             , 
            test("ztuple3 with 83 should fetch the index 40") {
                assert(NumberDefined.number83(_1._1._1._1_th))(equalTo(NumberDefined.item40))
            }
             , 
            test("ztuple3 with 83 should fetch the index 41") {
                assert(NumberDefined.number83(_1._1._1._2_th))(equalTo(NumberDefined.item41))
            }
             , 
            test("ztuple3 with 83 should fetch the index 42") {
                assert(NumberDefined.number83(_1._1._2._0_th))(equalTo(NumberDefined.item42))
            }
             , 
            test("ztuple3 with 83 should fetch the index 43") {
                assert(NumberDefined.number83(_1._1._2._1_th))(equalTo(NumberDefined.item43))
            }
             , 
            test("ztuple3 with 83 should fetch the index 44") {
                assert(NumberDefined.number83(_1._1._2._2_th))(equalTo(NumberDefined.item44))
            }
             , 
            test("ztuple3 with 83 should fetch the index 45") {
                assert(NumberDefined.number83(_1._2._0._0_th))(equalTo(NumberDefined.item45))
            }
             , 
            test("ztuple3 with 83 should fetch the index 46") {
                assert(NumberDefined.number83(_1._2._0._1_th))(equalTo(NumberDefined.item46))
            }
             , 
            test("ztuple3 with 83 should fetch the index 47") {
                assert(NumberDefined.number83(_1._2._0._2_th))(equalTo(NumberDefined.item47))
            }
             , 
            test("ztuple3 with 83 should fetch the index 48") {
                assert(NumberDefined.number83(_1._2._1._0_th))(equalTo(NumberDefined.item48))
            }
             , 
            test("ztuple3 with 83 should fetch the index 49") {
                assert(NumberDefined.number83(_1._2._1._1_th))(equalTo(NumberDefined.item49))
            }
             , 
            test("ztuple3 with 83 should fetch the index 50") {
                assert(NumberDefined.number83(_1._2._1._2_th))(equalTo(NumberDefined.item50))
            }
             , 
            test("ztuple3 with 83 should fetch the index 51") {
                assert(NumberDefined.number83(_1._2._2._0_th))(equalTo(NumberDefined.item51))
            }
             , 
            test("ztuple3 with 83 should fetch the index 52") {
                assert(NumberDefined.number83(_1._2._2._1_th))(equalTo(NumberDefined.item52))
            }
             , 
            test("ztuple3 with 83 should fetch the index 53") {
                assert(NumberDefined.number83(_1._2._2._2_th))(equalTo(NumberDefined.item53))
            }
             , 
            test("ztuple3 with 83 should fetch the index 54") {
                assert(NumberDefined.number83(_2._0._0._0_th))(equalTo(NumberDefined.item54))
            }
             , 
            test("ztuple3 with 83 should fetch the index 55") {
                assert(NumberDefined.number83(_2._0._0._1_th))(equalTo(NumberDefined.item55))
            }
             , 
            test("ztuple3 with 83 should fetch the index 56") {
                assert(NumberDefined.number83(_2._0._0._2_th))(equalTo(NumberDefined.item56))
            }
             , 
            test("ztuple3 with 83 should fetch the index 57") {
                assert(NumberDefined.number83(_2._0._1._0_th))(equalTo(NumberDefined.item57))
            }
             , 
            test("ztuple3 with 83 should fetch the index 58") {
                assert(NumberDefined.number83(_2._0._1._1_th))(equalTo(NumberDefined.item58))
            }
             , 
            test("ztuple3 with 83 should fetch the index 59") {
                assert(NumberDefined.number83(_2._0._1._2_th))(equalTo(NumberDefined.item59))
            }
             , 
            test("ztuple3 with 83 should fetch the index 60") {
                assert(NumberDefined.number83(_2._0._2._0_th))(equalTo(NumberDefined.item60))
            }
             , 
            test("ztuple3 with 83 should fetch the index 61") {
                assert(NumberDefined.number83(_2._0._2._1_th))(equalTo(NumberDefined.item61))
            }
             , 
            test("ztuple3 with 83 should fetch the index 62") {
                assert(NumberDefined.number83(_2._0._2._2_th))(equalTo(NumberDefined.item62))
            }
             , 
            test("ztuple3 with 83 should fetch the index 63") {
                assert(NumberDefined.number83(_2._1._0._0_th))(equalTo(NumberDefined.item63))
            }
             , 
            test("ztuple3 with 83 should fetch the index 64") {
                assert(NumberDefined.number83(_2._1._0._1_th))(equalTo(NumberDefined.item64))
            }
             , 
            test("ztuple3 with 83 should fetch the index 65") {
                assert(NumberDefined.number83(_2._1._0._2_th))(equalTo(NumberDefined.item65))
            }
             , 
            test("ztuple3 with 83 should fetch the index 66") {
                assert(NumberDefined.number83(_2._1._1._0_th))(equalTo(NumberDefined.item66))
            }
             , 
            test("ztuple3 with 83 should fetch the index 67") {
                assert(NumberDefined.number83(_2._1._1._1_th))(equalTo(NumberDefined.item67))
            }
             , 
            test("ztuple3 with 83 should fetch the index 68") {
                assert(NumberDefined.number83(_2._1._1._2_th))(equalTo(NumberDefined.item68))
            }
             , 
            test("ztuple3 with 83 should fetch the index 69") {
                assert(NumberDefined.number83(_2._1._2._0_th))(equalTo(NumberDefined.item69))
            }
             , 
            test("ztuple3 with 83 should fetch the index 70") {
                assert(NumberDefined.number83(_2._1._2._1_th))(equalTo(NumberDefined.item70))
            }
             , 
            test("ztuple3 with 83 should fetch the index 71") {
                assert(NumberDefined.number83(_2._1._2._2_th))(equalTo(NumberDefined.item71))
            }
             , 
            test("ztuple3 with 83 should fetch the index 72") {
                assert(NumberDefined.number83(_2._2._0._0_th))(equalTo(NumberDefined.item72))
            }
             , 
            test("ztuple3 with 83 should fetch the index 73") {
                assert(NumberDefined.number83(_2._2._0._1_th))(equalTo(NumberDefined.item73))
            }
             , 
            test("ztuple3 with 83 should fetch the index 74") {
                assert(NumberDefined.number83(_2._2._0._2_th))(equalTo(NumberDefined.item74))
            }
             , 
            test("ztuple3 with 83 should fetch the index 75") {
                assert(NumberDefined.number83(_2._2._1._0_th))(equalTo(NumberDefined.item75))
            }
             , 
            test("ztuple3 with 83 should fetch the index 76") {
                assert(NumberDefined.number83(_2._2._1._1_th))(equalTo(NumberDefined.item76))
            }
             , 
            test("ztuple3 with 83 should fetch the index 77") {
                assert(NumberDefined.number83(_2._2._1._2_th))(equalTo(NumberDefined.item77))
            }
             , 
            test("ztuple3 with 83 should fetch the index 78") {
                assert(NumberDefined.number83(_2._2._2._0_th))(equalTo(NumberDefined.item78))
            }
             , 
            test("ztuple3 with 83 should fetch the index 79") {
                assert(NumberDefined.number83(_2._2._2._1_th))(equalTo(NumberDefined.item79))
            }
             , 
            test("ztuple3 with 83 should fetch the index 80") {
                assert(NumberDefined.number83(_2._2._2._2_th))(equalTo(NumberDefined.item80))
            }
             , 
            test("ztuple3 with 83 should fetch the index 81") {
                assert(NumberDefined.number83(_1._0._0._0._0_th))(equalTo(NumberDefined.item81))
            }
             , 
            test("ztuple3 with 83 should fetch the index 82") {
                assert(NumberDefined.number83(_1._0._0._0._1_th))(equalTo(NumberDefined.item82))
            }
             , 
            test("ztuple3 with 83 should fetch the index 83") {
                assert(NumberDefined.number83(_1._0._0._0._2_th))(equalTo(NumberDefined.item83))
            }
    )
}
