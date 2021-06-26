package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText1 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 1")(
            test("ztuple3 with 1 should fetch the index 1") {
                assert(NumberDefined.number1(_1_th))(equalTo(NumberDefined.item1))
            }
    )
}
