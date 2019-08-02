package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P12Test extends FunSuite with Matchers {

  val inputList = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))

  test("decode()") {
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P12.decode(inputList) shouldBe (expected)
  }

  test("decodeFunctional()") {
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P12.decodeFunctional(inputList) shouldBe (expected)
  }
}
