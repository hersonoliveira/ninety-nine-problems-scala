package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P16Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  test("drop() pos = 3") {
    val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    P16.drop(3, inputList) shouldBe (expected)
  }

  test("drop() pos = 2") {
    val expected = List('a, 'c, 'e, 'g, 'i, 'k)
    P16.drop(2, inputList) shouldBe (expected)
  }

}
