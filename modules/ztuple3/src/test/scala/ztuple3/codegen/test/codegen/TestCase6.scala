package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText6 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 6")(
            test("ztuple3 with 6 should fetch the index 1") {
                assert(NumberDefined.number6(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 6 should fetch the index 2") {
                assert(NumberDefined.number6(_2_th))(equalTo(NumberDefined.item2))
            }
             , 
            test("ztuple3 with 6 should fetch the index 3") {
                assert(NumberDefined.number6(_1._0_th))(equalTo(NumberDefined.item3))
            }
             , 
            test("ztuple3 with 6 should fetch the index 4") {
                assert(NumberDefined.number6(_1._1_th))(equalTo(NumberDefined.item4))
            }
             , 
            test("ztuple3 with 6 should fetch the index 5") {
                assert(NumberDefined.number6(_1._2_th))(equalTo(NumberDefined.item5))
            }
             , 
            test("ztuple3 with 6 should fetch the index 6") {
                assert(NumberDefined.number6(_2._0_th))(equalTo(NumberDefined.item6))
            }
    )
}
