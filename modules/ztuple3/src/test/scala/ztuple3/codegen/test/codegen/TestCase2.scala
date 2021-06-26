package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText2 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 2")(
            test("ztuple3 with 2 should fetch the index 1") {
                assert(NumberDefined.number2(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 2 should fetch the index 2") {
                assert(NumberDefined.number2(_2_th))(equalTo(NumberDefined.item2))
            }
    )
}
