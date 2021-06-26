package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText16 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 16")(
            test("ztuple3 with 16 should fetch the index 1") {
                assert(NumberDefined.number16(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 16 should fetch the index 2") {
                assert(NumberDefined.number16(_2_th))(equalTo(NumberDefined.item2))
            }
             , 
            test("ztuple3 with 16 should fetch the index 3") {
                assert(NumberDefined.number16(_1._0_th))(equalTo(NumberDefined.item3))
            }
             , 
            test("ztuple3 with 16 should fetch the index 4") {
                assert(NumberDefined.number16(_1._1_th))(equalTo(NumberDefined.item4))
            }
             , 
            test("ztuple3 with 16 should fetch the index 5") {
                assert(NumberDefined.number16(_1._2_th))(equalTo(NumberDefined.item5))
            }
             , 
            test("ztuple3 with 16 should fetch the index 6") {
                assert(NumberDefined.number16(_2._0_th))(equalTo(NumberDefined.item6))
            }
             , 
            test("ztuple3 with 16 should fetch the index 7") {
                assert(NumberDefined.number16(_2._1_th))(equalTo(NumberDefined.item7))
            }
             , 
            test("ztuple3 with 16 should fetch the index 8") {
                assert(NumberDefined.number16(_2._2_th))(equalTo(NumberDefined.item8))
            }
             , 
            test("ztuple3 with 16 should fetch the index 9") {
                assert(NumberDefined.number16(_1._0._0_th))(equalTo(NumberDefined.item9))
            }
             , 
            test("ztuple3 with 16 should fetch the index 10") {
                assert(NumberDefined.number16(_1._0._1_th))(equalTo(NumberDefined.item10))
            }
             , 
            test("ztuple3 with 16 should fetch the index 11") {
                assert(NumberDefined.number16(_1._0._2_th))(equalTo(NumberDefined.item11))
            }
             , 
            test("ztuple3 with 16 should fetch the index 12") {
                assert(NumberDefined.number16(_1._1._0_th))(equalTo(NumberDefined.item12))
            }
             , 
            test("ztuple3 with 16 should fetch the index 13") {
                assert(NumberDefined.number16(_1._1._1_th))(equalTo(NumberDefined.item13))
            }
             , 
            test("ztuple3 with 16 should fetch the index 14") {
                assert(NumberDefined.number16(_1._1._2_th))(equalTo(NumberDefined.item14))
            }
             , 
            test("ztuple3 with 16 should fetch the index 15") {
                assert(NumberDefined.number16(_1._2._0_th))(equalTo(NumberDefined.item15))
            }
             , 
            test("ztuple3 with 16 should fetch the index 16") {
                assert(NumberDefined.number16(_1._2._1_th))(equalTo(NumberDefined.item16))
            }
    )
}
