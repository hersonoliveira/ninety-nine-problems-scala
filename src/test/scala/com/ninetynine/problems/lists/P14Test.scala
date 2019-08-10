package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P14Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'c, 'd)

  test("duplicate()") {
    val expected = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    P14.duplicate(inputList) shouldBe expected
  }

}
