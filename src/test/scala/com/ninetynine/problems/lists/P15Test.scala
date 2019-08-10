package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P15Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'c, 'd)

  test("duplicateN()") {
    val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    P15.duplicateN(3, inputList) shouldBe expected
  }

  test("duplicateN2()") {
    val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    P15.duplicateN2(3, inputList) shouldBe expected
  }

}
