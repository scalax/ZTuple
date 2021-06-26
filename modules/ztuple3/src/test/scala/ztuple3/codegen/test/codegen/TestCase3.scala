package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText3 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 3")(
            test("ztuple3 with 3 should fetch the index 1") {
                assert(NumberDefined.number3(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 3 should fetch the index 2") {
                assert(NumberDefined.number3(_2_th))(equalTo(NumberDefined.item2))
            }
             , 
            test("ztuple3 with 3 should fetch the index 3") {
                assert(NumberDefined.number3(_1._0_th))(equalTo(NumberDefined.item3))
            }
    )
}
