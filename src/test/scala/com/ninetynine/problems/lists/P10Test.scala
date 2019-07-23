package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P10Test extends FunSuite with Matchers {

  val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  test("encode()") {
    val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    P10.encode(inputList) shouldBe (expected)
  }
}
