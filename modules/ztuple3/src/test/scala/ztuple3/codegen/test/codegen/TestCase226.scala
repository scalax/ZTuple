package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText226 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 226")(
            test("ztuple3 with 226 should fetch the index 1") {
                assert(NumberDefined.number226(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 226 should fetch the index 2") {
                assert(NumberDefined.number226(_2_th))(equalTo(NumberDefined.item2))
            }
             , 
            test("ztuple3 with 226 should fetch the index 3") {
                assert(NumberDefined.number226(_1._0_th))(equalTo(NumberDefined.item3))
            }
             , 
            test("ztuple3 with 226 should fetch the index 4") {
                assert(NumberDefined.number226(_1._1_th))(equalTo(NumberDefined.item4))
            }
             , 
            test("ztuple3 with 226 should fetch the index 5") {
                assert(NumberDefined.number226(_1._2_th))(equalTo(NumberDefined.item5))
            }
             , 
            test("ztuple3 with 226 should fetch the index 6") {
                assert(NumberDefined.number226(_2._0_th))(equalTo(NumberDefined.item6))
            }
             , 
            test("ztuple3 with 226 should fetch the index 7") {
                assert(NumberDefined.number226(_2._1_th))(equalTo(NumberDefined.item7))
            }
             , 
            test("ztuple3 with 226 should fetch the index 8") {
                assert(NumberDefined.number226(_2._2_th))(equalTo(NumberDefined.item8))
            }
             , 
            test("ztuple3 with 226 should fetch the index 9") {
                assert(NumberDefined.number226(_1._0._0_th))(equalTo(NumberDefined.item9))
            }
             , 
            test("ztuple3 with 226 should fetch the index 10") {
                assert(NumberDefined.number226(_1._0._1_th))(equalTo(NumberDefined.item10))
            }
             , 
            test("ztuple3 with 226 should fetch the index 11") {
                assert(NumberDefined.number226(_1._0._2_th))(equalTo(NumberDefined.item11))
            }
             , 
            test("ztuple3 with 226 should fetch the index 12") {
                assert(NumberDefined.number226(_1._1._0_th))(equalTo(NumberDefined.item12))
            }
             , 
            test("ztuple3 with 226 should fetch the index 13") {
                assert(NumberDefined.number226(_1._1._1_th))(equalTo(NumberDefined.item13))
            }
             , 
            test("ztuple3 with 226 should fetch the index 14") {
                assert(NumberDefined.number226(_1._1._2_th))(equalTo(NumberDefined.item14))
            }
             , 
            test("ztuple3 with 226 should fetch the index 15") {
                assert(NumberDefined.number226(_1._2._0_th))(equalTo(NumberDefined.item15))
            }
             , 
            test("ztuple3 with 226 should fetch the index 16") {
                assert(NumberDefined.number226(_1._2._1_th))(equalTo(NumberDefined.item16))
            }
             , 
            test("ztuple3 with 226 should fetch the index 17") {
                assert(NumberDefined.number226(_1._2._2_th))(equalTo(NumberDefined.item17))
            }
             , 
            test("ztuple3 with 226 should fetch the index 18") {
                assert(NumberDefined.number226(_2._0._0_th))(equalTo(NumberDefined.item18))
            }
             , 
            test("ztuple3 with 226 should fetch the index 19") {
                assert(NumberDefined.number226(_2._0._1_th))(equalTo(NumberDefined.item19))
            }
             , 
            test("ztuple3 with 226 should fetch the index 20") {
                assert(NumberDefined.number226(_2._0._2_th))(equalTo(NumberDefined.item20))
            }
             , 
            test("ztuple3 with 226 should fetch the index 21") {
                assert(NumberDefined.number226(_2._1._0_th))(equalTo(NumberDefined.item21))
            }
             , 
            test("ztuple3 with 226 should fetch the index 22") {
                assert(NumberDefined.number226(_2._1._1_th))(equalTo(NumberDefined.item22))
            }
             , 
            test("ztuple3 with 226 should fetch the index 23") {
                assert(NumberDefined.number226(_2._1._2_th))(equalTo(NumberDefined.item23))
            }
             , 
            test("ztuple3 with 226 should fetch the index 24") {
                assert(NumberDefined.number226(_2._2._0_th))(equalTo(NumberDefined.item24))
            }
             , 
            test("ztuple3 with 226 should fetch the index 25") {
                assert(NumberDefined.number226(_2._2._1_th))(equalTo(NumberDefined.item25))
            }
             , 
            test("ztuple3 with 226 should fetch the index 26") {
                assert(NumberDefined.number226(_2._2._2_th))(equalTo(NumberDefined.item26))
            }
             , 
            test("ztuple3 with 226 should fetch the index 27") {
                assert(NumberDefined.number226(_1._0._0._0_th))(equalTo(NumberDefined.item27))
            }
             , 
            test("ztuple3 with 226 should fetch the index 28") {
                assert(NumberDefined.number226(_1._0._0._1_th))(equalTo(NumberDefined.item28))
            }
             , 
            test("ztuple3 with 226 should fetch the index 29") {
                assert(NumberDefined.number226(_1._0._0._2_th))(equalTo(NumberDefined.item29))
            }
             , 
            test("ztuple3 with 226 should fetch the index 30") {
                assert(NumberDefined.number226(_1._0._1._0_th))(equalTo(NumberDefined.item30))
            }
             , 
            test("ztuple3 with 226 should fetch the index 31") {
                assert(NumberDefined.number226(_1._0._1._1_th))(equalTo(NumberDefined.item31))
            }
             , 
            test("ztuple3 with 226 should fetch the index 32") {
                assert(NumberDefined.number226(_1._0._1._2_th))(equalTo(NumberDefined.item32))
            }
             , 
            test("ztuple3 with 226 should fetch the index 33") {
                assert(NumberDefined.number226(_1._0._2._0_th))(equalTo(NumberDefined.item33))
            }
             , 
            test("ztuple3 with 226 should fetch the index 34") {
                assert(NumberDefined.number226(_1._0._2._1_th))(equalTo(NumberDefined.item34))
            }
             , 
            test("ztuple3 with 226 should fetch the index 35") {
                assert(NumberDefined.number226(_1._0._2._2_th))(equalTo(NumberDefined.item35))
            }
             , 
            test("ztuple3 with 226 should fetch the index 36") {
                assert(NumberDefined.number226(_1._1._0._0_th))(equalTo(NumberDefined.item36))
            }
             , 
            test("ztuple3 with 226 should fetch the index 37") {
                assert(NumberDefined.number226(_1._1._0._1_th))(equalTo(NumberDefined.item37))
            }
             , 
            test("ztuple3 with 226 should fetch the index 38") {
                assert(NumberDefined.number226(_1._1._0._2_th))(equalTo(NumberDefined.item38))
            }
             , 
            test("ztuple3 with 226 should fetch the index 39") {
                assert(NumberDefined.number226(_1._1._1._0_th))(equalTo(NumberDefined.item39))
            }
             , 
            test("ztuple3 with 226 should fetch the index 40") {
                assert(NumberDefined.number226(_1._1._1._1_th))(equalTo(NumberDefined.item40))
            }
             , 
            test("ztuple3 with 226 should fetch the index 41") {
                assert(NumberDefined.number226(_1._1._1._2_th))(equalTo(NumberDefined.item41))
            }
             , 
            test("ztuple3 with 226 should fetch the index 42") {
                assert(NumberDefined.number226(_1._1._2._0_th))(equalTo(NumberDefined.item42))
            }
             , 
            test("ztuple3 with 226 should fetch the index 43") {
                assert(NumberDefined.number226(_1._1._2._1_th))(equalTo(NumberDefined.item43))
            }
             , 
            test("ztuple3 with 226 should fetch the index 44") {
                assert(NumberDefined.number226(_1._1._2._2_th))(equalTo(NumberDefined.item44))
            }
             , 
            test("ztuple3 with 226 should fetch the index 45") {
                assert(NumberDefined.number226(_1._2._0._0_th))(equalTo(NumberDefined.item45))
            }
             , 
            test("ztuple3 with 226 should fetch the index 46") {
                assert(NumberDefined.number226(_1._2._0._1_th))(equalTo(NumberDefined.item46))
            }
             , 
            test("ztuple3 with 226 should fetch the index 47") {
                assert(NumberDefined.number226(_1._2._0._2_th))(equalTo(NumberDefined.item47))
            }
             , 
            test("ztuple3 with 226 should fetch the index 48") {
                assert(NumberDefined.number226(_1._2._1._0_th))(equalTo(NumberDefined.item48))
            }
             , 
            test("ztuple3 with 226 should fetch the index 49") {
                assert(NumberDefined.number226(_1._2._1._1_th))(equalTo(NumberDefined.item49))
            }
             , 
            test("ztuple3 with 226 should fetch the index 50") {
                assert(NumberDefined.number226(_1._2._1._2_th))(equalTo(NumberDefined.item50))
            }
             , 
            test("ztuple3 with 226 should fetch the index 51") {
                assert(NumberDefined.number226(_1._2._2._0_th))(equalTo(NumberDefined.item51))
            }
             , 
            test("ztuple3 with 226 should fetch the index 52") {
                assert(NumberDefined.number226(_1._2._2._1_th))(equalTo(NumberDefined.item52))
            }
             , 
            test("ztuple3 with 226 should fetch the index 53") {
                assert(NumberDefined.number226(_1._2._2._2_th))(equalTo(NumberDefined.item53))
            }
             , 
            test("ztuple3 with 226 should fetch the index 54") {
                assert(NumberDefined.number226(_2._0._0._0_th))(equalTo(NumberDefined.item54))
            }
             , 
            test("ztuple3 with 226 should fetch the index 55") {
                assert(NumberDefined.number226(_2._0._0._1_th))(equalTo(NumberDefined.item55))
            }
             , 
            test("ztuple3 with 226 should fetch the index 56") {
                assert(NumberDefined.number226(_2._0._0._2_th))(equalTo(NumberDefined.item56))
            }
             , 
            test("ztuple3 with 226 should fetch the index 57") {
                assert(NumberDefined.number226(_2._0._1._0_th))(equalTo(NumberDefined.item57))
            }
             , 
            test("ztuple3 with 226 should fetch the index 58") {
                assert(NumberDefined.number226(_2._0._1._1_th))(equalTo(NumberDefined.item58))
            }
             , 
            test("ztuple3 with 226 should fetch the index 59") {
                assert(NumberDefined.number226(_2._0._1._2_th))(equalTo(NumberDefined.item59))
            }
             , 
            test("ztuple3 with 226 should fetch the index 60") {
                assert(NumberDefined.number226(_2._0._2._0_th))(equalTo(NumberDefined.item60))
            }
             , 
            test("ztuple3 with 226 should fetch the index 61") {
                assert(NumberDefined.number226(_2._0._2._1_th))(equalTo(NumberDefined.item61))
            }
             , 
            test("ztuple3 with 226 should fetch the index 62") {
                assert(NumberDefined.number226(_2._0._2._2_th))(equalTo(NumberDefined.item62))
            }
             , 
            test("ztuple3 with 226 should fetch the index 63") {
                assert(NumberDefined.number226(_2._1._0._0_th))(equalTo(NumberDefined.item63))
            }
             , 
            test("ztuple3 with 226 should fetch the index 64") {
                assert(NumberDefined.number226(_2._1._0._1_th))(equalTo(NumberDefined.item64))
            }
             , 
            test("ztuple3 with 226 should fetch the index 65") {
                assert(NumberDefined.number226(_2._1._0._2_th))(equalTo(NumberDefined.item65))
            }
             , 
            test("ztuple3 with 226 should fetch the index 66") {
                assert(NumberDefined.number226(_2._1._1._0_th))(equalTo(NumberDefined.item66))
            }
             , 
            test("ztuple3 with 226 should fetch the index 67") {
                assert(NumberDefined.number226(_2._1._1._1_th))(equalTo(NumberDefined.item67))
            }
             , 
            test("ztuple3 with 226 should fetch the index 68") {
                assert(NumberDefined.number226(_2._1._1._2_th))(equalTo(NumberDefined.item68))
            }
             , 
            test("ztuple3 with 226 should fetch the index 69") {
                assert(NumberDefined.number226(_2._1._2._0_th))(equalTo(NumberDefined.item69))
            }
             , 
            test("ztuple3 with 226 should fetch the index 70") {
                assert(NumberDefined.number226(_2._1._2._1_th))(equalTo(NumberDefined.item70))
            }
             , 
            test("ztuple3 with 226 should fetch the index 71") {
                assert(NumberDefined.number226(_2._1._2._2_th))(equalTo(NumberDefined.item71))
            }
             , 
            test("ztuple3 with 226 should fetch the index 72") {
                assert(NumberDefined.number226(_2._2._0._0_th))(equalTo(NumberDefined.item72))
            }
             , 
            test("ztuple3 with 226 should fetch the index 73") {
                assert(NumberDefined.number226(_2._2._0._1_th))(equalTo(NumberDefined.item73))
            }
             , 
            test("ztuple3 with 226 should fetch the index 74") {
                assert(NumberDefined.number226(_2._2._0._2_th))(equalTo(NumberDefined.item74))
            }
             , 
            test("ztuple3 with 226 should fetch the index 75") {
                assert(NumberDefined.number226(_2._2._1._0_th))(equalTo(NumberDefined.item75))
            }
             , 
            test("ztuple3 with 226 should fetch the index 76") {
                assert(NumberDefined.number226(_2._2._1._1_th))(equalTo(NumberDefined.item76))
            }
             , 
            test("ztuple3 with 226 should fetch the index 77") {
                assert(NumberDefined.number226(_2._2._1._2_th))(equalTo(NumberDefined.item77))
            }
             , 
            test("ztuple3 with 226 should fetch the index 78") {
                assert(NumberDefined.number226(_2._2._2._0_th))(equalTo(NumberDefined.item78))
            }
             , 
            test("ztuple3 with 226 should fetch the index 79") {
                assert(NumberDefined.number226(_2._2._2._1_th))(equalTo(NumberDefined.item79))
            }
             , 
            test("ztuple3 with 226 should fetch the index 80") {
                assert(NumberDefined.number226(_2._2._2._2_th))(equalTo(NumberDefined.item80))
            }
             , 
            test("ztuple3 with 226 should fetch the index 81") {
                assert(NumberDefined.number226(_1._0._0._0._0_th))(equalTo(NumberDefined.item81))
            }
             , 
            test("ztuple3 with 226 should fetch the index 82") {
                assert(NumberDefined.number226(_1._0._0._0._1_th))(equalTo(NumberDefined.item82))
            }
             , 
            test("ztuple3 with 226 should fetch the index 83") {
                assert(NumberDefined.number226(_1._0._0._0._2_th))(equalTo(NumberDefined.item83))
            }
             , 
            test("ztuple3 with 226 should fetch the index 84") {
                assert(NumberDefined.number226(_1._0._0._1._0_th))(equalTo(NumberDefined.item84))
            }
             , 
            test("ztuple3 with 226 should fetch the index 85") {
                assert(NumberDefined.number226(_1._0._0._1._1_th))(equalTo(NumberDefined.item85))
            }
             , 
            test("ztuple3 with 226 should fetch the index 86") {
                assert(NumberDefined.number226(_1._0._0._1._2_th))(equalTo(NumberDefined.item86))
            }
             , 
            test("ztuple3 with 226 should fetch the index 87") {
                assert(NumberDefined.number226(_1._0._0._2._0_th))(equalTo(NumberDefined.item87))
            }
             , 
            test("ztuple3 with 226 should fetch the index 88") {
                assert(NumberDefined.number226(_1._0._0._2._1_th))(equalTo(NumberDefined.item88))
            }
             , 
            test("ztuple3 with 226 should fetch the index 89") {
                assert(NumberDefined.number226(_1._0._0._2._2_th))(equalTo(NumberDefined.item89))
            }
             , 
            test("ztuple3 with 226 should fetch the index 90") {
                assert(NumberDefined.number226(_1._0._1._0._0_th))(equalTo(NumberDefined.item90))
            }
             , 
            test("ztuple3 with 226 should fetch the index 91") {
                assert(NumberDefined.number226(_1._0._1._0._1_th))(equalTo(NumberDefined.item91))
            }
             , 
            test("ztuple3 with 226 should fetch the index 92") {
                assert(NumberDefined.number226(_1._0._1._0._2_th))(equalTo(NumberDefined.item92))
            }
             , 
            test("ztuple3 with 226 should fetch the index 93") {
                assert(NumberDefined.number226(_1._0._1._1._0_th))(equalTo(NumberDefined.item93))
            }
             , 
            test("ztuple3 with 226 should fetch the index 94") {
                assert(NumberDefined.number226(_1._0._1._1._1_th))(equalTo(NumberDefined.item94))
            }
             , 
            test("ztuple3 with 226 should fetch the index 95") {
                assert(NumberDefined.number226(_1._0._1._1._2_th))(equalTo(NumberDefined.item95))
            }
             , 
            test("ztuple3 with 226 should fetch the index 96") {
                assert(NumberDefined.number226(_1._0._1._2._0_th))(equalTo(NumberDefined.item96))
            }
             , 
            test("ztuple3 with 226 should fetch the index 97") {
                assert(NumberDefined.number226(_1._0._1._2._1_th))(equalTo(NumberDefined.item97))
            }
             , 
            test("ztuple3 with 226 should fetch the index 98") {
                assert(NumberDefined.number226(_1._0._1._2._2_th))(equalTo(NumberDefined.item98))
            }
             , 
            test("ztuple3 with 226 should fetch the index 99") {
                assert(NumberDefined.number226(_1._0._2._0._0_th))(equalTo(NumberDefined.item99))
            }
             , 
            test("ztuple3 with 226 should fetch the index 100") {
                assert(NumberDefined.number226(_1._0._2._0._1_th))(equalTo(NumberDefined.item100))
            }
             , 
            test("ztuple3 with 226 should fetch the index 101") {
                assert(NumberDefined.number226(_1._0._2._0._2_th))(equalTo(NumberDefined.item101))
            }
             , 
            test("ztuple3 with 226 should fetch the index 102") {
                assert(NumberDefined.number226(_1._0._2._1._0_th))(equalTo(NumberDefined.item102))
            }
             , 
            test("ztuple3 with 226 should fetch the index 103") {
                assert(NumberDefined.number226(_1._0._2._1._1_th))(equalTo(NumberDefined.item103))
            }
             , 
            test("ztuple3 with 226 should fetch the index 104") {
                assert(NumberDefined.number226(_1._0._2._1._2_th))(equalTo(NumberDefined.item104))
            }
             , 
            test("ztuple3 with 226 should fetch the index 105") {
                assert(NumberDefined.number226(_1._0._2._2._0_th))(equalTo(NumberDefined.item105))
            }
             , 
            test("ztuple3 with 226 should fetch the index 106") {
                assert(NumberDefined.number226(_1._0._2._2._1_th))(equalTo(NumberDefined.item106))
            }
             , 
            test("ztuple3 with 226 should fetch the index 107") {
                assert(NumberDefined.number226(_1._0._2._2._2_th))(equalTo(NumberDefined.item107))
            }
             , 
            test("ztuple3 with 226 should fetch the index 108") {
                assert(NumberDefined.number226(_1._1._0._0._0_th))(equalTo(NumberDefined.item108))
            }
             , 
            test("ztuple3 with 226 should fetch the index 109") {
                assert(NumberDefined.number226(_1._1._0._0._1_th))(equalTo(NumberDefined.item109))
            }
             , 
            test("ztuple3 with 226 should fetch the index 110") {
                assert(NumberDefined.number226(_1._1._0._0._2_th))(equalTo(NumberDefined.item110))
            }
             , 
            test("ztuple3 with 226 should fetch the index 111") {
                assert(NumberDefined.number226(_1._1._0._1._0_th))(equalTo(NumberDefined.item111))
            }
             , 
            test("ztuple3 with 226 should fetch the index 112") {
                assert(NumberDefined.number226(_1._1._0._1._1_th))(equalTo(NumberDefined.item112))
            }
             , 
            test("ztuple3 with 226 should fetch the index 113") {
                assert(NumberDefined.number226(_1._1._0._1._2_th))(equalTo(NumberDefined.item113))
            }
             , 
            test("ztuple3 with 226 should fetch the index 114") {
                assert(NumberDefined.number226(_1._1._0._2._0_th))(equalTo(NumberDefined.item114))
            }
             , 
            test("ztuple3 with 226 should fetch the index 115") {
                assert(NumberDefined.number226(_1._1._0._2._1_th))(equalTo(NumberDefined.item115))
            }
             , 
            test("ztuple3 with 226 should fetch the index 116") {
                assert(NumberDefined.number226(_1._1._0._2._2_th))(equalTo(NumberDefined.item116))
            }
             , 
            test("ztuple3 with 226 should fetch the index 117") {
                assert(NumberDefined.number226(_1._1._1._0._0_th))(equalTo(NumberDefined.item117))
            }
             , 
            test("ztuple3 with 226 should fetch the index 118") {
                assert(NumberDefined.number226(_1._1._1._0._1_th))(equalTo(NumberDefined.item118))
            }
             , 
            test("ztuple3 with 226 should fetch the index 119") {
                assert(NumberDefined.number226(_1._1._1._0._2_th))(equalTo(NumberDefined.item119))
            }
             , 
            test("ztuple3 with 226 should fetch the index 120") {
                assert(NumberDefined.number226(_1._1._1._1._0_th))(equalTo(NumberDefined.item120))
            }
             , 
            test("ztuple3 with 226 should fetch the index 121") {
                assert(NumberDefined.number226(_1._1._1._1._1_th))(equalTo(NumberDefined.item121))
            }
             , 
            test("ztuple3 with 226 should fetch the index 122") {
                assert(NumberDefined.number226(_1._1._1._1._2_th))(equalTo(NumberDefined.item122))
            }
             , 
            test("ztuple3 with 226 should fetch the index 123") {
                assert(NumberDefined.number226(_1._1._1._2._0_th))(equalTo(NumberDefined.item123))
            }
             , 
            test("ztuple3 with 226 should fetch the index 124") {
                assert(NumberDefined.number226(_1._1._1._2._1_th))(equalTo(NumberDefined.item124))
            }
             , 
            test("ztuple3 with 226 should fetch the index 125") {
                assert(NumberDefined.number226(_1._1._1._2._2_th))(equalTo(NumberDefined.item125))
            }
             , 
            test("ztuple3 with 226 should fetch the index 126") {
                assert(NumberDefined.number226(_1._1._2._0._0_th))(equalTo(NumberDefined.item126))
            }
             , 
            test("ztuple3 with 226 should fetch the index 127") {
                assert(NumberDefined.number226(_1._1._2._0._1_th))(equalTo(NumberDefined.item127))
            }
             , 
            test("ztuple3 with 226 should fetch the index 128") {
                assert(NumberDefined.number226(_1._1._2._0._2_th))(equalTo(NumberDefined.item128))
            }
             , 
            test("ztuple3 with 226 should fetch the index 129") {
                assert(NumberDefined.number226(_1._1._2._1._0_th))(equalTo(NumberDefined.item129))
            }
             , 
            test("ztuple3 with 226 should fetch the index 130") {
                assert(NumberDefined.number226(_1._1._2._1._1_th))(equalTo(NumberDefined.item130))
            }
             , 
            test("ztuple3 with 226 should fetch the index 131") {
                assert(NumberDefined.number226(_1._1._2._1._2_th))(equalTo(NumberDefined.item131))
            }
             , 
            test("ztuple3 with 226 should fetch the index 132") {
                assert(NumberDefined.number226(_1._1._2._2._0_th))(equalTo(NumberDefined.item132))
            }
             , 
            test("ztuple3 with 226 should fetch the index 133") {
                assert(NumberDefined.number226(_1._1._2._2._1_th))(equalTo(NumberDefined.item133))
            }
             , 
            test("ztuple3 with 226 should fetch the index 134") {
                assert(NumberDefined.number226(_1._1._2._2._2_th))(equalTo(NumberDefined.item134))
            }
             , 
            test("ztuple3 with 226 should fetch the index 135") {
                assert(NumberDefined.number226(_1._2._0._0._0_th))(equalTo(NumberDefined.item135))
            }
             , 
            test("ztuple3 with 226 should fetch the index 136") {
                assert(NumberDefined.number226(_1._2._0._0._1_th))(equalTo(NumberDefined.item136))
            }
             , 
            test("ztuple3 with 226 should fetch the index 137") {
                assert(NumberDefined.number226(_1._2._0._0._2_th))(equalTo(NumberDefined.item137))
            }
             , 
            test("ztuple3 with 226 should fetch the index 138") {
                assert(NumberDefined.number226(_1._2._0._1._0_th))(equalTo(NumberDefined.item138))
            }
             , 
            test("ztuple3 with 226 should fetch the index 139") {
                assert(NumberDefined.number226(_1._2._0._1._1_th))(equalTo(NumberDefined.item139))
            }
             , 
            test("ztuple3 with 226 should fetch the index 140") {
                assert(NumberDefined.number226(_1._2._0._1._2_th))(equalTo(NumberDefined.item140))
            }
             , 
            test("ztuple3 with 226 should fetch the index 141") {
                assert(NumberDefined.number226(_1._2._0._2._0_th))(equalTo(NumberDefined.item141))
            }
             , 
            test("ztuple3 with 226 should fetch the index 142") {
                assert(NumberDefined.number226(_1._2._0._2._1_th))(equalTo(NumberDefined.item142))
            }
             , 
            test("ztuple3 with 226 should fetch the index 143") {
                assert(NumberDefined.number226(_1._2._0._2._2_th))(equalTo(NumberDefined.item143))
            }
             , 
            test("ztuple3 with 226 should fetch the index 144") {
                assert(NumberDefined.number226(_1._2._1._0._0_th))(equalTo(NumberDefined.item144))
            }
             , 
            test("ztuple3 with 226 should fetch the index 145") {
                assert(NumberDefined.number226(_1._2._1._0._1_th))(equalTo(NumberDefined.item145))
            }
             , 
            test("ztuple3 with 226 should fetch the index 146") {
                assert(NumberDefined.number226(_1._2._1._0._2_th))(equalTo(NumberDefined.item146))
            }
             , 
            test("ztuple3 with 226 should fetch the index 147") {
                assert(NumberDefined.number226(_1._2._1._1._0_th))(equalTo(NumberDefined.item147))
            }
             , 
            test("ztuple3 with 226 should fetch the index 148") {
                assert(NumberDefined.number226(_1._2._1._1._1_th))(equalTo(NumberDefined.item148))
            }
             , 
            test("ztuple3 with 226 should fetch the index 149") {
                assert(NumberDefined.number226(_1._2._1._1._2_th))(equalTo(NumberDefined.item149))
            }
             , 
            test("ztuple3 with 226 should fetch the index 150") {
                assert(NumberDefined.number226(_1._2._1._2._0_th))(equalTo(NumberDefined.item150))
            }
             , 
            test("ztuple3 with 226 should fetch the index 151") {
                assert(NumberDefined.number226(_1._2._1._2._1_th))(equalTo(NumberDefined.item151))
            }
             , 
            test("ztuple3 with 226 should fetch the index 152") {
                assert(NumberDefined.number226(_1._2._1._2._2_th))(equalTo(NumberDefined.item152))
            }
             , 
            test("ztuple3 with 226 should fetch the index 153") {
                assert(NumberDefined.number226(_1._2._2._0._0_th))(equalTo(NumberDefined.item153))
            }
             , 
            test("ztuple3 with 226 should fetch the index 154") {
                assert(NumberDefined.number226(_1._2._2._0._1_th))(equalTo(NumberDefined.item154))
            }
             , 
            test("ztuple3 with 226 should fetch the index 155") {
                assert(NumberDefined.number226(_1._2._2._0._2_th))(equalTo(NumberDefined.item155))
            }
             , 
            test("ztuple3 with 226 should fetch the index 156") {
                assert(NumberDefined.number226(_1._2._2._1._0_th))(equalTo(NumberDefined.item156))
            }
             , 
            test("ztuple3 with 226 should fetch the index 157") {
                assert(NumberDefined.number226(_1._2._2._1._1_th))(equalTo(NumberDefined.item157))
            }
             , 
            test("ztuple3 with 226 should fetch the index 158") {
                assert(NumberDefined.number226(_1._2._2._1._2_th))(equalTo(NumberDefined.item158))
            }
             , 
            test("ztuple3 with 226 should fetch the index 159") {
                assert(NumberDefined.number226(_1._2._2._2._0_th))(equalTo(NumberDefined.item159))
            }
             , 
            test("ztuple3 with 226 should fetch the index 160") {
                assert(NumberDefined.number226(_1._2._2._2._1_th))(equalTo(NumberDefined.item160))
            }
             , 
            test("ztuple3 with 226 should fetch the index 161") {
                assert(NumberDefined.number226(_1._2._2._2._2_th))(equalTo(NumberDefined.item161))
            }
             , 
            test("ztuple3 with 226 should fetch the index 162") {
                assert(NumberDefined.number226(_2._0._0._0._0_th))(equalTo(NumberDefined.item162))
            }
             , 
            test("ztuple3 with 226 should fetch the index 163") {
                assert(NumberDefined.number226(_2._0._0._0._1_th))(equalTo(NumberDefined.item163))
            }
             , 
            test("ztuple3 with 226 should fetch the index 164") {
                assert(NumberDefined.number226(_2._0._0._0._2_th))(equalTo(NumberDefined.item164))
            }
             , 
            test("ztuple3 with 226 should fetch the index 165") {
                assert(NumberDefined.number226(_2._0._0._1._0_th))(equalTo(NumberDefined.item165))
            }
             , 
            test("ztuple3 with 226 should fetch the index 166") {
                assert(NumberDefined.number226(_2._0._0._1._1_th))(equalTo(NumberDefined.item166))
            }
             , 
            test("ztuple3 with 226 should fetch the index 167") {
                assert(NumberDefined.number226(_2._0._0._1._2_th))(equalTo(NumberDefined.item167))
            }
             , 
            test("ztuple3 with 226 should fetch the index 168") {
                assert(NumberDefined.number226(_2._0._0._2._0_th))(equalTo(NumberDefined.item168))
            }
             , 
            test("ztuple3 with 226 should fetch the index 169") {
                assert(NumberDefined.number226(_2._0._0._2._1_th))(equalTo(NumberDefined.item169))
            }
             , 
            test("ztuple3 with 226 should fetch the index 170") {
                assert(NumberDefined.number226(_2._0._0._2._2_th))(equalTo(NumberDefined.item170))
            }
             , 
            test("ztuple3 with 226 should fetch the index 171") {
                assert(NumberDefined.number226(_2._0._1._0._0_th))(equalTo(NumberDefined.item171))
            }
             , 
            test("ztuple3 with 226 should fetch the index 172") {
                assert(NumberDefined.number226(_2._0._1._0._1_th))(equalTo(NumberDefined.item172))
            }
             , 
            test("ztuple3 with 226 should fetch the index 173") {
                assert(NumberDefined.number226(_2._0._1._0._2_th))(equalTo(NumberDefined.item173))
            }
             , 
            test("ztuple3 with 226 should fetch the index 174") {
                assert(NumberDefined.number226(_2._0._1._1._0_th))(equalTo(NumberDefined.item174))
            }
             , 
            test("ztuple3 with 226 should fetch the index 175") {
                assert(NumberDefined.number226(_2._0._1._1._1_th))(equalTo(NumberDefined.item175))
            }
             , 
            test("ztuple3 with 226 should fetch the index 176") {
                assert(NumberDefined.number226(_2._0._1._1._2_th))(equalTo(NumberDefined.item176))
            }
             , 
            test("ztuple3 with 226 should fetch the index 177") {
                assert(NumberDefined.number226(_2._0._1._2._0_th))(equalTo(NumberDefined.item177))
            }
             , 
            test("ztuple3 with 226 should fetch the index 178") {
                assert(NumberDefined.number226(_2._0._1._2._1_th))(equalTo(NumberDefined.item178))
            }
             , 
            test("ztuple3 with 226 should fetch the index 179") {
                assert(NumberDefined.number226(_2._0._1._2._2_th))(equalTo(NumberDefined.item179))
            }
             , 
            test("ztuple3 with 226 should fetch the index 180") {
                assert(NumberDefined.number226(_2._0._2._0._0_th))(equalTo(NumberDefined.item180))
            }
             , 
            test("ztuple3 with 226 should fetch the index 181") {
                assert(NumberDefined.number226(_2._0._2._0._1_th))(equalTo(NumberDefined.item181))
            }
             , 
            test("ztuple3 with 226 should fetch the index 182") {
                assert(NumberDefined.number226(_2._0._2._0._2_th))(equalTo(NumberDefined.item182))
            }
             , 
            test("ztuple3 with 226 should fetch the index 183") {
                assert(NumberDefined.number226(_2._0._2._1._0_th))(equalTo(NumberDefined.item183))
            }
             , 
            test("ztuple3 with 226 should fetch the index 184") {
                assert(NumberDefined.number226(_2._0._2._1._1_th))(equalTo(NumberDefined.item184))
            }
             , 
            test("ztuple3 with 226 should fetch the index 185") {
                assert(NumberDefined.number226(_2._0._2._1._2_th))(equalTo(NumberDefined.item185))
            }
             , 
            test("ztuple3 with 226 should fetch the index 186") {
                assert(NumberDefined.number226(_2._0._2._2._0_th))(equalTo(NumberDefined.item186))
            }
             , 
            test("ztuple3 with 226 should fetch the index 187") {
                assert(NumberDefined.number226(_2._0._2._2._1_th))(equalTo(NumberDefined.item187))
            }
             , 
            test("ztuple3 with 226 should fetch the index 188") {
                assert(NumberDefined.number226(_2._0._2._2._2_th))(equalTo(NumberDefined.item188))
            }
             , 
            test("ztuple3 with 226 should fetch the index 189") {
                assert(NumberDefined.number226(_2._1._0._0._0_th))(equalTo(NumberDefined.item189))
            }
             , 
            test("ztuple3 with 226 should fetch the index 190") {
                assert(NumberDefined.number226(_2._1._0._0._1_th))(equalTo(NumberDefined.item190))
            }
             , 
            test("ztuple3 with 226 should fetch the index 191") {
                assert(NumberDefined.number226(_2._1._0._0._2_th))(equalTo(NumberDefined.item191))
            }
             , 
            test("ztuple3 with 226 should fetch the index 192") {
                assert(NumberDefined.number226(_2._1._0._1._0_th))(equalTo(NumberDefined.item192))
            }
             , 
            test("ztuple3 with 226 should fetch the index 193") {
                assert(NumberDefined.number226(_2._1._0._1._1_th))(equalTo(NumberDefined.item193))
            }
             , 
            test("ztuple3 with 226 should fetch the index 194") {
                assert(NumberDefined.number226(_2._1._0._1._2_th))(equalTo(NumberDefined.item194))
            }
             , 
            test("ztuple3 with 226 should fetch the index 195") {
                assert(NumberDefined.number226(_2._1._0._2._0_th))(equalTo(NumberDefined.item195))
            }
             , 
            test("ztuple3 with 226 should fetch the index 196") {
                assert(NumberDefined.number226(_2._1._0._2._1_th))(equalTo(NumberDefined.item196))
            }
             , 
            test("ztuple3 with 226 should fetch the index 197") {
                assert(NumberDefined.number226(_2._1._0._2._2_th))(equalTo(NumberDefined.item197))
            }
             , 
            test("ztuple3 with 226 should fetch the index 198") {
                assert(NumberDefined.number226(_2._1._1._0._0_th))(equalTo(NumberDefined.item198))
            }
             , 
            test("ztuple3 with 226 should fetch the index 199") {
                assert(NumberDefined.number226(_2._1._1._0._1_th))(equalTo(NumberDefined.item199))
            }
             , 
            test("ztuple3 with 226 should fetch the index 200") {
                assert(NumberDefined.number226(_2._1._1._0._2_th))(equalTo(NumberDefined.item200))
            }
             , 
            test("ztuple3 with 226 should fetch the index 201") {
                assert(NumberDefined.number226(_2._1._1._1._0_th))(equalTo(NumberDefined.item201))
            }
             , 
            test("ztuple3 with 226 should fetch the index 202") {
                assert(NumberDefined.number226(_2._1._1._1._1_th))(equalTo(NumberDefined.item202))
            }
             , 
            test("ztuple3 with 226 should fetch the index 203") {
                assert(NumberDefined.number226(_2._1._1._1._2_th))(equalTo(NumberDefined.item203))
            }
             , 
            test("ztuple3 with 226 should fetch the index 204") {
                assert(NumberDefined.number226(_2._1._1._2._0_th))(equalTo(NumberDefined.item204))
            }
             , 
            test("ztuple3 with 226 should fetch the index 205") {
                assert(NumberDefined.number226(_2._1._1._2._1_th))(equalTo(NumberDefined.item205))
            }
             , 
            test("ztuple3 with 226 should fetch the index 206") {
                assert(NumberDefined.number226(_2._1._1._2._2_th))(equalTo(NumberDefined.item206))
            }
             , 
            test("ztuple3 with 226 should fetch the index 207") {
                assert(NumberDefined.number226(_2._1._2._0._0_th))(equalTo(NumberDefined.item207))
            }
             , 
            test("ztuple3 with 226 should fetch the index 208") {
                assert(NumberDefined.number226(_2._1._2._0._1_th))(equalTo(NumberDefined.item208))
            }
             , 
            test("ztuple3 with 226 should fetch the index 209") {
                assert(NumberDefined.number226(_2._1._2._0._2_th))(equalTo(NumberDefined.item209))
            }
             , 
            test("ztuple3 with 226 should fetch the index 210") {
                assert(NumberDefined.number226(_2._1._2._1._0_th))(equalTo(NumberDefined.item210))
            }
             , 
            test("ztuple3 with 226 should fetch the index 211") {
                assert(NumberDefined.number226(_2._1._2._1._1_th))(equalTo(NumberDefined.item211))
            }
             , 
            test("ztuple3 with 226 should fetch the index 212") {
                assert(NumberDefined.number226(_2._1._2._1._2_th))(equalTo(NumberDefined.item212))
            }
             , 
            test("ztuple3 with 226 should fetch the index 213") {
                assert(NumberDefined.number226(_2._1._2._2._0_th))(equalTo(NumberDefined.item213))
            }
             , 
            test("ztuple3 with 226 should fetch the index 214") {
                assert(NumberDefined.number226(_2._1._2._2._1_th))(equalTo(NumberDefined.item214))
            }
             , 
            test("ztuple3 with 226 should fetch the index 215") {
                assert(NumberDefined.number226(_2._1._2._2._2_th))(equalTo(NumberDefined.item215))
            }
             , 
            test("ztuple3 with 226 should fetch the index 216") {
                assert(NumberDefined.number226(_2._2._0._0._0_th))(equalTo(NumberDefined.item216))
            }
             , 
            test("ztuple3 with 226 should fetch the index 217") {
                assert(NumberDefined.number226(_2._2._0._0._1_th))(equalTo(NumberDefined.item217))
            }
             , 
            test("ztuple3 with 226 should fetch the index 218") {
                assert(NumberDefined.number226(_2._2._0._0._2_th))(equalTo(NumberDefined.item218))
            }
             , 
            test("ztuple3 with 226 should fetch the index 219") {
                assert(NumberDefined.number226(_2._2._0._1._0_th))(equalTo(NumberDefined.item219))
            }
             , 
            test("ztuple3 with 226 should fetch the index 220") {
                assert(NumberDefined.number226(_2._2._0._1._1_th))(equalTo(NumberDefined.item220))
            }
             , 
            test("ztuple3 with 226 should fetch the index 221") {
                assert(NumberDefined.number226(_2._2._0._1._2_th))(equalTo(NumberDefined.item221))
            }
             , 
            test("ztuple3 with 226 should fetch the index 222") {
                assert(NumberDefined.number226(_2._2._0._2._0_th))(equalTo(NumberDefined.item222))
            }
             , 
            test("ztuple3 with 226 should fetch the index 223") {
                assert(NumberDefined.number226(_2._2._0._2._1_th))(equalTo(NumberDefined.item223))
            }
             , 
            test("ztuple3 with 226 should fetch the index 224") {
                assert(NumberDefined.number226(_2._2._0._2._2_th))(equalTo(NumberDefined.item224))
            }
             , 
            test("ztuple3 with 226 should fetch the index 225") {
                assert(NumberDefined.number226(_2._2._1._0._0_th))(equalTo(NumberDefined.item225))
            }
             , 
            test("ztuple3 with 226 should fetch the index 226") {
                assert(NumberDefined.number226(_2._2._1._0._1_th))(equalTo(NumberDefined.item226))
            }
    )
}
