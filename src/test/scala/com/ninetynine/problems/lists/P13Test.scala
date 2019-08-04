package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P13Test extends FunSuite with Matchers {

  val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  test("encodeDirect()") {
    val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    P13.encodeDirect(inputList) shouldBe (expected)
  }
}
