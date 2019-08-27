package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P21Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd)

  test("insertAt()") {
    val expected = List('a, 'new, 'b, 'c, 'd)
    P21.insertAt('new, 1, inputList) shouldBe expected
  }
}
