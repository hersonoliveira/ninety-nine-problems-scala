package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P20Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd)

  test("removeAt()") {
    val expected = (List('a, 'c, 'd), 'b)
    P20.removeAt(1, inputList) shouldBe expected
  }
}
