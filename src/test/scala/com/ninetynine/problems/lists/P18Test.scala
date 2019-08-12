package com.ninetynine.problems.lists

import org.scalatest.{FunSuite, Matchers}

class P18Test extends FunSuite with Matchers {

  val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  test("slice() from = 3 to = 7") {
    val expected = List('d, 'e, 'f, 'g)
    P18.slice(3, 7, inputList) shouldBe (expected)
  }

  test("slice() from = -1 to = 4") {
    val expected = List('a, 'b, 'c, 'd)
    P18.slice(-1, 4, inputList) shouldBe (expected)
  }

  test("slice() to = -3") {
    val expected = Nil
    P18.slice(3, -3, inputList) shouldBe (expected)
  }

  test("sliceFunctional()") {
    val expected = List('d, 'e, 'f, 'g)
    P18.sliceFunctional(3, 7, inputList) shouldBe (expected)
  }

}
